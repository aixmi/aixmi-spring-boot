package io.github.aixmi.web.ex;

import io.github.aixmi.common.exception.I18nErrorCode;
import lombok.AllArgsConstructor;

/**
 * @author mcqj
 * @date 2020-12-03 下午 14:48
 */
@AllArgsConstructor
public enum WebExceptionErrorCode implements I18nErrorCode {
	//客户端传参异常
	MEDIA_NOT_SUPPORT_EX("4001", "", "不支持的媒体类型"),
	MEDIA_NOT_ACCEPT_EX("4002", "", "不支持的请求"),
	METHOD_NOT_ALLOWED_EX("4003", "", "不支持的请求方式"),
	HTTP_MSG_NOT_READABLE("4004", "", "请求内容转换失败"),
	MULTIPART_EX("4005", "", "文件上传失败"),
	TYPE_MISMATCH_EX("4005", "", "字段类型有误"),
	MISSING_SERVLET_PARAM_EX("4006", "", "MISSING SERVLET PARAM"),
	MISSING_SERVLET_REQUEST_PART_EX("4007", "", "MISSING SERVLET REQUEST PART"),
	NO_HANDLER_FOUND_EX("4008", "", "请求路径有误"),


	//服务端错误
	SOCKET_TIME_OUT_EX("5001", "", "网络繁忙请稍后再试"),
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
