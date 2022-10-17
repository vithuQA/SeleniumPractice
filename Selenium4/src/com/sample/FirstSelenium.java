package com.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) throws AWTException {
		Robot robot = new Robot();

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\My Account\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\application\\Untitled document.docx");
		
		driver.findElement(By.id("file-submit")).click();
		/* WebElement uploadbutton = driver.findElement(By.xpath("//input[@id='file-upload']"));

		uploadbutton.click(); */
		
		//input[@id='file-upload']

	/*	String files = "C:\\application\\Untitled document.docx";*/
		// StringSelection Selection = new StringSelection("C:\\application\\Untitled document.docx");
	//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection,null);
		
	/*	robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER); */
		
		/*try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		*/
	}
	

}
