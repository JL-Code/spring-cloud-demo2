package com.example.demo.controller;

import com.example.demo.service.TestHelloService;
import com.example.demo.util.PageUtils;
import com.example.demo.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


/**
 * @author jiangy
 * @email jiangy@highzpa.com
 * @date 2020-05-29 11:17:15
 */
@RestController
@RequestMapping("/testhello")
public class TestHelloController {

    @Autowired
    private TestHelloService testHelloService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = testHelloService.queryPage(params);

        return R.ok().put("page", page);
    }

}
