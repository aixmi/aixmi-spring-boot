package io.github.aixmi.web.ex.validation;


import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.web.ex.IExceptionHandler;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;


public interface MethodArgumentNotValidExceptionHandler extends IExceptionHandler {


	@ExceptionHandler
	default Response handleMethodArgumentNotValid(
			final MethodArgumentNotValidException exception,
			final NativeWebRequest request) {
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		String firstErrorField = fieldErrors.stream().map(e -> e.getField() + ":" + e.getDefaultMessage()).findFirst().orElse("");
		return Response.fail("", "");
	}

}
