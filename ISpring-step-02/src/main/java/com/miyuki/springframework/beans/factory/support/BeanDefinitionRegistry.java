package com.miyuki.springframework.beans.factory.support;

import com.miyuki.springframework.beans.factory.config.BeanDefinition;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/12
 * @Description:
 */
public interface BeanDefinitionRegistry {
     /**
      * 向注册表中注册BeanDefinition
      * @param beanName
      * @param beanDefinition
      */
     void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
