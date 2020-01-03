package com.glmapper.bridge.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/12/24 8:40 PM
 * @since:
 **/
@SpringBootApplication
public class BootStrap {

    private static final Logger LOGGER = LoggerFactory.getLogger(BootStrap.class);
    public static void main(String[] args) {
        SpringApplication.run(BootStrap.class,args);

        LOGGER.error("this is error log");

        LOGGER.warn("this is warn log");

        LOGGER.info("this is info log");

        LOGGER.info("this is debug log");
    }
}
