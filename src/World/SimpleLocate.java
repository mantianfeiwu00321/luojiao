package World;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLocate {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		
		File file=new File("src/form.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access to %s \n",filePath);
		
		dr.get(filePath);
		Thread.sleep(1000);
		
		dr.findElement(By.id("inputEmail")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.name("password"));
		Thread.sleep(1000);
		
		String classofForm=dr.findElement(By.tagName("form")).getAttribute("class");
		System.out.printf("%s\n", classofForm);
		Thread.sleep(1000);
		
		//by link text
		WebElement link=dr.findElement(By.linkText("register"));
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut().fadeIn()",link);
		Thread.sleep(1000);
		
	
		
		System.out.println("brower will be close");
		dr.quit();
		
		
		
		
	}

}
