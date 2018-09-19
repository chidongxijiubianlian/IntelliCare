package com.andon.intellihouse.IntelliCare.controller;

import com.andon.intellihouse.IntelliCare.annontation.IntelliCareStandard;
import com.andon.intellihouse.IntelliCare.dao.ItestService;
import com.andon.intellihouse.IntelliCare.entity.dto.request.test;
import com.andon.intellihouse.IntelliCare.entity.po.TestDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author by yangzhi
 * @date 2018.09.10 11:20
 * @Moode o_O
 **/
@RestController
public class TestController{
    @Autowired
    private ItestService itestService;
    @RequestMapping("/test")
    @IntelliCareStandard
    public Object test(test content)
    {
        String name ="0";
        List<TestDevice> list = itestService.getBlueDevice(name);
        return list;
    }
}
