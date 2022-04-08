package cyber.succes.biz;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","E:\\webbrowser\\geckodriver.exe" );
WebDriver driver=new FirefoxDriver();
driver.get("https://google.com");
driver.quit();
	}

}
