package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountWithLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//1.enter username,2. enetr password,3.clcik on login,4.click on crmsfa link or image
				
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on create account 
		driver.findElement(By.linkText("Create Account")).click();
		//enter account name , description,no. of employees,site name,
		
		driver.findElement(By.id("accountName")).sendKeys("Test_Poorna");
		//Thread.sleep(1000);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.name("numberEmployees")).sendKeys("100");
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps1");
		
		//click on create account button.
		driver.findElement(By.className("smallSubmit")).click();
		//verify if the tittle is displayed correctly
		String title = driver.getTitle();
		System.out.println(title);
		//verification
		if(title.contains("CRM")) {
			System.out.println("Title is CRM Testleaf");
		}
		else {
			System.out.println("Title is not loaded properly");
		}
				//current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.close();
	}

}
