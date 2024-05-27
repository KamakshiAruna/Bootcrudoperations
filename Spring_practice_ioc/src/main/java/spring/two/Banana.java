package spring.two;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Banana implements Fruit{
	public void eat() {
		System.out.println("Eating Banana");
	}

}
