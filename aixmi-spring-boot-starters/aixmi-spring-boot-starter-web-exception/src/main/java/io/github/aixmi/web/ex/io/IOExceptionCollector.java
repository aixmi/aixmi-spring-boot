package io.github.aixmi.web.ex.io;

/**
 * @author mcqj
 * @date 2020-12-04 上午 10:34
 */
public interface IOExceptionCollector extends MessageNotReadableExceptionHandler,
		MultipartExceptionHandler,
		TypeMismatchExceptionHandler {
}
