package cyber.succes.biz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelPractice {

	public static void main(String[] args) {
   String driverExecutablepath=System.getProperty("usr.dir");
		   
       WebDriver driver=new ChromeDriver();
       System.setProperty("WebDriver.chrome.driver",driverExecutablepath+"chromedriver.exe");    

	}

}
