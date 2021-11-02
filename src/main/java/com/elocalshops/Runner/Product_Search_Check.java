package com.elocalshops.Runner;

import java.io.IOException;
import org.testng.annotations.Test;
import com.elocalshops.ReusableComponents.Base;
import com.relevantcodes.extentreports.LogStatus;

public class Product_Search_Check extends Base {
	

	
	@Test
	public void searchItem() throws IOException
	{   
		
		String productname="books";
		homepage.searchProducts(productname);
	    test.log(LogStatus.PASS, "The Search is done");
	
	}

    
    

}
