package org.stepdefenition1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateReports (String jsonPath) {
		
		//1.mention file location
		File f = new File(System.getProperty("user.dir") + "\\Allreports\\JVMReport");
		
		//2.configuration class
		Configuration c = new Configuration(f, "facebook");
		c.addClassifications("JDK", "1.8");
		c.addClassifications("plateform", "Windows");
		
        //3.to add the json file path to the list
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		//4.report builder class
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}
}