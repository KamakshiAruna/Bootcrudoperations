package Spring_two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestKishore {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Kishore k=(Kishore) context.getBean(Kishore.class);
	   k.buy();
	}

}
