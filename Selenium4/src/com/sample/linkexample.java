package com.sample;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Account\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testleaf.herokuapp.com/pages/Link.html");
		WebElement homepageLink = driver.findElement(By.linkText("Go to Home Page"));
		homepageLink.click();
		driver.navigate().back();
		WebElement whereToGo = driver.findElement(By.partialLinkText("Find where"));
		String where = whereToGo.getAttribute("href");
		System.out.println("This link is going to" + where);
		
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		
		String title = driver.getTitle();
		
		if(title.contains("404")) {
			System.out.println("The link is broken");
		}
		
		driver.navigate().back();
		
		homepageLink.click();
		
		driver.navigate().back();
		
       // totalLink 
		List<WebElement> totalLink = driver.findElements(By.tagName("a"));
		System.out.println("tolatlink is " + totalLink.size());
		
		  
	//	System.out.println("total link" + totalLinks);
		
	}

}
