package in.tp.jd.service;

import java.util.Locale;
import java.util.Map;

public class WelcomeService {
	
	Map<String, String> greetings;
	
	public String welcome(String winner) {
		return "Welcome "+ winner + " to the team";
	}
	
	public String greetin(String userName, Locale local) {
		
		String greeting = null;
		
		return greeting;
	}

}
