

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
	public static void main(String args[]) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.zlti.com/");
		System.out.println("Website Opened Successfully");
		
		WebElement hover_item= driver.findElement(By.xpath("//nav[@class='nav-primary']/descendant::div/ul/li[contains(@id,'menu-item-')]")) ;
		Actions a= new Actions(driver);
		a.moveToElement(hover_item);
		System.out.println("Hover done successfully");
	}

}
