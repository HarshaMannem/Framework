package com.elocalshops.Utilities;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;

public class Logger extends FileAppender {
	public void setFile(String file)
	{
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd__hh-mm-ss");
		file =file.replaceAll("%format", format.format(date));
		super.setFile(file);
	}

}
