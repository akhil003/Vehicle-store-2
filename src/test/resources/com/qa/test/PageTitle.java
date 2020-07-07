package com.qa.test;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {
	 
	@Test
	public void title() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhil.shukla.NOLAPF2FFLWS027\\Downloads\\VehicleStore-master\\VehicleStore-master\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("localhost:8585");
		
					String actualTitle = driver.getTitle();
				
					String expectedTitle = "Vehcle store";
					if(actualTitle.equalsIgnoreCase
							(expectedTitle))
						System.out.println("Title Matched");
					else
						System.out.println("Title didn't match");
		 
    }

}
