package com.glmapper.bridge.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/12/31 5:28 PM
 * @since:
 **/
@ConfigurationProperties(prefix = "glmapper.property")
public class CustomProp {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
