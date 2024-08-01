package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on the "Basic Checkbox.” 
		driver.findElement(By.xpath("//div[@class ='grid formgrid']//ancestor::span[text()='Basic']")).click();
//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//div[@class ='grid formgrid']//ancestor::span[text()='Ajax']")).click();
//Verify that the expected message is displayed
		boolean msg = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).isDisplayed();
		System.out.println(msg);
		if(msg==true) {
			System.out.println("message displayed");
		}else {
			System.out.println("message not displaeyd");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("//label[text()='Python']")).click();
// Click on the "Toggle Switch." - Verify that the expected message is displayed. 
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
//Click on the "Tri-State Checkbox." 
// Verify which tri-state option has been chosen. 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
// Verify which tri-state option has been chosen.
		String state = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p")).getAccessibleName();
		System.out.println(state);
		if(state.contains("State = 0")) {
		System.out.println("state = 0, state has not changed");
		}
		else 
			{
			System.out.println("state is 1 or 2");
		}
//- Verify if the Checkbox is disabled.
		boolean chbx = driver.findElement(By.xpath("//input[@aria-disabled = 'true']")).isEnabled();
		System.out.println(chbx);
		if(chbx!=true) {
			System.out.println("The checkbox is disabled");
		}else {
			System.out.println("The checkbox is enabled");
		}
		
// Select multiple options on the page (details may be needed).
	driver.findElement(By.xpath("//div[@role='combobox']//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
	WebElement opt= driver.findElement(By.xpath("//ul[@role='group']//ancestor::label[text()='Paris']"));
	opt.click();
// Perform any additional actions or verifications required.
	boolean res = driver.findElement(By.xpath("//span[text()='Paris']")).isDisplayed();
	if(res!=true) {
		System.out.println("Option not selected");
	}else {
		System.out.println("Option selected");
	}
//Close the web browser when done.
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(320));
	driver.close();
	}
	
	

	
		}

	
		
		
		
		
		
		



