package io.github.aixmi.web.ex.network;

import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;

import java.net.SocketTimeoutException;

import static io.github.aixmi.web.ex.WebExceptionErrorCode.SOCKET_TIME_OUT_EX;


public interface SocketTimeoutExceptionHandler extends IExceptionHandler {


	@ExceptionHandler
	default Response handleSocketTimeout(
			final SocketTimeoutException exception,
			final NativeWebRequest request) {
		return Responses.fail(SOCKET_TIME_OUT_EX.getCode(), SOCKET_TIME_OUT_EX.getMsg());
	}

}
