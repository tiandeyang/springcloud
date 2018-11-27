package com.dytian.servicefeign.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.beans.BeansException;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Set;

@Service
public class Refresher implements ApplicationContextAware {

    private ApplicationContext context;

    @ApolloConfig
    private Config config;

    String defaultValue = "default";

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    //

    @PostConstruct
    private void initialize() {
        refresher(config.getPropertyNames());
    }

    private void refresher(Set<String> changedKeys) {
        for (String changedKey : changedKeys) {
            System.out.println("this key is changed:"+changedKey);
            String property = config.getProperty(changedKey, defaultValue);
            System.out.println("updatedValue===="+property);
        }

        this.context.publishEvent(new EnvironmentChangeEvent(changedKeys));
    }

    @ApolloConfigChangeListener
    private void onChange(ConfigChangeEvent changeEvent) {
        Set<String> strings = changeEvent.changedKeys();

        refresher(changeEvent.changedKeys());
    }

}
