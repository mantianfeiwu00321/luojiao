package World;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button_group {
	
	public static void main(String[] args)throws InterruptedException{
		WebDriver dr=new ChromeDriver();
		File file=new File("src/button_group.html");
		String filePath="file:///" +file.getAbsolutePath();
		dr.get(filePath);
		Thread.sleep(1000);
		
		 //定位text是second的按钮 (没看懂)
        List<WebElement> btns = dr.findElement(By.className("btn-group")).findElements(By.className("btn"));
        for(WebElement btn : btns){
            if(btn.getText().equals("third")){
                btn.click();
                break;
            }
        }

        Thread.sleep(2000);
        System.out.println("browser will be close");
        dr.quit();  
	}

}
