package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_ng {
	@Test
	public void m2()
	{
		String s= System.getProperty("user.dir")+"//src//test\\java/mavenproject/chromedriver_win32/chromedriver.exe";
		System.out.println(s);
		System.getProperty("webdriver.chrome.driver",s);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
}
