package com.glmapper.bridge.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2020/1/9 2:50 PM
 * @since:
 **/
public class ParentBean {

    @Autowired
    private ChildBean childBean;

}
