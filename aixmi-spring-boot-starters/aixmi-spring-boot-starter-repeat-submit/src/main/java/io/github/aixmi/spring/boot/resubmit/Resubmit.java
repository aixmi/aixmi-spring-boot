package io.github.aixmi.spring.boot.resubmit;

/**
 * @author xyk
 * @date 2021-01-14 下午 14:43
 */
public @interface Resubmit {


	/**
	 * 默认10s
	 *
	 * @return
	 */
	int durationSeconds() default 10;

	/**
	 * 用来判断是否是重复请求
	 *
	 * @return
	 */
	Class<? extends Identify> identify() default DefaultIdentify.class;

	/**
	 * 默认是单体的应用
	 *
	 * @return
	 */
	ControlType type() default ControlType.MONOLITH;
}
