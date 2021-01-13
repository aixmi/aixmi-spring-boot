package io.github.aixmi.spring.boot.cache;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author mcqj
 * @date 2021-01-13 上午 10:14
 */
@ConfigurationProperties(prefix = "aixmi.cache")
public class AixmiCacheProperties {

	private CacheTypeEnum type = CacheTypeEnum.MAP_LOCAL;
}
