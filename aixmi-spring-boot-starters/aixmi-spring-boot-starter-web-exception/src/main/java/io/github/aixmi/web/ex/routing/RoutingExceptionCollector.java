package io.github.aixmi.web.ex.routing;

/**
 * @author mcqj
 * @date 2020-12-04 上午 10:34
 */
public interface RoutingExceptionCollector extends MissingServletRequestParameterExceptionHandler,
		MissingServletRequestPartExceptionHandler,
		NoHandlerFoundExceptionHandler {
}
