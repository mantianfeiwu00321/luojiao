package World;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {
	 public static void main(String[] args) throws InterruptedException {
         WebDriver dr = new ChromeDriver();

         File file = new File("src/upload_file.html");
         String filePath = "file:///" + file.getAbsolutePath();
         System.out.printf("now accesss %s \n", filePath);

         dr.get(filePath);
         Thread.sleep(1000);
         
         File file1 = new File("src/try.html");
         String filePath1 = "file:///" + file1.getAbsolutePath();
         dr.findElement(By.name("file")).click();
         dr.findElement(By.cssSelector("input[type=file]")).sendKeys(filePath1);

         Thread.sleep(1000);
         System.out.println("browser will be close");
         dr.quit();  
     }

 }