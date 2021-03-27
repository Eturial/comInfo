//package com.effort.server.config.security;
//
//import com.effort.server.pojo.User;
//import com.effort.server.service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
///**
// * Security 配置类
// *
// * @author 86137
// * @since 1.0.0
// */
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private IUserService userService;
//    @Autowired
//    private RestAuthorizationEntryPoint restAuthorizationEntryPoint;
//    @Autowired
//    private RestfulAccessDeniedHandler restfulAccessDeniedHandler;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
////        web.ignoring().antMatchers(HttpMethod.GET);
//        web.ignoring().antMatchers(HttpMethod.GET,
//                "/*",
//                "/css/**",
//                "/js/**",
//                "/index.html",
//                "favicon.ico",
//                "/doc.html",
//                "/webjars/**",
//                "/swagger-resources/**",
//                "/v2/api-docs/**"
//        );
//        web.ignoring().antMatchers(HttpMethod.POST,
//                "/login","/register"
//        );
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.csrf()
//                .disable()
//                // 基于token 不需要 session
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                // 禁用缓存
//                .headers()
//                .cacheControl();
//        // 添加jwt 登录授权过滤器
//        http.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
//        http.exceptionHandling()
//                .accessDeniedHandler(restfulAccessDeniedHandler)
//                .authenticationEntryPoint(restAuthorizationEntryPoint);
//
//    }
//
//    @Override
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return username -> {
//            User user = userService.getUserByUsername(username);
//            if(null != user) {
//                return  user;
//            }
//            return null;
//        };
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() {
//        return new JwtAuthenticationTokenFilter();
//    }
//
//}
