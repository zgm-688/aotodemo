package com.zgm.aotodemo.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository()
@Mapper
public interface ManagerData {

    List<Map> getFoods2(Map map);
}
