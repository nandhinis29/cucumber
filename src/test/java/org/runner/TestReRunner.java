package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefenition1.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@rerun\\failed.txt", glue="org.stepdefenition1",monochrome=true,dryRun=false,strict=true,plugin=
{"rerun:\\C:\\Users\\LOGESH\\eclipse-workspace\\Cucumber\\rerun\\failed.txt"})

public class TestReRunner {
	
		@AfterClass
		public static void reports() {
			JVMReport.generateReports(System.getProperty("user.dir") + "\\Allreports\\JSONReport\\facebook.json");
			}
		
		}

