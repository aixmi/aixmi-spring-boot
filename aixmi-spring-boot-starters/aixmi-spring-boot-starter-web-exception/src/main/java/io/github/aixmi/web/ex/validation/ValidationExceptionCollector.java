package io.github.aixmi.web.ex.validation;

/**
 * @author mcqj
 * @date 2020-12-04 上午 11:50
 */
public interface ValidationExceptionCollector extends ConstraintViolationExceptionHandler, MethodArgumentNotValidExceptionHandler, BindExceptionHandler {
}
