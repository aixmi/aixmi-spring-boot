package io.github.aixmi.web.ex.io;

import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import io.github.aixmi.web.ex.WebExceptionErrorCode;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;


public interface MessageNotReadableExceptionHandler extends IExceptionHandler {

	@ExceptionHandler
	default Response handleMessageNotReadableException(
			final HttpMessageNotReadableException e,
			final NativeWebRequest request) {
		return Responses.fail(WebExceptionErrorCode.HTTP_MSG_NOT_READABLE.getCode(), WebExceptionErrorCode.METHOD_NOT_ALLOWED_EX.getMsg());
	}

}
