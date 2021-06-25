package com.zgm.aotodemo.dealAsw;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.file.FileReader;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Init implements SmartLifecycle {

    @Override
    public void start() {
        FileReader fileReader = new FileReader("D:\\my\\asw\\awsList.txt");
        List<String> recordList = fileReader.readLines();
        if (CollUtil.isNotEmpty(recordList)) {
            DealAswServer.recordList = recordList;
        }
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
