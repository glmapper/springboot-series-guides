package com.glmapper.bridge.boot.service;

import com.glmapper.bridge.boot.facade.DubboFacade;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2020/1/4 3:06 PM
 * @since:
 **/
@Service(version = "1.0.0")
public class DefaultDubboFacadeImpl implements DubboFacade {
    @Override
    public String testDubbo(String message) {
        return "hello " + message;
    }
}
