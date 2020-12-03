package io.github.aixmi.web.ex;

import io.github.aixmi.common.exception.I18nErrorCode;
import lombok.AllArgsConstructor;

/**
 * @author mcqj
 * @date 2020-12-03 下午 14:48
 */
@AllArgsConstructor
public enum WebExceptionErrorCode implements I18nErrorCode {
	//
	MEDIA_NOT_SUPPORT_EX("4001", "", "不支持的媒体类型"),
	MEDIA_NOT_ACCEPT_EX("4002", "", "不支持的请求"),
	METHOD_NOT_ALLOWED_EX("4003", "", "不支持的请求方式"),
	;

	private final String code;
	private final String i18nCode;
	private final String msg;


	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getMsg() {
		return msg;
	}

	@Override
	public String getI18nCode() {
		return i18nCode;
	}
}
