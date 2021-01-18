package io.github.aixmi.spring.boot.resubmit;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author xyk
 * @date 2021-01-14 下午 16:48
 */
public class ResubmitInterceptor implements MethodInterceptor, ApplicationContextAware {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		return null;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}
}
