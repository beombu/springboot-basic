package org.prgrms.kdtspringdemo.voucher.service;

import org.prgrms.kdtspringdemo.voucher.constant.VoucherType;
import org.prgrms.kdtspringdemo.voucher.model.dto.VoucherDto;

import java.util.List;
import java.util.UUID;

public interface VoucherService {
    VoucherDto create(VoucherType userVoucherType, long amount);
    VoucherDto getVoucher(UUID voucherId);

    List<VoucherDto> getAllVoucher();
}
