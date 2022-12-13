package com.example.test;

import com.example.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {
//        流程：
//        1、引入spring - context
//        2、定义userService和userServiceImpl
//        3、在beans.xml中定义bean
//        4、在此处获取bean

        // bean工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // xml bean定义读取类
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        // 读取xml文件
        reader.loadBeanDefinitions("beans.xml");
        // 通过beanFactory获取bean
        UserService userService = (UserService) beanFactory.getBean("userServiceImpl");
        System.out.println(userService);
    }
}
