package io.github.aixmi.web.ex.biz;

import io.github.aixmi.common.exception.BizException;
import io.github.aixmi.common.exception.DefaultErrorCode;
import io.github.aixmi.common.web.dto.Response;
import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.web.ex.IExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;


/**
 * @author mcqj
 * @date 2020-12-03 下午 14:05
 */
public interface BizExceptionHandler extends IExceptionHandler {

	@ExceptionHandler()
	default Response handleBizException(
			final BizException e,
			final NativeWebRequest request) {
		return Responses.fail(DefaultErrorCode.BIZ_EX.getCode(), DefaultErrorCode.BIZ_EX.getMsg());
	}


}
