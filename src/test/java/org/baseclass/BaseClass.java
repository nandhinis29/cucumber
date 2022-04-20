package org.baseclass;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {

		public static WebDriver driver;
		public static Actions a;
		public static Robot r;

		public static void launchBroswer() {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		public static void loadUrl(String url) {
			driver.get(url);
		}

		public static void maxBroswer() {
			driver.manage().window().maximize();

		}

		public static  void pageTitle() {
			String title = driver.getTitle();
			System.out.println(title);

		}

		public static void pageUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);

		}

		public static void toQuit() {
			driver.quit();

		}

		public static void fill(WebElement element, String value)

		{
			element.sendKeys(value);

		}

		public static void btnClick(WebElement element)

		{
			element.click();

		}

		public static void printText(WebElement element) {
			String text = element.getText();
			System.out.println(text);

		}

		public static String toGetAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
			return attribute;

		}

		public static  void performMoveToElement(WebElement element) {
			a = new Actions(driver);

			a.moveToElement(element).perform();

		}

		public static void performDragAndDrop(WebElement src, WebElement dest) {

			a.dragAndDrop(src, dest).perform();

		}

		public static void performContextClick(WebElement element) {
			a.doubleClick(element).perform();

		}

		public static void performDoubleClick(WebElement element) {
			a.contextClick(element).perform();

		}

		public static void performEnter() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

		public static void performTab() {

			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}

		public static void performDown() {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		public static void performControl() {

			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);

		}

		


	}



