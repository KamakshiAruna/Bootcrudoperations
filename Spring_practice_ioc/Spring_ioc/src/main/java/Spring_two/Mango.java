package Spring_two;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mango implements Fruit{
	public void eat() {
		System.out.println("Eating mango");
	}

}
