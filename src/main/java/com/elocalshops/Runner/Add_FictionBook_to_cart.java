package com.elocalshops.Runner;

import org.testng.annotations.Test;

import com.elocalshops.ReusableComponents.Base;

public class Add_FictionBook_to_cart extends Base {
	@Test(priority=1)
	public void Add_fictionbook_cart()
	{
	    homepage.click_on_fictionNovels_form_books();
	    log.info("Selected the fiction novels from Books dropdown and clicked on it");
	    books.Add_book_harry();
	    log.info("clicked on the book harry from the books displayed");
	    books.adding_to_cart();
	    log.info("Added the selected book to the cart");
	}
	
}
