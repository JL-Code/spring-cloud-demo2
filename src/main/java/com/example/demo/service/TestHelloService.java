package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.TestHelloEntity;
import com.example.demo.util.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author jiangy
 * @email jiangy@highzpa.com
 * @date 2020-05-29 11:17:15
 */
public interface TestHelloService extends IService<TestHelloEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

