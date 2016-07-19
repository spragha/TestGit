package com.raghav.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {

		Resource resource=new ClassPathResource("springConfig.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		//ApplicationContext factory=new XmlBeanFactory(new FileSystemXmlApplicationContext());
		Object object=factory.getBean("wc");
		ApplicationContextAware applicationContextAware;
		BeanNameAware beanNameAware;
		WelcomeBean welcomeBean=(WelcomeBean)object;
		welcomeBean.display();

	}

}
