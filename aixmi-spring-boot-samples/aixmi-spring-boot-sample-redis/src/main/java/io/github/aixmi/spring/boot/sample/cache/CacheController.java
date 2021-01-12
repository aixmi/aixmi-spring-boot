package io.github.aixmi.spring.boot.sample.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mcqj
 * @date 2021-01-12 下午 17:46
 */
@RestController
@RequestMapping("/cache")
public class CacheController {
	@Autowired
	private CacheService cacheService;

	@GetMapping("/cache")
	public String getCache() {
		return "";
	}
}
