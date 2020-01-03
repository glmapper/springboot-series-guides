package com.glmapper.bridge.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/12/23 10:24 AM
 * @since:
 **/
@SpringBootApplication
public class BootStrap {

    public static void main(String[] args) {

        Map<String, Object> defaultProperties = new HashMap<>();
        defaultProperties.put("defaultKey","defaultValue");
        SpringApplication springApplication = new SpringApplication(BootStrap.class);
        springApplication.setDefaultProperties(defaultProperties);
        springApplication.setAdditionalProfiles("dev");
        springApplication.run(args);
    }
}
