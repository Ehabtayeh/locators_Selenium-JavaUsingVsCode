package locatorWithVsCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VsCodeWithJavaSelenium {

	public static void main(String[] args)  {
		String email = "gda42qw@gmail.com";
		String password = "?ZAuW&WYi2L$FBL";
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email-input")).sendKeys(email);
		driver.findElement(By.id("password-input")).sendKeys(password);
		driver.findElement(By.id("date-input")).sendKeys("04/01/2000");
		driver.findElement(By.id("mobile-input")).sendKeys("+962772934194");
		driver.findElement(By.tagName("button")).click();
	

	}

}
