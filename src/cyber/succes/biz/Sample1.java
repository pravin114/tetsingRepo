package cyber.succes.biz;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//control+ shift +o
public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner i=new Scanner(System.in);
		System.out.println("Enter link");
		String link=i.nextLine();
System.setProperty("webdriver.gecko.driver","E:\\webbrowser\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();
driver.get(link);
driver.manage().window().maximize();
Thread.sleep(4000);
driver.quit();
System.setProperty("webdriver.chrome.driver","E:\\webbrowser\\chromedriver.exe");
WebDriver driver1=new ChromeDriver();
driver1.get("http://127.0.0.1:85/login.do;jsessionid=tdbind6lmv6h");

	}

}
