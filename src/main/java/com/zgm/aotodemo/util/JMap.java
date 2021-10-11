package com.zgm.aotodemo.util;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class JMap extends HashMap {

    public static JMap create() {
        return new JMap();
    }

    public JMap put(Object key, Object value) {
        super.put(key, value);
        return this;
    }

    public JMap put(Map map) {
        super.putAll(map);
        return this;
    }

    public JMap putAll(JMap jMap) {
        super.putAll(jMap);
        return this;
    }

    public JMap remove(Object key) {
        super.remove(key);
        return this;
    }


    public String getStr(Object key) {
        return (String) get(key);
    }

    public Integer getInt(Object key) {
        return (Integer) get(key);
    }

    public Long getLong(Object key) {
        return (Long) get(key);
    }

    public Boolean getBoolean(Object key) {
        return (Boolean) get(key);
    }

    public String toJson() {
        return JSON.toJSONString(this);
    }
}