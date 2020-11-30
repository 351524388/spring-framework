package top.changelife.demo.day01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("day01-applicationContext.xml"));
		MyTestBean demo = factory.getBean("demo", MyTestBean.class);
		System.out.println(demo);
	}
}
