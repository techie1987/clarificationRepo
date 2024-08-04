package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
//precondition steps		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
//Click on the button with the text ‘Click and Confirm title.’ 
		driver.findElement(By.xpath("//span[text()='Click']")).click();
// Verify that the title of the page is ‘dashboard.’ 
		String title = driver.getTitle();
		System.out.println("The page title is : "+title);
//navigating to home page 
		driver.navigate().back();
		String hme = driver.getTitle();
		System.out.println("redirected to home page:  "+hme);
//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.  		
		boolean val =driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		System.out.println(val);//true
		if(val!=true) {
			System.out.println("The confirm button is disabled , is disabled");
		}else {
			System.out.println("The confirm button is disabled is not disabeld");
		}
//Find and print the position of the button with the text ‘Submit.’ 
		Point pos = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-2']")).getLocation();
		System.out.println("The Position of Submit button is : "+pos);
//Find and print the background color of the button with the text ‘Find the Save button color.’ 
		String col = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println("The background color of Save button: "+col);
//Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
	Dimension hght= driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']")).getSize();
	System.out.println("The height and width of this second Submit button: "+hght);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));
	driver.close();
	}

}
