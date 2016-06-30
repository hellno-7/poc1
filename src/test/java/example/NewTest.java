package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private static WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
  }
  
  
  @BeforeTest
  public void beforeTest() {
  	DesiredCapabilities capability;
	capability = DesiredCapabilities.chrome();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\c5245770\\Downloads\\chromedriver.exe");
	driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);	
	//driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
