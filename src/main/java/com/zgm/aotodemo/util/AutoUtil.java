package com.zgm.aotodemo.util;

import java.util.Random;

public class AutoUtil {


    //生成一段数字内的 随机数
    public static Integer getRandNum(Integer max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
