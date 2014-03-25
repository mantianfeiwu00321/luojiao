package World;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwardAndBack {
   
	public static void main(String[] args)throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		Thread.sleep(2000);
		
		String firstUrl="http://www.baidu.com";
		System.out.printf("now access %s \n", firstUrl);
		dr.get(firstUrl);
		Thread.sleep(1000);
		
		String SecondUrl="http://www.google.com";
		System.out.printf("now access %s \n", SecondUrl);
		dr.get(SecondUrl);
		Thread.sleep(1000);
		
		System.out.printf("now back to %s \n", firstUrl);
		dr.navigate().back();
		Thread.sleep(1000);
		
		System.out.printf("now forward to %s \n", SecondUrl);
		dr.navigate().forward();
		Thread.sleep(1000);
		
		dr.quit();
		
		
		
		
		
		
	}
	
	
	
}
