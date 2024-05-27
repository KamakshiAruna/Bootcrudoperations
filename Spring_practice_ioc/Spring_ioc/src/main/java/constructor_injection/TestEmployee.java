package constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("cons.xml");
		Employee employee=(Employee) context.getBean("aruna");
		System.out.println(employee);
	}

}
