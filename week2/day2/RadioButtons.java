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
		WebElement brw = driver.findElement(By.xpath("//label[text()='Chrome']"));
		brw.click();
//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’. 
		WebElement unSelc = driver.findElement(By.xpath("//label[text()='Bengaluru']"));	
		unSelc.click();	
		unSelc.click();
		boolean bSelc = unSelc.isSelected();
		System.out.println(bSelc);
		if(bSelc==true){
			System.out.println("The radio button is  selected");
			}
		else {
			System.out.println("The radio button is deselected");
			}
//Identify the radio button that is initially selected by default. 

WebElement def = driver.findElement(By.xpath("(//div[@class='grid formgrid'])[3]//input[@checked='checked']"));
String dfbtn= def.getAccessibleName();
System.out.println("The deafult selected button is : "+dfbtn);

//Check and select the age group (21-40 Years) if not already selected.		
WebElement chkUnsel = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
boolean sel = chkUnsel.isEnabled();
System.out.println(sel);
	if(sel!=true) {
		chkUnsel.click();
		System.out.println("The age group (21-40 Years) is selected by code");
		}
	else
		{
		System.out.println("The age group (21-40 years) option is already selected by default");	
		}

driver.close();
	}

}