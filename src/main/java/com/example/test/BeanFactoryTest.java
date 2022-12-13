package com.example.test;

import com.example.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {

        // bean工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        reader.loadBeanDefinitions("beans.xml");

        UserService userService = (UserService) beanFactory.getBean("userServiceImpl");
        System.out.println(userService);
    }
}
