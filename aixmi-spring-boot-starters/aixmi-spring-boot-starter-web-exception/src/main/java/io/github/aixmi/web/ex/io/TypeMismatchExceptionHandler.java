package io.github.aixmi.web.ex.io;

import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import io.github.aixmi.web.ex.WebExceptionErrorCode;
import org.springframework.beans.TypeMismatchException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;


public interface TypeMismatchExceptionHandler extends IExceptionHandler {


	@ExceptionHandler
	default Response handleTypeMismatch(
			final TypeMismatchException e,
			final NativeWebRequest request) {
		return Responses.fail(WebExceptionErrorCode.TYPE_MISMATCH_EX.getCode(), WebExceptionErrorCode.TYPE_MISMATCH_EX.getMsg());
	}
}
