package World;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {
     public static void main (String[] args){
    	 WebDriver dr=new ChromeDriver();
    	 System.out.println("brower will be closed");
    	 dr.quit();
    	 System.out.print("brower is closed");
     }
}
