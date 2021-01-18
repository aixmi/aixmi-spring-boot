package io.github.aixmi.spring.boot.resubmit;

import jdk.nashorn.api.scripting.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * @author xyk
 * @date 2021-01-14 下午 16:38
 */
public class ResubmitPointcut extends StaticMethodMatcherPointcut implements ClassFilter {
	@Override
	public boolean exposeToScripts(String s) {
		return false;
	}

	@Override
	public boolean matches(Method method, Class<?> aClass) {
		return false;
	}
}
