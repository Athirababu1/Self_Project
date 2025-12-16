package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumBasics.Base;

public class CheckBox_Handling extends Base
    {
	
	public void singleCheckboxSelectio()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singlecheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singlecheckbox.click();	
	}
	
	public void countOfAllCheckboxes()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> count=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total count of radiobutton = " +count.size());
	}
	
	public void SingleCheckBox() //isSelected by default
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singlecheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
        if(singlecheckbox.isSelected())
        {
        	System.out.println("single check box is already selected"  ); 
        }
        else
        {
        	singlecheckbox.click();
        }
	}
	public void MultipleCheckBoxes() //select a checkbox from multiple checkboxes
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> count=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement list:count)
        {
        	if(list.getAttribute("id").equals("check-box-two"))
        	{
        		list.click();
        	}
        }
	}
	
	public void selcectall()  //select all check box
	{
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> count=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement list:count)
		{
			list.click();
			WebElement singlecheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
			if(singlecheckbox.isSelected())
			{
				singlecheckbox.click();
			}
			
		}
		
	}

	public static void main(String[] args)
	{
		CheckBox_Handling checkBoxHandling =new CheckBox_Handling();
		checkBoxHandling.initializebrowser();
		//checkBoxHandling.singleCheckboxSelectio();	
		//checkBoxHandling.countOfAllCheckboxes();
		//checkBoxHandling.SingleCheckBox();
		checkBoxHandling.MultipleCheckBoxes();
		//checkBoxHandling.selcectall();
		

	}

}
