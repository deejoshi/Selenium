import org.junit.Assert;
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
		String actualurl= "https://demo.guru99.com/V4/manager/Managerhomepage.php";
		System.out.println("Verify whether landed onto home page after login");
		String expectedurl= driver.getCurrentUrl();
		Assert.assertEquals(expectedurl,actualurl);
		
		System.out.println("Verified- ON Home page");
		
		//driver.close();
		
		System.out.println("Start Creating new Customer");
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("customerc");
		driver.findElement(By.name("rad1")).click();
		driver.findElement(By.name("dob")).sendKeys("04-11-2019");
		driver.findElement(By.name("addr")).sendKeys("UK");
		driver.findElement(By.name("city")).sendKeys("London");
		driver.findElement(By.name("state")).sendKeys("Essex");
		driver.findElement(By.name("addr")).sendKeys("UK");
		driver.findElement(By.name("pinno")).sendKeys("123456");
		driver.findElement(By.name("telephoneno")).sendKeys("232323");
		driver.findElement(By.name("addr")).sendKeys("UK");
		driver.findElement(By.name("emailid")).sendKeys("sdfrtysf@dfgg.com");
		driver.findElement(By.name("password")).sendKeys("passwordc");
		driver.findElement(By.name("sub")).click();
		String CustomerId = driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]")).getText();
		System.out.println(CustomerId);
		//driver.findElement(By.linkText("Log out")).click();

	}
}