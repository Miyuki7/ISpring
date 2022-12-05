package com.miyuki.springframework.beans.factory.support;

import com.miyuki.springframework.beans.BeansException;
import com.miyuki.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/12
 * @Description: 实例化策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;
}
