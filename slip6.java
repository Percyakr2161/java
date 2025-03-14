Write a program to sort HashMap by keys and display the details before sorting and
after sorting.


import java.util.*;

 class SortHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>(); 

        map.put(3, "Alice");
        map.put(1, "Charlie");
        map.put(4, "Eve");
        map.put(2, "Bob");
        map.put(5, "David");

        System.out.println("Before Sorting: " + map); 

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map); 

        System.out.println("After Sorting: " + sortedMap);
    }
}



Q2) 

HelloDate


package slip6;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class HelloDate {
	
		
		private String name;
	public void getName() {
		
		System.out.println("youe msg is:"+name);
		
	}
	public void setName(String name) {
		
		this.name =name;
	}
	public void getCurrentDateAndTimeUsingDate() {
		
		Date date = new Date(0);
		String strDateFormat = "hh:mm:ss a";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate = dateFormat.format(date);
		System.out.println("Current date is :"+formattedDate);
	}

}



MainDate

package slip6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainDateApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
		
		HelloDate hb = (HelloDate)context.getBean("helloworld");
		hb.getName();
		hb.getCurrentDateAndTimeUsingDate();
	}

}
