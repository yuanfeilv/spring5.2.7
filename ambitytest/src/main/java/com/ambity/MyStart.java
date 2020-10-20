package com.ambity;

import com.ambity.service.Car;
import com.ambity.service.MyService;
import com.ambity.service.Tank;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.ambity.service")
//@EnableAspectJAutoProxy(exposeProxy = true)
//@EnableTransactionManagement
@Import(Car.class)
public class MyStart {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyStart.class);
		MyService myServiceImpl =  context.getBean(MyService.class);
		myServiceImpl.say();
	}
	@Bean
	public Tank tank(){
		return new Tank();
	}
}
