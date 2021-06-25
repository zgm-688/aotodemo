package com.zgm.aotodemo.dealAsw;

import com.zgm.aotodemo.util.AutoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "asw")
@RestController(value = "dealAswServer")
public class DealAswServer {

    private final static Logger logger = LoggerFactory.getLogger(DealAswServer.class);

    public static List<String> recordList = null;

    /**
     * TODO获取随机回复
     */
    @RequestMapping("/getAsw")
    public String getWeatherPlace(String question) throws Exception {
        return getRandAsw();
    }

    public String getRandAsw() {
        return recordList.get(AutoUtil.getRandNum(recordList.size()));
    }


}
