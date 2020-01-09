package com.glmapper.bridge.boot;

import com.glmapper.bridge.boot.facade.DubboFacade;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2020/1/4 2:58 PM
 * @since:
 **/
@SpringBootApplication
public class DubboConsumerApplication {

    private final Logger LOGGER = LoggerFactory.getLogger(DubboConsumerApplication.class);

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private DubboFacade dubboFacade;

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class,args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            LOGGER.info(dubboFacade.testDubbo("glmapper"));
        };
    }
}
