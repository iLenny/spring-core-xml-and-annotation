package leibniz.springlearning.springcorexmlannotation;

import org.springframework.stereotype.Component;

@Component("hFortune")
public class HappyFortune implements Fortune {

	public String getFortune() {
		return "Your Fortune: lucky!";
	}

}
