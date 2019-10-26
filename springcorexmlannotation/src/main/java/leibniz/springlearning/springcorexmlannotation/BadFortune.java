package leibniz.springlearning.springcorexmlannotation;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements Fortune {

	public String getFortune() {
		return "Your Fortune: unlucky";
	}

}
