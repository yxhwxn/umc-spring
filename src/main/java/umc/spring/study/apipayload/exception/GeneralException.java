package umc.spring.study.apipayload.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import umc.spring.study.apipayload.code.BaseErrorCode;
import umc.spring.study.apipayload.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus() {
        return this.code.getReasonHttpStatus();
    }
}
