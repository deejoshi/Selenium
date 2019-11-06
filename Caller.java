package PagewisePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caller 
{

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium by Rohit\\Day1\\Software\\chromedriver_win32 _new(2)\\chromedriver.exe");
		driver=new ChromeDriver();

		LaunchLoginCloseSite.opensite();
		LaunchLoginCloseSite.login();
		NewCustomer.createnewcustomer();	

		driver.close();
	}
}