package com.example.demo.dao;

import com.example.demo.entity.TestHelloEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author jiangy
 * @email jiangy@highzpa.com
 * @date 2020-05-29 11:17:15
 */
@Mapper
public interface TestHelloDao extends BaseMapper<TestHelloEntity> {
	
}
