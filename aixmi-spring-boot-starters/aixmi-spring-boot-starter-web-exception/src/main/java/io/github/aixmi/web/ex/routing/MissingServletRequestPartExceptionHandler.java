package io.github.aixmi.web.ex.routing;

import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

import static io.github.aixmi.web.ex.WebExceptionErrorCode.MISSING_SERVLET_REQUEST_PART_EX;


public interface MissingServletRequestPartExceptionHandler extends IExceptionHandler {


	@ExceptionHandler
	default Response handleMissingServletRequestPart(
			final MissingServletRequestPartException exception,
			final NativeWebRequest request) {
		return Responses.fail(MISSING_SERVLET_REQUEST_PART_EX.getCode(), MISSING_SERVLET_REQUEST_PART_EX.getMsg());
	}

}
