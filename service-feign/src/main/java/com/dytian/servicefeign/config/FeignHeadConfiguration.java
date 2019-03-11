package com.dytian.servicefeign.config;

import feign.RequestInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Configuration
public class FeignHeadConfiguration {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
 
    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            if (attrs != null) {
                HttpServletRequest request = attrs.getRequest();
                // 如果在Cookie内通过如下方式取
//                Cookie[] cookies = request.getCookies();
////                if (cookies != null && cookies.length > 0) {
////                    for (Cookie cookie : cookies) {
////                        requestTemplate.header(cookie.getName(), cookie.getValue());
////                    }
////                } else {
////                    logger.warn("FeignHeadConfiguration", "获取Cookie失败！");
////                }
                // 如果放在header内通过如下方式取
                Enumeration<String> headerNames = request.getHeaderNames();
                if (headerNames != null) {
                    while (headerNames.hasMoreElements()) {
                        String name = headerNames.nextElement();
                        String value = request.getHeader(name);
                        logger.debug("namess==========="+name);
                        logger.debug("namess==========="+value);

                       //   遍历请求头里面的属性字段，将jsessionid添加到新的请求头中转发到下游服务

                        if ("Authorization".equalsIgnoreCase(name) || "Content-type".equalsIgnoreCase(name)) {
                            logger.debug("添加自定义请求头key:" + name + ",value:" + value);
                            requestTemplate.header(name, value);
                        } else {
                            logger.debug("FeignHeadConfiguration", "非自定义请求头key:" + name + ",value:" + value + "不需要添加!");
                        }
                    }
                } else {
                    logger.warn("FeignHeadConfiguration", "获取请求头失败！");
                }
            }
        };
    }
}
