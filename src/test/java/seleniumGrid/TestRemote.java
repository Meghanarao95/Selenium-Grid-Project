package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestRemote {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.204:4444"), opt);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Hello Grid ! ! !");
		Thread.sleep(10000);
		driver.quit();
	}

}
