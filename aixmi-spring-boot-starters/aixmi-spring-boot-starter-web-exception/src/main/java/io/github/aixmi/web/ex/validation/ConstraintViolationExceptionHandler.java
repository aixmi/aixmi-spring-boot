package io.github.aixmi.web.ex.validation;

import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public interface ConstraintViolationExceptionHandler extends IExceptionHandler {


	@ExceptionHandler
	default Response handleConstraintViolation(
			final ConstraintViolationException exception,
			final NativeWebRequest request) {

		List<ConstraintViolation<?>> collect = new ArrayList<>(exception.getConstraintViolations());
		ConstraintViolation<?> constraintViolation = collect.get(0);
		String field = constraintViolation.getPropertyPath().toString();
		String value = constraintViolation.getMessage();

		return Responses.fail("", "");
	}


}
