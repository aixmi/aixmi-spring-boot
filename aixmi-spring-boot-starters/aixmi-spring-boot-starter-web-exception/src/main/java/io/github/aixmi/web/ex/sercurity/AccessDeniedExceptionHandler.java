//package io.github.aixmi.web.ex.sercurity;
//
//
//import io.github.aixmi.common.web.dto.Response;
//import io.github.aixmi.web.ex.IExceptionHandler;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.NativeWebRequest;
//
//import java.nio.file.AccessDeniedException;
//
//
//public interface AccessDeniedExceptionHandler extends IExceptionHandler {
//
//
//    @ExceptionHandler
//    default Response handleAccessDenied(final AccessDeniedException e,
//										final NativeWebRequest request) {
//        return createFailResult(e, ResultCode.ACCESS_DENIED, request);
//    }
//
//}
