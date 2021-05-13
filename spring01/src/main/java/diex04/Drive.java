package diex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Drive {
	public static void main(String[] args) {
		String path = "/src/main/java/diex04/carbean.xml";
		ApplicationContext context = new FileSystemXmlApplicationContext(path);
		
		Tire tire = (Tire)context.getBean("tire");
		Car car = (Car)context.getBean("car");
		System.out.println(car.getTireBrand());
	}

}
