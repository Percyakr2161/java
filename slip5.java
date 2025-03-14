Accept ‘n’ integers from the user. Store and display integers in sorted order having
proper collection class. The collection should not accept duplicate elements. 

import java.util.*;

class UniqueSortedNumbers 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		TreeSet<Integer> numbers = new TreeSet<>();

		System.out.print("Enter number of integers:");
		int n = sc.nextInt();

		System.out.println("Enter" + n + "Unique integers:");
		for(int i=0;i<n;i++)
		{
			numbers.add(sc.nextInt());
		}
		System.out.println("Sorted Unique Numbers:"+numbers);
		sc.close();
	}
}

