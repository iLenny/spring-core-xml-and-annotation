package leibniz.springlearning.springcorexmlannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {
	
	@Autowired
	private Fortune fortune;
	
	public PingPongCoach() {}
	

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

	
}
