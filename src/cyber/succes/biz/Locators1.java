package cyber.succes.biz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators1 {
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","E:\\webbrowser\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://internship.aicte-india.org/login_new.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("asbulbule1@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Shivam@14");
	driver.findElement(By.id("login")).click();
	Thread.sleep(5000);
	driver.close();
	

}
}