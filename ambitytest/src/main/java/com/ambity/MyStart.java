package com.ambity;

import com.ambity.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@EnableAspectJAutoProxy
@ComponentScan("com.ambity.service")
public class MyStart {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyStart.class);
		MyService myService =  context.getBean(MyService.class);
		myService.say();

	}
}
