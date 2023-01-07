package com.wybb.admin.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.wybb.admin-> Controller
 * @description:
 * @author: LQKun
 * @date: 2023-01-07 21:15
 * @version: 1.0
 */
@RestController
public class HelloController {

    @ApiOperation(value = "健康检查", notes = "健康检查", httpMethod = "GET")
    @GetMapping("/health")
    public String health(){
        return HttpStatus.OK.name();
    }
}
