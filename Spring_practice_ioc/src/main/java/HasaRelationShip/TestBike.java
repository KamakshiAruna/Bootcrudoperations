package HasaRelationShip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("hasarel.xml");
		Bike b=(Bike) context.getBean("bi");
		b.getEngine().start();
	}

}
