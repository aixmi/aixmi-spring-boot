//package io.github.aixmi.web.ex.routing;
//
//import io.github.aixmi.common.web.dto.Response;
//import io.github.aixmi.web.ex.IExceptionHandler;
//import org.springframework.web.bind.ServletRequestBindingException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.NativeWebRequest;
//
//
//public interface ServletRequestBindingExceptionHandler extends IExceptionHandler {
//
//
//    @ExceptionHandler
//    default Response handleServletRequestBinding(
//            final ServletRequestBindingException exception,
//            final NativeWebRequest request) {
//		return Response.fail();
//    }
//
//}
