import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_File {

	public static void main(String args[]) throws IOException {
		
		String path= "C:\\Users\\abhin\\Documents\\Abhinav Sharma.docx";//file to be upload
		
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///D:/downloads/HTMLTag.html");
		
		WebElement button=driver.findElement(By.xpath("html/body/form[2]/input[2]"));
		button.sendKeys(path);//uploading file
		//Runtime.getRuntime().exec(path);// upload through auto it
		
	}
}
