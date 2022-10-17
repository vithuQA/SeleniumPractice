package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Account\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testleaf.herokuapp.com/pages/table.html");
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int noofcolumns = columns.size();
	    System.out.println("Number of columns " + noofcolumns);
		  
		List<WebElement>  rows = driver.findElements(By.tagName("tr"));
		int noofrows = rows.size();
		System.out.println("Number of rows " + noofrows);
		
		WebElement getpercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent = getpercent.getText();
		System.out.println(percent);
		
		List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberList = new ArrayList<Integer>();

		for (WebElement a : allprogress) {
			String eachpercent = a.getText().replace("%", "");
			numberList.add(Integer.parseInt(eachpercent));
		}
		
		System.out.println(numberList);
		int minvalue = Collections.min(numberList);
		String smallvaluestring=Integer.toString(minvalue)+"%";
		String finalxpath = "//td[normalize-space()="+ "\""+smallvaluestring + "\""+"]"+"//following::td[1]";
	    driver.findElement(By.xpath(finalxpath)).click();
	}

}
