package spring.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kishore {
      @Autowired
      Fruit fruit;
      
      void buy() {
    	  fruit.eat();
      }
}
