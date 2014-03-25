package World;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class download_file {
	
	 public static void main(String[] args) throws InterruptedException {
         WebDriver dr = new ChromeDriver();
	  dr.navigate().to("http://www.myfile.com/hey.csv");

	 }
}
