package com.anita.LookIt.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class DateAndTimeapi {
	
	public String calldate() {
	Date date =new Date();
    SimpleDateFormat dateformat=new SimpleDateFormat("MM/dd/YY hh:mm a");
     String datetime1 = dateformat.format(date);
	return datetime1;
	
	
   
}
}