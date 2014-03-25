package World;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navs {
	public static void main(String[] args) throws InterruptedException {
        WebDriver dr = new ChromeDriver();

        File file = new File("src/navs.html");
        String filePath = "file:///" + file.getAbsolutePath();
        System.out.printf("now accesss %s \n", filePath);

        dr.get(filePath);
        Thread.sleep(1000);

//      方法1：层级定位，先定位ul再定位li
        dr.findElement(By.className("nav-pills")).findElement(By.linkText("About")).click();
        Thread.sleep(1000);

//      方法2: 直接定位link
        dr.findElement(By.linkText("Home")).click();

        Thread.sleep(1000);
        System.out.println("browser will be close");
        dr.quit();  
    }

}
