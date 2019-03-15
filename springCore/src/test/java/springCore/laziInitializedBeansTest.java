package springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springCore.lazyInitializedBeans.LazyBean;

/**
 * This Test is used to undertsand the topic Lazy initialized Beans in the Spring Core
 * 
 * @author sebastianbuitrago
 *
 */
public class laziInitializedBeansTest {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"LazyInitializedBeansContext.xml");
		System.out.println("Main - LazyInitializedBeans");
		
		LazyBean lazyBeanService = (LazyBean) context
				.getBean("lazyBeanService");
	}
	
}
