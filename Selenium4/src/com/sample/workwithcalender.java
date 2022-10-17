package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workwithcalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Account\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testleaf.herokuapp.com/pages/Calendar.html");
		
		//01
		//withsendkeys 
		WebElement calender = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		calender.sendKeys("11/10/2022",Keys.ENTER);
		//02
		//xpath
		WebElement calender1 = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		calender1.click();
		WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
		nextbutton.click();
		WebElement Givendate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a"));
		Givendate.click();
	}

}
