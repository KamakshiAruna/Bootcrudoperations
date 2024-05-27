package constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("cons.xml");
		Car car=(Car) context.getBean("rac");
		System.out.println(car);
	}

}
