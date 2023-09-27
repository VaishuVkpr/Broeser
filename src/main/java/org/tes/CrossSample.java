package org.tes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossSample {
	@Parameters("browser")
	@Test
	private void tc1(String browserName) {
		WebDriver driver;
		if (browserName.equals("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefoxbrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			}
		else {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();

		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

}
