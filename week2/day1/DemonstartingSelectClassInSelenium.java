package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemonstartingSelectClassInSelenium {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Poornashree");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("NS");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8884020790");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Serial_1");
		//select day
		WebElement dd = driver.findElement(By.xpath("//Select[@name = 'birthday_day']"));
		Select optDay = new Select(dd);
		optDay.selectByValue("15");
		
		//select month 
		WebElement mt = driver.findElement(By.xpath("//Select[@name = 'birthday_month']"));
		Select optMt = new Select(mt);
		optMt.selectByValue("8");
		//select year
		WebElement yr = driver.findElement(By.xpath("//Select[@name = 'birthday_year']"));
				Select optyr = new Select(yr);
				optyr.selectByValue("1905");
				
	//select radio button for gender option
		driver.findElement(By.xpath("//span[@data-name = 'gender_wrapper']//input[@value='2']")).click();
		//WebElement gndr = driver.findElement(By.xpath("//span[@data-name = 'gender_wrapper']"));
		//Select opt = new Select(gndr);
		
		
	
		
		
		
		
		/*
		 * - Click on the Create new account button.
		 *  - Enter the First name. 
		 * - Enter the Surname. - Enter the Mobile number or email address. 
		 * - Enter the New password. 
		 * - Handle all three dropdowns in Date of birth 
		 *  - Select the radio button in Gender. 
		 */
	}

}
