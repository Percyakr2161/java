Write a program for a simple search engine. Accept a string to be searched. Search for
the string in all text files in the current folder. Use a separate thread for each file. The
result should display the filename, line number where the string is found. 

import java.util.Random;

class RandomNumberThread extends Thread {

	public void run() {
	
		Random random = new Random();

		for(int i=0; i < 10;i++)
		{
			int randomInteger = random.nextInt(100);
			System.out.println("Random Integer generated:"+randomInteger);

			if((randomInteger % 2) == 0) {
				
				SquareThread sThread = new SquareThread(randomInteger);
				sThread.start();
			}
			else
			{
				CubeThread cThread = new CubeThread(randomInteger);
				cThread.start();
			}
			try {
				
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
}
class SquareThread extends Thread {
	
	private int number;

	SquareThread(int number) {
		
		this.number = number;
	}
	public void run() {
	
		System.out.println("Sqaure of:" + number + ":" + (number * number ));
	}
}
class CubeThread extends Thread {
	
	private int number;

	CubeThread(int number )
	{
		this.number = number;
	}
	public void run() {
		
		System.out.println("Cube of " + number + ":" + (number * number * number ));
	}
}
class MultiThreadExample {

	public static void main(String[] args) {
		
		RandomNumberThread thread = new RandomNumberThread();
		thread.start();
	}
}


Q2) 


import java.sql.*;

class ResultSetMetaDataDemo
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:postgresql:tybcs","postgres","postgres");
		System.out.println("COnnection Established");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Student");
		ResultSetMetaData rsmd = rs.getMetaData();
		int n = rsmd.getColumnCount();
		System.out.println("No.of columns="+n);

		for(int i=1;i<=n;i++)
		{
			System.out.println("Columns Number:"+i);
			System.out.println("========");
			System.out.println("Columns name="+rsmd.getColumnName(i));
			System.out.println("Column type="+rsmd.getColumnTypeName(i));
			System.out.println("Columns Width="+rsmd.getColumnDisplaySize(i));
			System.out.println("Columns Precision="+rsmd.getPrecision(i));
			System.out.println("Is Currency="+rsmd.isCurrency(i));
			System.out.println("is ReadOnly="+rsmd.isReadOnly(i));
			System.out.println("is Writable="+rsmd.isWritable(i));
			System.out.println("is Searchable="+rsmd.isSearchable(i));
			System.out.println("is Signed="+rsmd.isSigned(i));
		}
		con.close();
	}
}
