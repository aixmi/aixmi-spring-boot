package io.github.aixmi.web.ex;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication.Type.SERVLET;

/**
 * @author mcqj
 * @date 2020-12-03 下午 14:00
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnWebApplication(type = SERVLET)
public class WebExceptionAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean(WebExceptionCollector.class)
	public WebExceptionCollector webExceptionHandling() {
		return new WebExceptionCollector();
	}
}
