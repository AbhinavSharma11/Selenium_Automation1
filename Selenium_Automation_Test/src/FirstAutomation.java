import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;



public class FirstAutomation {

	public static void  main (String args[]) throws Exception {
		
		//ProfilesIni profile= new ProfilesIni();
	//	FirefoxProfile FirefoxProfile= profile.getProfile("Selenium_test");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.dezlearn.com/testingpage/");
		
		List<WebElement> tags= driver.findElements(By.tagName("iframe"));
		tags.size();
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("")))	;//Not going in Frame 0
		
		WebElement text=driver.findElement(By.xpath(".//*[@id='main']/section/div/form/label/input"));
		text.sendKeys("Selenium");
		
		WebElement search=driver.findElement(By.xpath(".//*[@id='main']/section/div/form/input"));
		search.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1) ;
		
		WebElement text1=driver.findElement(By.xpath(".//*[@id='ninja_forms_field_11']"));
		text1.sendKeys("Abhinav");
		
		WebElement text2=driver.findElement(By.xpath(".//*[@id='ninja_forms_field_12']"));
		text2.sendKeys("abhinavsharma048@gmail.com");
		
		WebElement text3=driver.findElement(By.xpath(".//*[@id='ninja_forms_field_13']"));		
		text3.sendKeys("Selenium Frame Handling");
		
		WebElement check_box=driver.findElement(By.xpath(".//class[@id='recaptcha-anchor']/div[5]"));
		check_box.click();//Not able to find the xpath

		driver.switchTo().defaultContent();
		
		WebElement Alert=driver.findElement(By.xpath(".//*[@id='panel-197-0-0-1']/div/div/p[2]/button"));
		Alert.click();
		
	}
}