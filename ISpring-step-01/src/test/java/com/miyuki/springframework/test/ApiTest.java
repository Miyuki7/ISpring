package com.miyuki.springframework.test;

import com.miyuki.springframework.BeanDefinition;
import com.miyuki.springframework.BeanFactory;
import com.miyuki.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: miyuki
 * @Date: 2022/12
 * @Description:
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        //1.初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2.注入Bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3.获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
