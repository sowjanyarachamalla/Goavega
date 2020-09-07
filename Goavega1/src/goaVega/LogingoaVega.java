package goaVega;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LogingoaVega {
	
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
	

	

	driver.get("http://java.goavega.learn-wize.com");
	
	//Assert.assertTrue(driver.getTitle().matches("//*[@id=\"mCSB_1_container\"]/div/div/div/div[1]/img"), "GOAVEGA");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("java");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Password@123");
	
	driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/div/div/div/form/div[4]/button")).click();
	
	System.out.println("Login Successful");
	
	//Assert.assertTrue(driver.getTitle().matches("DASHBOARD"), "Title Page does not match");
	
	//driver.findElement(By.xpath("//*[@id=\"menu-toggle\"]/i")).submit();
	

	Thread.sleep(4000);
	
	WebElement arrow=driver.findElement(By.xpath("//aside/div/a/i"));
	
	arrow.click();
	
	Thread.sleep(5000);
	
	//Actions act= new Actions(driver);
	
	//act.moveToElement(arrow).click().build().perform();
	
	WebElement m=driver.findElement(By.xpath("//*[@id=\"mCSB_7_container\"]/li[2]/a/div[2]/span"));
	m.click();
	Thread.sleep(5000);
	
	WebElement user=driver.findElement(By.xpath("//aside/div/ul/div/div/li[2]/ul/li/a[1]"));
	user.click();
	Thread.sleep(5000);
	

	
	WebElement create=driver.findElement(By.xpath("//*[@id=\"lesson-plan-list\"]/div[1]/nav/label"));
	create.click();
	Thread.sleep(3000);
	
	WebElement createuser=driver.findElement(By.xpath("//*[@id=\"lnkCreateUser\"]"));
	createuser.click();
	Thread.sleep(3000);
	
	//WebElement upload= driver.findElement(By.xpath("//*[@id=\"dvStaticUser\"]/div/div[2]/div[1]/div/div/div/div[2]/div/div[1]/input"));
	//upload.click();
	//Thread.sleep(3000);
	
	
	
	driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("test1");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("test2");
	driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("test4");
	driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]")).sendKeys("test1.test2@gmail.com");
	
	//WebElement dateBox = driver.findElement(By.xpath("//*[@id=\"AccountExpiryDate\"]"));
    //dateBox.sendKeys("09072020");
    Thread.sleep(3000);
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement Element=driver.findElement(By.xpath("//select"));
    js.executeScript("arguments[0].scrollIntoView();", Element);	
 
    
    Select Country= new Select(driver.findElement(By.xpath("//div/select[@class='form-control']")));
	Country.selectByVisibleText("India");
	
	Thread.sleep(3000);
 Select State= new Select(driver.findElement(By.xpath("//option[text()='Select State']//parent::select")));
 State.selectByVisibleText("Karnataka");
	
	driver.findElement(By.xpath("//*[contains(@id,'ee823')]")).sendKeys("Bengaluru");
	driver.findElement(By.xpath("//*[contains(@id,'c6c9')]")).sendKeys("560036");
	driver.findElement(By.xpath("//*[contains(@id,'95dca')]")).sendKeys("560036");
	Thread.sleep(3000);
	

    
	
	
	driver.close();
	
	driver.quit();
	
	

}

}
