package annotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kongmou.bean.Boss;
import com.kongmou.bean.Car;
import com.kongmou.bean.Color;
import com.kongmou.config.MainConifgOfAutowired;
import com.kongmou.dao.PersonDao;
import com.kongmou.service.PersonService;

public class IOCTest_Autowired {
	@Test
	public void test01() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MainConifgOfAutowired.class);

		PersonService bookService = applicationContext.getBean(PersonService.class);
		System.out.println(bookService);

		PersonDao bean = (PersonDao) applicationContext.getBean("personDao");
		System.out.println(bean);

		Boss boss = applicationContext.getBean(Boss.class);
		System.out.println(boss);
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);

		Color color = applicationContext.getBean(Color.class);
		System.out.println(color);
		System.out.println(applicationContext);

		applicationContext.close();
	}
}
