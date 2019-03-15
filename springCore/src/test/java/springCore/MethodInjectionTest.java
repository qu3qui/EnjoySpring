package springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springCore.methodInjection.CommandManagerBean;

public class MethodInjectionTest {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"MethodInjectionContext.xml");
		System.out.println("Main - MethodInjectionTest");
		
		CommandManagerBean commandManagerBean = (CommandManagerBean) context
				.getBean("commandManager");
		
		commandManagerBean.process(null);
	}

}
