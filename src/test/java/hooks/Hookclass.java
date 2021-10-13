package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookclass {
	
	
	public static WebDriver driver;
	
	@Before
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/index.php");
	}
	@After
	public void closedriver()
	{
		System.out.println("The Browser is closing");
		driver.quit();
	}

}
