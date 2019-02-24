package DateExs;
import java.util.*;
import java.text.*;

public class DateComparison {
    public static void main(String[] args) {
    	SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
    	Date d1;
		try {
			d1 = dateformat.parse("12/01/14");
		
    	Date d2=dateformat.parse("15/9/18");
    	
    	if(d1.after(d2)) {
    		System.out.println("date d1 is later the date d2");
    	}
    	else if(d1.before(d2)) {
    		System.out.println("date d1 is before or earlier date d2");
    	}
    	else if(d1.equals(d2)) {
    		System.out.println("date d1 is equal to date d2");
    	}
		}	
    	catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat sdf=new SimpleDateFormat("dd/M/yyyy hh:mm:ss"); 
		//gives the in which format date is to taken
		Date d=new Date();
		System.out.println(sdf.format(d));// prints the current date using above format
    }
}
