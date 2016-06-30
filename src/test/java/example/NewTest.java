package example;

import java.net.URL;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewTest {
	
	private static WebDriver driver;
	
  @Test
  public void f() {
  	try{
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
  	}
  	catch(Exception e) {
			 e.printStackTrace();
		}
  }
  
  
  @BeforeTest
  public void beforeTest() {
  	try{
  	DesiredCapabilities capability;
	capability = DesiredCapabilities.chrome();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\c5245770\\Downloads\\chromedriver.exe");
	driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);	
	//driver = new ChromeDriver();
  	}catch(Exception e) {
			 e.printStackTrace();
		}
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
