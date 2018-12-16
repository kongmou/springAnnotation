package annotation;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.kongmou.bean.Blue;
import com.kongmou.bean.Person;
import com.kongmou.config.MainConfig2;

public class IOCTest {

	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

	
	
	@Test
	public void testImport(){
		printBeans(applicationContext);
		Blue bean = applicationContext.getBean(Blue.class);
		System.out.println(bean);
		
		//工厂Bean获取的是调用getObject创建的对象
		Object bean2 = applicationContext.getBean("colorFactoryBean");
		Object bean3 = applicationContext.getBean("colorFactoryBean");
		System.out.println("bean的类型："+bean2.getClass());
		System.out.println(bean2 == bean3);
		
		Object bean4 = applicationContext.getBean("&colorFactoryBean");
		System.out.println(bean4.getClass());
	}
	
	private void printBeans(AnnotationConfigApplicationContext applicationContext){
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : definitionNames) {
			System.out.println(name);
		}
	}
	@Test
	public void testComponentScan() {

		for (String clazzName : applicationContext.getBeanDefinitionNames()) {
			System.out.println(clazzName);

		}
	}

	@Test
	public void test03() {
		String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String[] activeProfiles = environment.getActiveProfiles();
		for (String fProperty : activeProfiles) {
			System.out.println(fProperty);
		}
		// 动态获取环境变量的值；Windows 10
		String property = environment.getProperty("os.name");
		System.out.println(property);
		for (String name : namesForType) {
			System.out.println(name);
		}

		Map<String, Person> persons = applicationContext.getBeansOfType(Person.class);
		System.out.println(persons);

	}
	
	

}
