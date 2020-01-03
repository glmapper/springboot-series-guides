package com.glmapper.bridge.boot.prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/12/23 10:25 AM
 * @since:
 **/
@Service
public class TestBean {

    /**
     * 每个配置文件都有，看配置文件优先级
     */
    @Value("${spring.application.name}")
    private String appName;

    @Value("${testKey}")
    private String prop_inner_test_key;


    @PostConstruct
    private void init(){
        System.out.println("-------------------------------");
        System.out.println(appName);
        System.out.println(prop_inner_test_key);
        System.out.println("-------------------------------");
    }
}
