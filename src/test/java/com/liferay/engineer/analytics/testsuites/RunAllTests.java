package com.liferay.engineer.analytics.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;
import com.liferay.gs.testFramework.SeleniumWaitMethods;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		snippets = SnippetType.CAMELCASE, 
		dryRun = true, 
		features = {
			"src/test/resources/acceptancecriteria/FilterPeriodTimeIsReflectingOnChildrenPages.feature"
				},
		glue = { "com.liferay.engineer.analytics.steps"}, 
		tags = {
			"@TestRun",
			"~@ignore" 
		},
		plugin = "html:target/report.html")

public class RunAllTests {
	
	public static Boolean runnedFromAllTestsSuite = false;

	@AfterClass
	public static void afterClass() throws Exception {
		runnedFromAllTestsSuite = false;
		closeDriver();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		runnedFromAllTestsSuite = true;
	}

	public static void closeDriver() {
		if (!runnedFromAllTestsSuite) {
			if (SeleniumReadPropertyKeys.DRIVER.toString().contains("chrome")) {
				SeleniumReadPropertyKeys.DRIVER.close();
				SeleniumWaitMethods.waitMediumTime();
				SeleniumWaitMethods.waitMediumTime();
				SeleniumWaitMethods.waitMediumTime();
				SeleniumReadPropertyKeys.DRIVER.quit();
			}
			else {
				SeleniumReadPropertyKeys.DRIVER.quit();
			}
		}
	}
	
}
