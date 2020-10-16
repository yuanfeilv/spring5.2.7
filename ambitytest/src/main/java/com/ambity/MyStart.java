package com.ambity;

import com.ambity.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.ambity.service")
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableTransactionManagement
public class MyStart {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyStart.class);
		MyService myServiceImpl =  context.getBean(MyService.class);
		myServiceImpl.say();
	}
}
