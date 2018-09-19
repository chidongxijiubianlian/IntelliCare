package com.andon.intellihouse.IntelliCare.entity.po;

import org.omg.PortableInterceptor.Interceptor;

import java.util.Date;

/**
 * @author by yangzhi
 * @date 2018.09.11 17:01
 * @Moode o_O
 **/
public class TestDevice {
    private Integer id;
    private String deviceID;
    private String name;
    private String bluetoothkey;
    private String ownerid;
    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBluetoothkey() {
        return bluetoothkey;
    }

    public void setBluetoothkey(String bluetoothkey) {
        this.bluetoothkey = bluetoothkey;
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
