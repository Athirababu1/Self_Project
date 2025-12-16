package seleniumBasics;

import java.util.zip.ZipEntry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Form_Submitpage_automation extends Base
    {
	public void submitform()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
	}
	
	public void firstname()
	{
		WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		firstname.sendKeys("Athira"); 
	}
	
	public void lastname()
	{
		WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastname.sendKeys("Babu");
	}
	public void username()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		username.sendKeys("athi@123");
	}
	public void location()
	{
		
		WebElement city=driver.findElement(By.cssSelector("input.form-control[placeholder='City']"));
		city.sendKeys("kollam");
		WebElement state=driver.findElement(By.cssSelector("input.form-control[placeholder='State']"));
         state.sendKeys("kerala");
		
	}
	public void zip()
	{
		WebElement zip=driver.findElement(By.cssSelector("input.form-control[placeholder='Zip']"));
		zip.sendKeys("687867");
	}
	public void termsAndCondition()
	{
		WebElement termsandcondition=driver.findElement(By.cssSelector("input[type='checkbox']"));
		termsandcondition.click();
	}
	public void submit()
	{
		WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
		submit.click();
	}

	public static void main(String[] args) 
	{
		 Form_Submitpage_automation formsubmtpgeautomation=new  Form_Submitpage_automation();
		 formsubmtpgeautomation.initializebrowser();
         formsubmtpgeautomation.submitform();
		formsubmtpgeautomation.firstname();
		formsubmtpgeautomation.lastname();
		formsubmtpgeautomation.username();
		formsubmtpgeautomation.location();
		formsubmtpgeautomation.zip();
		formsubmtpgeautomation.termsAndCondition();
		formsubmtpgeautomation.submit();
		 
		
	}

}
