package com.andon.intellihouse.IntelliCare.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author by yangzhi
 * @date 2018.09.10 15:14
 * @Moode o_O
 **/
public abstract class BaseController<T> {
    public BaseController(HttpServletRequest request, HttpServletResponse response)
    {
        String jsonStr = request.getParameter("content");
        T data= JSONObject.parseObject(jsonStr, new TypeReference<T>(){});
        this.execute(data);
    }
    protected abstract void execute(T data);
}
