package com.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
tags="@tag3"
		)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}
