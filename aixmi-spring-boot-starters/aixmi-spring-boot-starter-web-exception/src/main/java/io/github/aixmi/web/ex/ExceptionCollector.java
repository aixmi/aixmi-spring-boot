package io.github.aixmi.web.ex;

import io.github.aixmi.web.ex.biz.BizExceptionHandler;
import io.github.aixmi.web.ex.global.GlobalExceptionHandler;
import io.github.aixmi.web.ex.http.MediaTypeNotAcceptableExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author mcqj
 * @date 2020-12-03 下午 14:01
 */
@RestControllerAdvice
public class ExceptionCollector implements BizExceptionHandler,
		GlobalExceptionHandler,
		MediaTypeNotAcceptableExceptionHandler {

}
