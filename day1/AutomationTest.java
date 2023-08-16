package selenium.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("XPERI");	
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mall");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9820184610");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("PASSWORD");
		
		driver.findElement(By.xpath("//select[@id='day']")).click();
		
		WebElement date=driver.findElement(By.xpath(" //select[@aria-label='Day']"));
		
		Select datedd=new Select(date);
		
		datedd.selectByVisibleText("6");
		
		driver.findElement(By.xpath("//select[@id='month']")).click();
		
     	WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
     	
     	Select Monthdd=new Select(Month);
     	
     	Monthdd.selectByVisibleText("Apr");
		
     	driver.findElement(By.xpath("//select[@id='year']")).click();
     	
    	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
    	
    	Select yeardd=new Select(year);
    	
    	yeardd.selectByVisibleText("2009");
    	
    	driver.findElement(By.xpath("//input[@value='2']")).click();
    	
    	driver.close();
    
 
        
	}

}
