package io.github.aixmi.web.ex;

import io.github.aixmi.web.ex.biz.BizExceptionHandler;
import io.github.aixmi.web.ex.global.GlobalExceptionHandler;
import io.github.aixmi.web.ex.io.IOExceptionCollector;
import io.github.aixmi.web.ex.network.NetworkExceptionCollector;
import io.github.aixmi.web.ex.routing.RoutingExceptionCollector;
import io.github.aixmi.web.ex.validation.ValidationExceptionCollector;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author mcqj
 * @date 2020-12-03 下午 14:01
 */
@RestControllerAdvice
public class WebExceptionCollector implements BizExceptionHandler,
		GlobalExceptionHandler,
		NetworkExceptionCollector,
		IOExceptionCollector,
		RoutingExceptionCollector,
		ValidationExceptionCollector {

}
