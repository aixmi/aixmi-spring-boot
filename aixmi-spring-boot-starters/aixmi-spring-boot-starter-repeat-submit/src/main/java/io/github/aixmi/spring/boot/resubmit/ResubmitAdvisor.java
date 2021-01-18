package io.github.aixmi.spring.boot.resubmit;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

/**
 * @author xyk
 * @date 2021-01-14 下午 16:39
 */
public class ResubmitAdvisor extends AbstractBeanFactoryPointcutAdvisor {
	@Override
	public Pointcut getPointcut() {
		return null;
	}
}
