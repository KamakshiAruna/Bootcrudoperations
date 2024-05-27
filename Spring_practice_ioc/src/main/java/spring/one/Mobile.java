package spring.one;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mobile {
	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("ac.xml");
//		MusicPlayer player=(MusicPlayer) context.getBean("mp");
//		player.music();
		
		ClassPathResource resource=new ClassPathResource("ac.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		MusicPlayer musicPlayer=(MusicPlayer) factory.getBean("mp");
		musicPlayer.music();
	}

}
