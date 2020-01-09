package com.glmapper.bridge.boot.autoconfigure;

import com.glmapper.bridge.boot.beans.ChildBean;
import com.glmapper.bridge.boot.beans.ParentBean;
import org.apache.http.client.HttpClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2020/1/9 2:49 PM
 * @since:
 **/
@Configuration
@ConditionalOnClass(HttpClient.class)
public class GlmpperAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public ParentBean parentBean(){
        return new ParentBean();
    }

    @Bean
    @ConditionalOnMissingBean
    public ChildBean childBean(){
        return new ChildBean();
    }
}
