package com.miyuki.springframework.beans.factory.config;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/12
 * @Description:
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
