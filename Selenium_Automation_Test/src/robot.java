import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class robot {

	public static void main(String[] args) throws AWTException {
		WebDriver 	driver= new FirefoxDriver();
		driver.get("file:///D:/downloads/HTMLTag.html");
		driver.findElement(By.xpath(".//*[@id='txtName']")).sendKeys("Selenium");
		File src= driver.getScreenshotAs(Outptu)
		System.out.println("Selenium Entered in Search Box");
		JavascriptExecutor scroll= (JavascriptExecutor) driver;//to handle scroll bar
		//scroll.executeScript("window.scrollBy(0,300)", "");//to handle scroll bar
		WebElement e= driver.findElement(By.xpath(".//*[@id='Button1']"));
		scroll.executeScript("argument(0).click()", e);
		/*Robot r= new Robot();
		r.keyPress(KeyEvent.VK_0);*/
	}

}
