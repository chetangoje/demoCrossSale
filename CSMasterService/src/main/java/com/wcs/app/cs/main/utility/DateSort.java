package com.wcs.app.cs.main.utility;


import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Component;

import com.wcs.app.cs.main.model.BranchPurchaseOrder;


@Component
public class DateSort 
{

	public List<BranchPurchaseOrder> datesort(List<BranchPurchaseOrder> list, String fromdate, String todate)
	{
		System.out.println("in date sort");
		
		SimpleDateFormat sd=new SimpleDateFormat("EE MMM dd yyyy");
		
		try 
		{	
//		fromdate=fromdate.substring(0, 25);
		Date fd=sd.parse(fromdate);
		System.out.println("from date: "+fd);
		
//		todate=todate.substring(0, 25);
		Date td=sd.parse(todate);
		System.out.println("todate date: "+td);
		
		List<BranchPurchaseOrder> sortedList=new ArrayList<BranchPurchaseOrder>();
		for(BranchPurchaseOrder invoice:list)
		{
//			System.out.println(invoice);
		
			String date1=invoice.getOrderdate();
			SimpleDateFormat sd1=new SimpleDateFormat("EE MMM dd yyyy");
//			date1=date1.substring(0, 25);
			Date d1=sd1.parse(date1);
			 System.out.println("d1"+d1);       
				if ( d1.after(fd) &&  d1.before(td) ) { 
	        	  
	            // When Date d1 > Date d2 
	            System.out.println("Date is between given time period:"+d1);
	            sortedList.add(invoice);
	            System.out.println("sorted:0-"+sortedList);
	        } 
	        else if (d1.equals(fd) || d1.equals(td)) { 
	  
	            // When Date d1 = Date d2 
	            System.out.println("Date1 is equal to Date2"+d1); 
	            sortedList.add(invoice);
	        } 	
		}
			return sortedList;
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			e.printStackTrace();
			return null;
		}
		
	}

}
