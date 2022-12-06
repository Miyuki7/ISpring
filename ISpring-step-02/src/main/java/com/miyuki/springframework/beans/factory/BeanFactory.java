package com.miyuki.springframework.beans.factory;

import com.miyuki.springframework.beans.BeansException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/12
 * @Description:
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
