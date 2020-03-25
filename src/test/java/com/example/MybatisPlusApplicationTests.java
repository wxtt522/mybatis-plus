package com.example;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.TDict;
import com.example.mapper.TDictMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
@MapperScan("com.example.mapper")
class MybatisPlusApplicationTests {

    @Resource
    TDictMapper tDictMapper;

    @Test
    void pageTest() {
        IPage<TDict> tDictIPage = tDictMapper.listDictDetail(new Page<>()); //默认1-10分页
        System.out.println(tDictIPage.getRecords().size());
        System.out.println(tDictIPage.getTotal());
    }

    @Test
    void contextLoads() {
        List<TDict> tDs = tDictMapper.selectByMap(new HashMap<>(){
            {
                put("dict_name", "odsType");
            }
        });
        System.out.println(tDs);

    }

}
