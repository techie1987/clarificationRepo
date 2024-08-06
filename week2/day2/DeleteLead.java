package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("141287");
//Click the "Find leads" button.	
	WebElement fLead = driver.findElement(By.xpath("//button[text() ='Find Leads']"));
	fLead.click();
	Thread.sleep(2000);
//Capture the lead ID of the first resulting lead.
	WebElement first_leadId = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
	String fli = first_leadId.getText();
	System.out.println("The Lead ID is : "+fli);
//Click the first resulting lead. -
	driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	Thread.sleep(1000);
//Click the "Delete" button. 
	WebElement del = driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']"));
	del.click();
	Thread.sleep(1000);
//Click "Find leads" again. 
	driver.findElement(By.linkText("Find Leads")).click();
	Thread.sleep(1000);
// Enter the captured lead ID.	
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(fli);
	Thread.sleep(1000);
//  Click the "Find leads" button.
	driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
	Thread.sleep(2000);
//- Verify the presence of the message "No records to display" in the Lead List. This 
//message confirms the successful deletion.
boolean rec=driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
	System.out.println(rec);
	if(rec==true) {
		System.out.println("The LeadID is successfully deleted");
	}
	else {
		System.out.println("The LeadId is not deleted succesfully");
	}
/*   - Close the browser.*/

		
		
		
	}

}
