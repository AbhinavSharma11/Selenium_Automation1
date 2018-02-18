import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitHub_login {

	public static void main (String args[]) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://github.com/login");
		
		WebElement user= driver.findElement(By.xpath(".//*[@id='login_field']"));
		user.sendKeys("abhinav");
		WebElement pass= driver.findElement(By.xpath(".//*[@id='password']"));
		pass.sendKeys("abhi");
		WebElement button= driver.findElement(By.xpath(".//*[@id='login']/form/div[4]/input[3]"));
		button.click();
		
		pass=driver.findElement(By.xpath(".//*[@id='password']"));
		pass.sendKeys("sharma");
	}
}
