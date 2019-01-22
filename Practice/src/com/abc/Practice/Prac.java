package com.abc.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String url="http://www.gmail.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	     driver.get(url);
	      try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
		driver.close();


	}

}
