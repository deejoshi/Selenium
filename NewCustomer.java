package PagewisePOM;

import org.openqa.selenium.By;

public class NewCustomer extends Caller
{
	public static void createnewcustomer()
	{
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

	}
}
