Write a program to calculate the sum and average of an array of 1000 integers
(generated randomly) using 10 threads. Each thread calculates the sum of 100
integers. Use these values to calculate average. [Use join method ].


import java.util.*;

class thread implements Runnable {
	
	Thread t;
	int i,no,sum;
	int a[] = new int[1000];

	thread(String s ,int n)
	{
		Random rs = new Random();
		t = new Thread(this,s);

		no = n;
		int j=0;

		for(i=1;i<=1000;i++)
		{
			a[j] = rs.nextInt() % 100;
			j++;
		}
		t.start();
	}
	public void run()
	{
		for(i=0;i<100;i++)
		{
			sum = sum + a[no];
			no++;
		}
		System.out.println("Sum ="+sum);
		System.out.println("Avg ="+sum/100);
	}
}

class ThreadDemo {
	
	public static void main(String[] args)throws InterruptedException
	{
		thread t1 = new thread("g",1);
		t1.t.join();

		thread t2 = new thread("r",100);
		t2.t.join();
	}
}
