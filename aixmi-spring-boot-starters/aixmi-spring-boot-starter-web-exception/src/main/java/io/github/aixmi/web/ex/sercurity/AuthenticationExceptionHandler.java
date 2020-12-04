//package io.github.aixmi.web.ex.sercurity;
//
//
//import io.github.aixmi.common.web.dto.Response;
//import io.github.aixmi.web.ex.IExceptionHandler;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.NativeWebRequest;
//
//
//public interface AuthenticationExceptionHandler extends IExceptionHandler {
//
//
//    @ExceptionHandler
//    default Response handleAuthentication(final AuthenticationException e,
//										  final NativeWebRequest request) {
//        return createFailResult(e, ResultCode.UNAUTHORIZED, request);
//    }
//
//}
