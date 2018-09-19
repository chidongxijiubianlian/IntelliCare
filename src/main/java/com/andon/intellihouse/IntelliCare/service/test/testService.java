package com.andon.intellihouse.IntelliCare.service.test;

import com.andon.intellihouse.IntelliCare.entity.po.TestDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by yangzhi
 * @date 2018.09.11 16:55
 * @Moode o_O
 **/
@Service
public class testService implements ItestService{
    @Autowired
    private ItestService itestService;
    public List<TestDevice> getBlueDevice() {
        List<TestDevice> list =itestService.getBlueDevice();
        return list;
    }
}
