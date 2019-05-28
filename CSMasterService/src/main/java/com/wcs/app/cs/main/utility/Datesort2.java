package com.wcs.app.cs.main.utility;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.wcs.app.cs.main.model.BranchPurchaseOrderRequest;
public class Datesort2 {

	
	public static List<BranchPurchaseOrderRequest> datesort(List<BranchPurchaseOrderRequest> list,String fromdate,String todate)
	  {
		  
		  SimpleDateFormat sd=new SimpleDateFormat("MMM dd yyyy");
		  try
		  { 
			  fromdate=fromdate.substring(4);
			  
			  Date fd=new Date(fromdate);
			  Date fd1=sd.parse(fromdate);
			  System.out.println( "from date :"+fd1);
		     
			  todate=todate.substring(4);
			 Date td=new Date(todate);
			 Date td1=sd.parse(todate);
			 System.out.println("To date:"+td1);
			 
			  List<BranchPurchaseOrderRequest> sortedList=new ArrayList<BranchPurchaseOrderRequest>();
		     for(BranchPurchaseOrderRequest invoice:list)
		     {
		    	 String date1=invoice.getDate();
		    	 date1=date1.substring(4);
		    	 Date d1=sd.parse(date1);
		    	 if(d1.after(fd) && d1.before(td) )
		    	 {
		    		 sortedList.add(invoice);
		    	 }
		    	 else if(d1.equals(fd)||d1.equals(td))
		    	 {
		    		 sortedList.add(invoice);
		    	 }
		     }
		     return sortedList;
		  }
		  catch (Exception e) 
		  {
			e.printStackTrace();
		  }
		  return null;
	  }
}
