package io.github.aixmi.web.ex.routing;


import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import static io.github.aixmi.web.ex.WebExceptionErrorCode.NO_HANDLER_FOUND_EX;


public interface NoHandlerFoundExceptionHandler extends IExceptionHandler {

	@ExceptionHandler
	default Response handleNoHandlerFound(
			final NoHandlerFoundException exception,
			final NativeWebRequest request) {
		return Responses.fail(NO_HANDLER_FOUND_EX.getCode(), NO_HANDLER_FOUND_EX.getMsg());
	}

}
