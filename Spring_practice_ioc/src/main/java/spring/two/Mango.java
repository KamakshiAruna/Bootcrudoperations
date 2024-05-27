package spring.two;

import org.springframework.stereotype.Component;

@Component
public class Mango implements Fruit{
	public void eat() {
		System.out.println("Eating Mango");
	}

}
