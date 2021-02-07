package com.Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
	WebDriver driver;
	
	@Given("^I want to write a step with precondition$")
    public void i_want_to_write_a_step_with_precondition() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		 driver = new ChromeDriver();
	     //driver.manage().window().maximize();
	     
	     
	     driver.get(System.getProperty("propertyName2"));
	     
	     FileInputStream fis = 
		 new FileInputStream("C:\\Users\\Prince\\eclipse-workspace\\Cucumber\\src\\test\\resources\\com\\Cucumber\\db.properties");
					
					Properties prop = new Properties();
					prop.load(fis);
					String browser = System.getProperty("propertyName1");
					String url = System.getProperty("propertyName2");
					System.out.println("System Variables Browser is :"+browser);
					System.out.println("System Variables Url is :"+url);
					prop.setProperty("db.url",url);
					String username = prop.getProperty("db.username");
					String dburl = prop.getProperty("db.url");
					System.out.println("Config username is :"+username);
					System.out.println("Config Url is :"+dburl);
				
	     Thread.sleep(3000);
	    
	     driver.quit();
	   
    }
	
	@Given("^I want to write a step with newcondition$")
	    public void i_want_to_write_a_step_with_newcondition() throws Throwable {
	       System.out.println("I am new condition tag2");
	    }

    @Given("^I want to write a step with previouscondition$")
    public void i_want_to_write_a_step_with_previouscondition() throws Throwable {
        System.out.println("I am previous condition tag3");
    }
}
