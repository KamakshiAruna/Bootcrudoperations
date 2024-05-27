package HasARelationShip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("hasa.xml");
		Car c=(Car) applicationContext.getBean("rac");
		c.getEngine().start();
	}

}
