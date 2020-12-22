package io.github.aixmi.spring.boot.swagger;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@ConditionalOnClass(Docket.class)
@EnableKnife4j
@EnableSwagger2WebMvc
public class SwaggerAutoConfiguration {
	@Value("${spring.application.name}")
	private String applicationName;

	@Bean
	@ConditionalOnMissingBean
	public Docket docket() {
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title(applicationName)
				.version("1.0")
				.build();
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo)
				.select()
				.paths(o -> o != null && !o.contains("/error") && !o.contains("/actuator"))
				.build();
	}

}
