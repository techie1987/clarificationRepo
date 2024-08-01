package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadWithLocators {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
			
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Poorna_Test1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mentor1");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("JLeaf");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Senior Mentor");
			
		driver.findElement(By.className("smallSubmit")).click();
	
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("CRM")) {
			System.out.println("title is proper");
			}
		else
			{
			System.out.println("title is not proper");	
		    }
		
		driver.close();
		}

}
