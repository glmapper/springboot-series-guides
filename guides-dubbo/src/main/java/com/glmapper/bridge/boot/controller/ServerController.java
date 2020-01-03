package com.glmapper.bridge.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/12/30 9:33 PM
 * @since:
 **/
@RestController
public class ServerController {

    @RequestMapping("rest")
    public String rest(){
        return "SUCCESS";
    }
}
