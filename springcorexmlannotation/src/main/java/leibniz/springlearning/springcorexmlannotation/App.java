package leibniz.springlearning.springcorexmlannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String contextLocation = App.class.getResource("applicationContext.xml").toString();
		// Load Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(contextLocation);
		
		// Get Bean
		Coach coach = context.getBean("pingPongCoach", Coach.class);
		
		// Use the Bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// Close the Spring Container
		context.close();
	}
}
