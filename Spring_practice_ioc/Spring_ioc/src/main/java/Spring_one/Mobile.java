package Spring_one;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ac.xml");
		MusicPlayer mp=(MusicPlayer) ac.getBean("mp");
		System.out.println(mp);
		MusicPlayer mp1=(MusicPlayer) ac.getBean("mp");
		System.out.println(mp1);
//		mp.music();
		
//		ClassPathResource resource=new ClassPathResource("ac.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
//		MusicPlayer m=(MusicPlayer) factory.getBean("mp");
//		m.music();
	}

}
