package org.prgrms.kdtspringdemo.voucher.constant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.prgrms.kdtspringdemo.voucher.exception.VoucherExceptionMessage.*;

public enum VoucherCommand {
    CREATE,
    FIND_ID,
    FIND_ALL,
    UPDATE,
    DELETE
    ;

    private static final Logger logger = LoggerFactory.getLogger(VoucherCommand.class);

    public static VoucherCommand findVoucherCommand(String userCommand) {
        return Arrays.stream(VoucherCommand.values())
                .filter(voucherSymbol -> voucherSymbol.name().equals(userCommand.toUpperCase()))
                .findFirst()
                .orElseThrow(() -> {
                    logger.error("원인 : {} -> 에러 메시지 : {}", userCommand, NOT_FOUND_VOUCHER_COMMAND_TYPE.getMessage());
                    throw new IllegalArgumentException(NOT_FOUND_VOUCHER_COMMAND_TYPE.getMessage());
                });
    }
}
