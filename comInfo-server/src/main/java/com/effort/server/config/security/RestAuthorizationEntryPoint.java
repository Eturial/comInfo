//package com.effort.server.config.security;
//
//import com.effort.server.pojo.RespBean;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
///**
// * 当未登录或者token失效时，访问接口时，自定义的返回结果
// *
// * @author 86137
// * @since 1.0.0
// */
//@Component
//public class RestAuthorizationEntryPoint implements AuthenticationEntryPoint {
//
//    @Override
//    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("application/json");
//        PrintWriter out = response.getWriter();
//        RespBean bean = RespBean.error("权限不足，请联系管理员！");
//        bean.setCode(401);
//        out.write(new ObjectMapper().writeValueAsString(bean));
//        out.flush();
//        out.close();
//    }
//}
