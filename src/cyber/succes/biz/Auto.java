package cyber.succes.biz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\webbrowser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://internship.aicte-india.org/login_new.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("asbulbule1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Shivam@14");
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		driver.close();
		

	}

}
