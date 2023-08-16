package selenium.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

public static void main(String[] args) {
	

		// TODO Auto-generated method stub
			
	
				ChromeDriver driver = new ChromeDriver();
	
				driver.get("https://www.tamilmatrimony.in/");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.manage().window().maximize();
			
				WebElement profile = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
				Select profiledd = new Select(profile);
				profiledd.selectByVisibleText("Myself");
			
				driver.findElement(By.id("NAME")).sendKeys("Rohan");
			
				driver.findElement(By.id("gendermale")).click();
			
				WebElement date = driver.findElement(By.xpath("//select[@id='DAY']"));
				Select datedd = new Select(date);
				datedd.selectByVisibleText("10");
				WebElement month = driver.findElement(By.xpath("//select[@id='MONTH']"));
				Select monthdd = new Select(month);
				monthdd.selectByVisibleText("May");
				WebElement year = driver.findElement(By.xpath("//select[@id='YEAR']"));
				Select yeardd = new Select(year);
				yeardd.selectByVisibleText("2001");
		
				WebElement religion = driver.findElement(By.id("RELIGION"));
				Select regligiondd = new Select(religion);
				regligiondd.selectByVisibleText("Hindu");
		
				WebElement tongue = driver.findElement(By.id("MOTHERTONGUE"));
				Select tonguedd = new Select(tongue);
				tonguedd.selectByVisibleText("Tamil");
		
				WebElement country = driver.findElement(By.id("COUNTRY"));
				Select countrydd = new Select(country);
				countrydd.selectByVisibleText("India");
		
				WebElement countrycode = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
				Select countrycodedd = new Select(countrycode);
				countrycodedd.selectByVisibleText("+91");
				driver.findElement(By.id("MOBILENO")).sendKeys("9816273829");
		
				driver.findElement(By.id("EMAIL")).sendKeys("rohansingh@gmail.com");
		
				driver.close();

			}

		

	}


