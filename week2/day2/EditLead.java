package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
/*Enter the CompanyName Field Using Xpath. *  - Enter the FirstName Field Using Xpath. *   - Enter the LastName Field Using Xpath. * - Enter the FirstName (Local) Field Using Xpath. */
		
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("First S");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Second S");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("First L");
//Enter the Department Field Using any Locator of Your Choice.
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Create lead S using xpath");
//Enter the Description Field Using any Locator of your choice. 
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating lead using xpath");
//	Enter your email in the E-mail address Field using the locator of your choice. 
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("poornas@gm.com");
// Select State/Province as NewYork Using Visible Text.
	WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select obj = new Select(state);
	obj.selectByVisibleText("Arkansas");
// - Click on the Create Button.
	driver.findElement(By.xpath("//input[@value='Create Lead']")).click();	
// Click on the edit button. 
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
//Clear the Description field
	driver.findElement(By.id("updateLeadForm_description")).clear();	
//Fill the Important Note Field with Any text.
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Cleared description , added important note");
//	- Click on the update button.
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	
//	- Get the Title of the Resulting Page. 
	String title = driver.getTitle();
	System.out.println(title);
//	 Close the browser window. */
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.close();
	}

}
