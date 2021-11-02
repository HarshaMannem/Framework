package com.elocalshops.Utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.elocalshops.ReusableComponents.Base;


public class ScreenShots extends Base {
	
	
	
	public static void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\SeleniumNew\\HARSHA\\eclipse-workspace\\Framework\\ScreenShots\\"+result+"screenshot.jpg"));
	
	}
}
