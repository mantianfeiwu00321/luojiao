package World;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloNew {
    public static void main(String[] args){
    	WebDriver driver=new ChromeDriver();
    	driver.get("http://10.12.3.12");
    	driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("username-input-text"));
    	element.sendKeys("admin");
    	WebElement pwd = driver.findElement(By.id("password-input-text"));
    	pwd.sendKeys("admin1234");
    	WebElement btn = driver.findElement(By.className("sumbit-button"));
    	btn.click();
    	//已登录到平台主界面
    	WebElement tree = driver.findElement(By.className("jstree-icon"));
    	tree.click();
    	//WebElement tree = driver.findElement(By.id("treeDemo_5_span"));
    	//tree.click();
    	//	driver.close();
    }
	
}