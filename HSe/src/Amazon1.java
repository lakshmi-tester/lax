import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	public static void main(String[]args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(1000);
driver.get("https://www.amazon.com");
driver.findElement(By.linkText("Today's Deals")).click();
}
}
