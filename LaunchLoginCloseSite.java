package PagewisePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LaunchLoginCloseSite extends Caller
{

	public static void opensite()
	{
		driver.get("https://demo.guru99.com/V4/");
	}

	public static void closesite()
	{
		driver.close();
	}

	public static void login()
	{
		WebElement uid = driver.findElement(By.name("uid"));
		uid.sendKeys("mngr230814");
		driver.findElement(By.name("password")).sendKeys("UdupYje");
		driver.findElement(By.name("btnLogin")).click();
	}


}
