package leibniz.springlearning.springcorexmlannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pingPongCoach")
@Scope("prototype")
public class PingPongCoach implements Coach {
	
	@Autowired
	@Qualifier("badFortune")
	private Fortune fortune;
	
	public PingPongCoach() {}
	

	@PostConstruct
	public void init() {
		System.out.println("testing post-construct");
	}
	
	public String getDailyWorkout() {
		return "Perform 100 topspin with backhand";
	}

	public String getDailyFortune() {
		return fortune.getFortune();
	}


	public Fortune getFortune() {
		return fortune;
	}


	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("testing pre-destroy");
	}
	
}
