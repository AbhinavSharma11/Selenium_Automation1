import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_handling {
	public static void main(String args[]) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/abhin/Downloads/OpenWindow.html");
		
		WebElement button= driver.findElement(By.xpath(".//*[@id='btnConfirm']"));
		button.click();
		
		String PW= driver.getWindowHandle();
		// System.out.println(PW);
		
		Set<String> CW=driver.getWindowHandles();
		
		for(String Handle:CW) {
			if(!Handle.equals(PW)) {
				driver.switchTo().window(Handle);
				driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Abhinav");
			}
		}
		driver.switchTo().window(PW);
		WebElement button1= driver.findElement(By.xpath(".//*[@id='btnPrompt']"));
		button1.click();
		
		Alert art= driver.switchTo().alert();
		
		art.sendKeys("I m Fine");
		art.accept();
		
		String text= art.getText();
		
		System.out.println(text);
		
		button1.click();
		art.dismiss();
	}

}
