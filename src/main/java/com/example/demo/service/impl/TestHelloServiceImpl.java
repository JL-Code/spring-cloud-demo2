package com.example.demo.service.impl;

import com.example.demo.util.PageUtils;
import com.example.demo.util.Query;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.demo.dao.TestHelloDao;
import com.example.demo.entity.TestHelloEntity;
import com.example.demo.service.TestHelloService;


@Service("testHelloService")
public class TestHelloServiceImpl extends ServiceImpl<TestHelloDao, TestHelloEntity> implements TestHelloService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TestHelloEntity> page = this.page(
                new Query<TestHelloEntity>().getPage(params),
                new QueryWrapper<TestHelloEntity>()
        );

        return new PageUtils(page);
    }

}