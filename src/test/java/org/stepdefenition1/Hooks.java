package org.stepdefenition1;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void bef() {
		System.out.println("bef scenario....");
		launchBroswer();
		loadUrl("https://www.facebook.com/");
		maxBroswer();

	}

	@Before(order = 2)
	public void befsce2() {
		System.out.println("bef scenario2....");

	}

	@Before(order = 1)
	public void befsce1() {
		System.out.println("bef scenario1....");

	}

	@After(order = 1)
	public void aftsce1() {
		System.out.println("Aft scenario1....");
		toQuit();
	}

	@After(order = 2)
	public void aftsce2() {
		System.out.println("Aft scenario2....");
		toQuit();
	}

	@After
	public void aft(Scenario s) {
		System.out.println("Aft scenario....");
		if (s.isFailed()) {
			
			TakesScreenshot tk= (TakesScreenshot)driver;
			byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screen, "image/png");
	
			
		}
		toQuit();
	}

}
