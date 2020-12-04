package io.github.aixmi.web.ex.io;

import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import io.github.aixmi.web.ex.WebExceptionErrorCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartException;


public interface MultipartExceptionHandler extends IExceptionHandler {

	@ExceptionHandler
	default Response handleMultipart(
			final MultipartException exception,
			final NativeWebRequest request) {
		return Responses.fail(WebExceptionErrorCode.MULTIPART_EX.getCode(), WebExceptionErrorCode.MULTIPART_EX.getMsg());
	}

}
