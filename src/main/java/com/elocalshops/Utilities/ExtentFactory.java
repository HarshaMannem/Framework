package com.elocalshops.Utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance()
	{
		ExtentReports extent;
		String path=System.getProperty("user.dir")+"\\ExtentReports\\ExtentReportResults.html";
		extent =new ExtentReports(path,false);
		return extent;
	}

}
