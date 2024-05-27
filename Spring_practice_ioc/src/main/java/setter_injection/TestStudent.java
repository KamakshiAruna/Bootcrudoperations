package setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("set.xml");
		Student student=(Student) context.getBean("std");
		System.out.println(student);
	}

}
