package com.elocalshops.Runner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.elocalshops.ReusableComponents.Base;
import com.relevantcodes.extentreports.LogStatus;

public class ValidateTitle extends Base {
	
	
	

	@Test
	public void Validation() throws IOException
	{   
		
		String title=driver.getTitle();
		Assert.assertEquals(title,driver.getTitle());
		
		System.out.println(title);
		if(driver.getTitle().equals(title))
		{
			test.log(LogStatus.PASS, "The title is matched");
		}
		else
		{
			test.log(LogStatus.FAIL, "Missmatch of the title");
		}
			}
    
	

}
