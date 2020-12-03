package io.github.aixmi.web.ex.global;

import io.github.aixmi.common.exception.DefaultErrorCode;
import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;

public interface GlobalExceptionHandler extends IExceptionHandler {

	@ExceptionHandler
	default Response handleGlobalException(
			final Throwable e,
			final NativeWebRequest request) {
		return Responses.fail(DefaultErrorCode.SYS_EX.getCode(), DefaultErrorCode.SYS_EX.getMsg());
	}

}
