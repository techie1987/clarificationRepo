package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(750));
		driver.manage().window().maximize();
//Select 'Your most favourite browser' from the radio buttons 
		WebElement ck = driver.findElement(By.xpath("//label[text()='Chrome']"));
		ck.click();
//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’. 
		ck.click();		
		boolean res = ck.isSelected();
		System.out.println(res);
		if(res==true){
			System.out.println("Chrome selected");
		}else {
			System.out.println("Chrome not selected");
		}
//Identify the radio button that is initially selected by default. 
		driver.findElement(By.linkText("Find the default select radio button"))
		
//Check and select the age group (21-40 Years) if not already selected.		
		
		
		
	}

}
