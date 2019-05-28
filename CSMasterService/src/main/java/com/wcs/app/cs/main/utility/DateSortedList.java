package com.wcs.app.cs.main.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.wcs.app.cs.main.model.BranchProductTarget;

@Component
public class DateSortedList {

	
	static public List<BranchProductTarget> datesort(List<BranchProductTarget> list, String fromdate, String todate) {
		System.out.println("In a Date Sort ");

		SimpleDateFormat sdate = new SimpleDateFormat("MMM dd yyyy");

		try {
			
			fromdate = fromdate.substring(4);
			System.out.println("from date:"+fromdate);
			Date fdate = sdate.parse(fromdate);

			System.out.println("From date:" + fdate);

			todate = todate.substring(4);
			
			System.out.println("to date :"+todate);
			Date tdate = sdate.parse(todate);

			System.out.println("Todate :" + tdate);

			List<BranchProductTarget> sortedlist = new ArrayList<BranchProductTarget>();

			for (BranchProductTarget brtarDate : list) {

				System.out.println("brtarDate:" + brtarDate);

				String date1 = brtarDate.getTargetDate();

				date1 = date1.substring(4);

				Date d1 = sdate.parse(date1);

				if (d1.after(fdate) && d1.before(tdate)) {
					System.out.println("Date is Between given date period" + d1);

					sortedlist.add(brtarDate);
				} else if (d1.equals(fdate) || d1.equals(tdate)) {

					System.out.println("Date1 is equal to Date2" + d1);

					sortedlist.add(brtarDate);

				}
				else {
					System.out.println("not in between given dates");
				}

			}
			System.out.println(sortedlist);
			return sortedlist;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	

}
