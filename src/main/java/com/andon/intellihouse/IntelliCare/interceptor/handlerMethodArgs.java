package com.andon.intellihouse.IntelliCare.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.andon.intellihouse.IntelliCare.annontation.IntelliCareStandard;
import com.andon.intellihouse.IntelliCare.entity.dto.request.test;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Member;

/**
 * @author by yangzhi
 * @date 2018.09.10 15:49
 * @Moode o_O
 * 此类为适配之前content-type为www.urlencoded而创建，不想每次让业务层代码去解析content中的内容
 **/
public class handlerMethodArgs implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        if(methodParameter.hasMethodAnnotation(IntelliCareStandard.class))
        {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        HttpServletRequest request =(HttpServletRequest)nativeWebRequest.getNativeRequest();
        String contentType = request.getContentType();
        String jsonStr =request.getParameter("content");
        Class<?> classtype =methodParameter.getParameterType();
        return JSONObject.parseObject(jsonStr,classtype);
    }
}
