package com.sy.bootjenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zyz
 * @date: 6/3/20 - 5:55 PM
 * @function:
 */

@RestController
public class HelloworldController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
