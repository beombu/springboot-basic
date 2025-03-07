package org.prgrms.kdtspringdemo.voucher.model.entity;

import org.prgrms.kdtspringdemo.voucher.constant.VoucherType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.UUID;

import static org.prgrms.kdtspringdemo.voucher.exception.VoucherExceptionMessage.OUT_OF_RANGE_AMOUNT;

public class PercentAmountVoucher implements Voucher {
    private static final Logger logger = LoggerFactory.getLogger(PercentAmountVoucher.class);
    private static final long MIN_AMOUNT = 0;
    private static final long MAX_AMOUNT = 100;

    private final UUID id;
    private final VoucherType type;
    private final long amount;

    public PercentAmountVoucher(long amount) {
        this.id = UUID.randomUUID();
        this.type = VoucherType.PERCENT;
        this.amount = validateAmount(amount);
    }

    public PercentAmountVoucher(UUID id, long amount) {
        this.id = id;
        this.type = VoucherType.PERCENT;
        this.amount = validateAmount(amount);
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public VoucherType getType() {
        return type;
    }

    @Override
    public long getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PercentAmountVoucher that = (PercentAmountVoucher) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public long executeDiscount(long originPrice) {
        return originPrice * (amount / MAX_AMOUNT);
    }

    @Override
    public long validateAmount(long amount) {
        if (amount <= MIN_AMOUNT || amount > MAX_AMOUNT) {
            logger.warn("원인 : {} -> 에러 메시지 : {}", amount, OUT_OF_RANGE_AMOUNT.getMessage());
            throw new IllegalArgumentException(OUT_OF_RANGE_AMOUNT.getMessage());
        }

        return amount;
    }
}
