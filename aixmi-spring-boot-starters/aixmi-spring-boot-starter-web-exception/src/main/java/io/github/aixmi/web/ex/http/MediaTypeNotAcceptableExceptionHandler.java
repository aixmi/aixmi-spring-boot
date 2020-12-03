package io.github.aixmi.web.ex.http;

import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;

import static io.github.aixmi.web.ex.WebExceptionErrorCode.MEDIA_NOT_SUPPORT_EX;


public interface MediaTypeNotAcceptableExceptionHandler extends IExceptionHandler {


	@ExceptionHandler
	default Response handleMediaTypeNotAcceptableException(HttpMediaTypeNotAcceptableException e, NativeWebRequest request) {
		return Responses.fail(MEDIA_NOT_SUPPORT_EX.getCode(), MEDIA_NOT_SUPPORT_EX.getMsg());
	}

}
