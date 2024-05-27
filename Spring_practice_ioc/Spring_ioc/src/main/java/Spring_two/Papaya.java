package Spring_two;

import org.springframework.stereotype.Component;

@Component
public class Papaya implements Fruit{
	public void eat() {
		System.out.println("Eating Papaya");
	}

}
