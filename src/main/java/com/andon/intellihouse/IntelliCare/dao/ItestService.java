package com.andon.intellihouse.IntelliCare.dao;

import com.andon.intellihouse.IntelliCare.entity.po.TestDevice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItestService {
    List<TestDevice> getBlueDevice(String name);
}
