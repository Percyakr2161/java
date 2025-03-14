Write a program to solve producer consumer problem in which a producer produces a
value and consumer consume the value before producer generate the next value. (Hint:
use thread synchronization).

class Communication {

	public static void main(String[] args) {
	
		Producer p =new Producer();
		Consumer c = new Consumer(p);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}

class Producer extends Thread
{
	StringBuffer sb;
	Producer() {
	
		sb = new StringBuffer();
	}
	public void run() {
		
		synchronized(sb)
		{
			for(int i=1; i<=10; i++)
			{
				try {
				
					sb.append(i+ ":");
					Thread.sleep(10);
					System.out.println("appending");
				}
				catch(InterruptedException ae)
				{
					System.out.println(ae);
				}
			}
			sb.notify();
		}
	}
}
	class Consumer extends Thread
	{
		Producer prod;
		Consumer(Producer prod)
		{
			this.prod = prod;
		}
		public void run()
		{
			synchronized(prod.sb)
			{
				try {
				
					prod.sb.wait();
				}
				catch(InterruptedException ae)
				{
					System.out.println(ae);
				}
				System.out.println(prod.sb);
			}
		}
	}


    q2) Write a program to display information about all columns in the DONAR table using
    ResultSetMetaData.

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
