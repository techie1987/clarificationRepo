package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
//Click the "Leads" link.
		driver.findElement(By.linkText("Leads")).click();
//- Click "Find leads.
		driver.findElement(By.linkText("Find Leads")).click();
//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
//Enter the phone number.
		//driver.findElement(By.)
/*  " -  -  - Click the "Find leads" button. - Capture the lead ID of the first resulting lead. - Click the first resulting lead. - Click the "Delete" button. - Click "Find leads" again. - Enter the captured lead ID. - Click the "Find leads" button. - Verify the presence of the message "No records to display" in the Lead List. This 
message confirms the successful deletion. - Close the browser.*/

		
		
		
	}

}
