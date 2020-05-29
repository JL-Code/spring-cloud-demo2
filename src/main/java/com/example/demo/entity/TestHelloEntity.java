package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author jiangy
 * @email jiangy@highzpa.com
 * @date 2020-05-29 11:17:15
 */
@Data
@TableName("test_hello")
public class TestHelloEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long toUserId;
	/**
	 * 
	 */
	private String message;

}
