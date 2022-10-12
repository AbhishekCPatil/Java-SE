package in.tp.jd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WelcomeServiceTest {
	
	@Test
	void testWelcome() {
		
		WelcomeService ws = new WelcomeService();
		String input = "Abhi";
		String actual = ws.welcome(input);
		String expected = "Welcome Abhi to the team";
		assertEquals(expected, actual);
	}
}
