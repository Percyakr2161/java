Program to define a thread for printing text on output screen for ‘n’ number of times.
Create 3 threads and run them. Pass the text ‘n’ parameters to the thread constructor.
Example: i. First thread prints “COVID19” 10 times.
 ii. Second thread prints “LOCKDOWN2020” 20 times
 iii. Third thread prints “VACCINATED2021” 30 times 



 class PrintThread extends Thread {

	private String text;
	private int count ;

	public PrintThread(String text, int count) {
	
		this.text = text;
		this.count = count;
	}
	public void run() {
	
		for(int i=0;i< count;i++) {
		
			System.out.println(text);
		}
	}
}
class MultiThreadDemo {

	public static void main(String[] args) {
	
		Thread t1 = new PrintThread("COVID19", 10);
		Thread t2 = new PrintThread("LOCKDOWN2020", 20);
		Thread t3 = new PrintThread("VACCINATED2021", 30);

		t1.start();
		t2.start();
		t3.start();
	}
}



Q2) 

Design a servlet that provides information about a HTTP request from a client, such as
IP address and browser type. The servlet also provides information about the server on
which the servlet is running, such as the operating system type, and the names of
currently loaded servlets.


package slip6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloDate {

    private String name;

    public void getName() {
        System.out.println("Your message is: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getCurrentDateAndTimeUsingDate() {
        // Correct way to get the current date
        Date date = new Date(); 

        // Define the format
        String strDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);

        // Format the current date
        String formattedDate = dateFormat.format(date);

        // Print the current date and time
        System.out.println("Current time is: " + formattedDate);
    }
}
