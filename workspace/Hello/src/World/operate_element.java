package World;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class operate_element {
	public static void main(String[] args)throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		File file=new File("src/operate_element.html");
	    String filePath="file:///"+file.getAbsolutePath();
	    dr.get(filePath);
	    Thread.sleep(1000);
	   
	    dr.findElement(By.linkText("Link1")).click();
	    Thread.sleep(1000);
	    
	    WebElement element=dr.findElement(By.name("q"));
	    element.sendKeys("something");
	    Thread.sleep(1000);
	    
	    element.clear();
	    
	    Thread.sleep(1000);
	    dr.quit();
		
	}

}
