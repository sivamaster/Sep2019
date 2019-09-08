package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		
		// To launch Chrome browser
		WebDriver driver=new ChromeDriver();
		
		// To maximize the browser window
		driver.manage().window().maximize();
		
		// Load application URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Enter the User Name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		// Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click on Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Hit CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// To click on 'Create Lead' link
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter the Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		
		// Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Siva");
		
		// Enter the Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		// Click on Submit
		driver.findElement(By.name("submitButton")).click();
		
		// To close the current page
		driver.close();
	}

}
