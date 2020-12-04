package io.github.aixmi.web.ex.routing;


import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import io.github.aixmi.web.ex.WebExceptionErrorCode;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;


public interface MissingServletRequestParameterExceptionHandler extends IExceptionHandler {

	@ExceptionHandler
	default Response handleMissingServletRequestParameter(
			final MissingServletRequestParameterException e,
			final NativeWebRequest request) {
		return Responses.fail(WebExceptionErrorCode.MISSING_SERVLET_PARAM_EX.getCode(),
				WebExceptionErrorCode.MISSING_SERVLET_PARAM_EX.getMsg());
	}

}
