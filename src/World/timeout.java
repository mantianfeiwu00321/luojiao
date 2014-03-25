package World;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class timeout{
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		String url="http://www.baidu.com";
		dr.get(url);
		dr.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		Thread.sleep(1000);
		System.out.printf("brower will be close");	
		dr.quit();
	}

	
}
