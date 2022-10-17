package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Account\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://filesamples.com/formats/ods");
		driver.findElement(By.xpath("//*[@id=\"ezmobfooter\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"output\"]/div[1]/a")).click();

	}

}
