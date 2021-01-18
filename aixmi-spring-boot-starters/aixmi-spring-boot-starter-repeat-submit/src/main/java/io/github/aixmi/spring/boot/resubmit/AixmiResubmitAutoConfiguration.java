//package io.github.aixmi.spring.boot.resubmit;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ImportAware;
//import org.springframework.context.annotation.Role;
//import org.springframework.core.annotation.AnnotationAttributes;
//import org.springframework.core.type.AnnotationMetadata;
//
///**
// * @author xyk
// * @date 2021-01-14 下午 14:44
// */
//public class AixmiResubmitAutoConfiguration implements ImportAware, ApplicationContextAware {
//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
////		this.enableMethodCache = AnnotationAttributes.fromMap(
////				importMetadata.getAnnotationAttributes(EnableMethodCache.class.getName(), false));
////		if (this.enableMethodCache == null) {
////			throw new IllegalArgumentException(
////					"@EnableMethodCache is not present on importing class " + importMetadata.getClassName());
////		}
//	}
//
//	@Override
//	public void setImportMetadata(AnnotationMetadata annotationMetadata) {
//
//	}
//
//	@Bean
//	@Role(BeanDefinition.ROLE_INFRASTRUCTURE)
//	public ResubmitAdvisor jetcacheAdvisor(ResubmitInterceptor jetCacheInterceptor) {
//		ResubmitAdvisor advisor = new CacResubmitAdvisorheAdvisor();
//		advisor.setAdviceBeanName(ResubmitAdvisor.CACHE_ADVISOR_BEAN_NAME);
//		advisor.setAdvice(jetCacheInterceptor);
//		advisor.setBasePackages(this.enableMethodCache.getStringArray("basePackages"));
//		advisor.setOrder(this.enableMethodCache.<Integer>getNumber("order"));
//		return advisor;
//	}
//
//	@Bean
//	@Role(BeanDefinition.ROLE_INFRASTRUCTURE)
//	public ResubmitInterceptor resubmitInterceptor() {
//		return new ResubmitInterceptor();
//	}
//
//}
