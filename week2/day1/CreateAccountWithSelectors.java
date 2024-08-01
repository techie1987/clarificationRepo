package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectors {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id ='username']")).sendKeys("DemoSalesManager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	//driver.findElement(By.xpath("//a[text()='CRM/SFA']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	//click on Accounts tab
	driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	//click on create account button
	driver.findElement(By.xpath("//a[text() ='Create Account']")).click();
	//enter the account name
	driver.findElement(By.xpath("//input[@id = 'accountName']")).sendKeys("Ptest5");
	//enter description
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	//select option computer software from industry
	
	WebElement ind = driver.findElement(By.name("industryEnumId"));
	
	Select opt1 = new Select(ind);
	//object.methods();
	
	opt1.selectByIndex(3);
	//select option from Ownership 
	WebElement ownId = driver.findElement(By.name("ownershipEnumId"));
	Select opt2 = new Select(ownId);
	//opt2.selectByValue("OWN_SCORP");
	opt2.selectByVisibleText("S-Corporation");
	
	//select employee as source  by selectbyvalue
		WebElement src = driver.findElement(By.id("dataSourceId"));
		Select opt3 = new Select(src);
		opt3.selectByValue("LEAD_EMPLOYEE");
	//select commerce site as marketing campaign by selectbyindex()
		WebElement markt = driver.findElement(By.id("marketingCampaignId"));
		Select opt4 = new Select(markt);
		opt4.selectByIndex(6);
		
		//select Texas as state by using selectbyValue method.
		WebElement prov = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select opt5 = new Select(prov);
		opt5.selectByValue("TX");
		//click on create account
		driver.findElement(By.xpath("//input[@value= 'Create Account']")).click();
	/*	
	//verification of account name is not working 
		String title = driver.getTitle();
		System.out.println(title);
	
		String accName = driver.findElement(By.xpath("//span[contains.text()='Ptest5']")).getText();
		System.out.println(accName);
		
		if(accName.contains("Ptest5")) {
			System.out.println("Account created correctly");
			}
		else
			{
			System.out.println("Account name is wrong");
			}
			*/
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
		
		driver.close();

	}

}
