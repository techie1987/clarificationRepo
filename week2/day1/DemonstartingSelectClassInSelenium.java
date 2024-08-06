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
//		Click on the Create new account button.		
		driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//Enter the First name. 
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Poornashree");
//	Enter the Surname. - Enter the Mobile number or email address. 	-Enter the New password. 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("NS");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8884020790");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Serial_1");
//select birthday date/month/year
		WebElement dd = driver.findElement(By.xpath("//Select[@name = 'birthday_day']"));
		Select bd = new Select(dd);
		bd.selectByValue("15");
		
		//select month 
		WebElement mnt = driver.findElement(By.xpath("//Select[@name = 'birthday_month']"));
		Select bm = new Select(mnt);
		bm.selectByValue("8");
		//select year
		WebElement yr = driver.findElement(By.xpath("//Select[@name = 'birthday_year']"));
				Select byr = new Select(yr);
				byr.selectByValue("1905");
				
	//select radio button for gender option
		driver.findElement(By.xpath("//span[@data-name = 'gender_wrapper']//input[@value='2']")).click();
	//end of testcase.compleetd steps
		driver.close();
		
		
	
		
		
		
		
		/*
		 * - 
		 *  - 
		 * - 
		 * - 
		 * - Handle all three dropdowns in Date of birth 
		 *  - Select the radio button in Gender. 
		 */
	}

}
