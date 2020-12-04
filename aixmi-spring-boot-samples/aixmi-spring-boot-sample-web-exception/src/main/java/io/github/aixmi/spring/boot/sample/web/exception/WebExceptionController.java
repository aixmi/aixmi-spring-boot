package io.github.aixmi.spring.boot.sample.web.exception;

import io.github.aixmi.common.exception.BizException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartException;

/**
 * @author mcqj
 * @date 2020-12-03 下午 16:27
 */
@RestController
@RequestMapping("/ex")
public class WebExceptionController {

	@GetMapping("/biz")
	public void bizEx() {
		throw new BizException("11");
	}

	@GetMapping(value = "/type")
	public void mediaNotAcceptEx(String type) throws HttpMediaTypeNotAcceptableException {
		throw new HttpMediaTypeNotAcceptableException("");
	}

	@GetMapping(value = "/type1")
	public void mediaNotAcceptEx1(String type) {
		throw new MultipartException("");
	}
}
