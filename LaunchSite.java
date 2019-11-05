import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchSite {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub


		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.guru99.com/V4/");
		Thread.sleep(5000);
		WebElement uid = driver.findElement(By.name("uid"));
		uid.sendKeys("mngr230814");

		driver.findElement(By.name("password")).sendKeys("UdupYje");
		driver.findElement(By.name("btnLogin")).click();
		//driver.close();
		System.out.println("Logged In Successfully");

	}

}