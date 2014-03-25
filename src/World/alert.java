package World;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	 public static void main(String[] args) throws InterruptedException {
         WebDriver dr = new ChromeDriver();

         File file = new File("src/alert.html");
         String filePath = "file:///" + file.getAbsolutePath();
         System.out.printf("now accesss %s \n", filePath);

         dr.get(filePath);
         Thread.sleep(1000);

 //      µã»÷Á´½Óµ¯³öalert
         dr.findElement(By.id("tooltip")).click();

         Alert alert = dr.switchTo().alert();
         alert.accept();

         Thread.sleep(1000);
         System.out.println("browser will be close");
         dr.quit();  
     }

 }