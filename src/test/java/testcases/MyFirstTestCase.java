package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class MyFirstTestCase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		DesktopOptions opt = new DesktopOptions();
		
		opt.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		
		Thread.sleep(5000);
		
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), opt);
		
		driver.findElement(By.name("Seven")).click();
		
		driver.findElement(By.id("plusButton")).click();
		
		driver.findElement(By.name("Nine")).click();
		
		driver.findElement(By.id("equalButton")).click();
		
		Thread.sleep(5000);
		
		String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		System.out.println("Result is : " + output);
		
		driver.close();
		
		//https://github.com/2gis/Winium.Desktop

	}

}
