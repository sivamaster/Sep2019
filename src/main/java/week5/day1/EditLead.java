package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Siva");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		String expTitle="View Lead | opentaps CRM";
		String actTitle = driver.getTitle();
		if(actTitle.equals(expTitle)) {
			System.out.println("Test Passed - Page Title verified successful");
		}
		else
		{
			System.out.println("Test Failed - Page Title not verified");
		}
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		driver.close();
		
	}

}
