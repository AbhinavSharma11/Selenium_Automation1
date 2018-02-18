

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test_selenium {
	
	
	public static void main(String[] args) {
		
	
		
		
		/*File pathToBinary = new  File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	    FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);

		// WebDriver driver = new FirefoxDriver();
		
		
		ProfilesIni profile = new ProfilesIni();

		FirefoxProfile myprofile = profile.getProfile("MyProfile");*/
		
		

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.goibibo.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		/*WebElement e1 =driver.findElement(By.xpath(""));
		
		e1.click();		
		*/
		
		
	String[] Explist = {"Flights","Hotels","Hotels","Bus","Trains","Cars","NEW!","Activities","Holidays","Flight + Hotels"};
		
		List<WebElement> e2 =driver.findElements(By.xpath("//div[@id='header']/div[1]/ul/li/a"));
		
		int it = e2.size();
		
		System.out.println(it);
		
		int count =0;
			
		
		for(WebElement tt: e2){
			
			for(int j=0;j<Explist.length;j++){
				
				
				
			//	System.out.println(tt.getText());
				
			if(tt.getText().equals(Explist[j])){
					
				System.out.println("pass");
				count++;
					
			}
			
			
			}
		}
		
		
		if(count==Explist.length){
			
			System.out.println("matched");
		}
			}
			
		
}
		
		
	



		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\nISHI\\Desktop\\New folder (2)\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
	 
	// Maximize the window
	driver.manage().window().maximize();
	
	
	 
	// Pass the url
	driver.get("http://www.google.com");
}

}
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\nISHI\\Desktop\\New folder (2)\\New folder\\IEDriverServer.exe");
		
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		
		
		
		
	}
}
		
		
	*/	
		
		
		