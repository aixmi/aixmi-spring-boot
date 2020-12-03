package io.github.aixmi.spring.boot.sample.web.exception;

import io.github.aixmi.common.exception.BizException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping(value = "/a")
	public void mediaNotAcceptEx() {

	}
}
