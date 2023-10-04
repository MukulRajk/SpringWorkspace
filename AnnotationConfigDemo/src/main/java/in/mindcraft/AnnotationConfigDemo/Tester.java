package in.mindcraft.AnnotationConfigDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		MobilPhone m1=(MobilPhone) context.getBean("mobilPhone"); //first letter of classname must be written smallcase.
		m1.show();
		
		MobilPhone m2=(MobilPhone) context.getBean("mobilPhone"); //first letter of classname must be written smallcase.
		m2.show();
		
		MobilPhone m3=(MobilPhone) context.getBean("mobilPhone"); //first letter of classname must be written smallcase.
		m3.show();
	}

}
