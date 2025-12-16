package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumBasics.Base;

public class DropDownHandling extends Base 
    {
	public void dropdownSelectByValue()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
        Select select=new Select(dropdown);
        select.selectByValue("Red");    
	}
	
	public void selectByVisibleText()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
        Select select=new Select(dropdown);
         select.selectByVisibleText("Yellow");
	}
	
	public void selectByIndex()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
        Select select=new Select(dropdown);
        select.selectByIndex(3);
	}

	public static void main(String[] args)
	{
		DropDownHandling dropDownHandling=new DropDownHandling();
		dropDownHandling.initializebrowser();
		//dropDownHandling.dropdownSelectByValue();
		//dropDownHandling.selectByVisibleText();
		dropDownHandling.selectByIndex();
		
	}

}
