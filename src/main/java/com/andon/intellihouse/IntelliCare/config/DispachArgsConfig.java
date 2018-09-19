package com.andon.intellihouse.IntelliCare.config;

import com.andon.intellihouse.IntelliCare.interceptor.handlerMethodArgs;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * @author by yangzhi
 * @date 2018.09.10 16:22
 * @Moode o_O
 **/
@Configuration
public class DispachArgsConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        argumentResolvers.add(new handlerMethodArgs());
    }
}
