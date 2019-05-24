package com.cafe24.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cafe24.springcontainer.user.User1;

public class ContainerTest {

	public static void main(String[] args) {
		// testBeanFactory();
		testApplicationContext();
	}
	
	public static void testApplicationContext() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config/user/applicationContext.xml");
		
		User1 user = (User1)appContext.getBean("user1");
		System.out.println(user.getName());

		user = appContext.getBean(User1.class);
		System.out.println(user.getName());
	
		
		
		
		((ConfigurableApplicationContext)appContext).close();
	}

	public static void testBeanFactory() {
		// Auto-Configuration(Scanning)인 경우
		// Bean의 id가 자동으로 만들어 진다.
		BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext.xml"));
		User1 user = (User1)bf1.getBean("user1");
		System.out.println(user.getName());
		
		// XML Bean 설정인 경우에는 id가 자동으로 부여 되지 않는다.
		BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext2.xml"));
		// user = (User1)bf2.getBean("user1");
		// System.out.println(user.getName());
		user = bf2.getBean(User1.class);
		System.out.println(user.getName());
	}
}
