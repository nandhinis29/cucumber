package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefenition1.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefenition1",monochrome=true,dryRun=false,strict=true,plugin=
{"html:C:\\Users\\LOGESH\\eclipse-workspace\\Cucumber\\Allreports\\HTMLReport",
		"junit:C:\\Users\\LOGESH\\eclipse-workspace\\Cucumber\\Allreports\\JunitReport\\fb.xml",
		"json:C:\\Users\\LOGESH\\eclipse-workspace\\Cucumber\\Allreports\\JSONReport\\facebook.json","rerun:\\C:\\Users\\LOGESH\\eclipse-workspace\\Cucumber\\rerun\\failed.txt"})
public class TestRunner {
	@AfterClass
	public static void reports() {
		JVMReport.generateReports(System.getProperty("user.dir") + "\\Allreports\\JSONReport\\facebook.json");
		}
	
	}
