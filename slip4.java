///1)Create the hash table that will maintain the mobile number and student name. Display
//the contact list.


import java.util.*;

 class ContactList {

    public static void main(String[] args) {

        Hashtable<String, String> contacts = new Hashtable<>();
        
        contacts.put("9876543210", "Alice");
        contacts.put("9123456789", "Bob");
        contacts.put("9988776655", "Charlie");
        contacts.put("9554433221", "David");
        
        System.out.println("Contact List:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Mobile: " + entry.getKey() + ", Name: " + entry.getValue()); 
        }
    }
}


Q2)


package slip4;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {
//	private static final long serialVersionUID = 1L;
       
    
    public CookieDemo() {
        super();
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s=request.getParameter("sub");
        
        Cookie c=new Cookie("sub",null); 
        out.println("Reset....");
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String s=request.getParameter("sub");
Cookie c1=new Cookie("sub", s);
out.println("You have selected the subject:"+c1.getValue());

	}
	
}




.html


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form method="post" action="CookieDemo">
<input type="radio" name="sub" value="Maths"> Maths <br>
  <input type="radio" name="sub" value="Physics"> Physics <br>    
<input type="radio" name="sub" value="Chemistry"> Chemistry<br>
        <input type="radio" name="sub" value="Biology"> Biology <br>
  <input type="submit" value="Submit">
    </form>   
     <form method="get" action="CookieDemo">  
  <input type="submit" value="reset">
    </form>

</body>
</html>


