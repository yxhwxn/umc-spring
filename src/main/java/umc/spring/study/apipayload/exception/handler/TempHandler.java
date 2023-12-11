package umc.spring.study.apipayload.exception.handler;

import umc.spring.study.apipayload.code.BaseErrorCode;
import umc.spring.study.apipayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
