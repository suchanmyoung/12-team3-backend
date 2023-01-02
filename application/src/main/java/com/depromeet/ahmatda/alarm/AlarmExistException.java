package com.depromeet.ahmatda.alarm;

import com.depromeet.ahmatda.common.response.ErrorCode;
import com.depromeet.ahmatda.exception.BusinessException;

public class AlarmExistException extends BusinessException {
    public AlarmExistException(ErrorCode status) {
        super(status);
    }
}
