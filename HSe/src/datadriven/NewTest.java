package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utility.Xls_Reader;

public class NewTest {
  @Test
  public void f() {System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	
	  Xls_Reader reader=new Xls_Reader("C:\\Users\\Ramesh\\git\\HelloIndia\\HSe\\src\\testdata\\ram.xlsx");
	  String name=reader.getCellData("lax", "firstname", 2);
	  System.out.println(name);
	  
	  driver.findElement(By.xpath("//input[@type='text'and @id='firstName']")).sendKeys(name);
	  
	  driver.quit();
	   }
 
}
