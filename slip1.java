//1) Write a java program to accept names of ‘n’ cities, insert same into array list collection and
//display the contents of same array list, also remove all these elements.

import java.util.*;

class CityList {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ArrayList<String> cities = new ArrayList<>();
		System.out.print("Enter number of cities:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter city" + (i + 1) + ":");
			cities.add(sc.nextLine());
		}
		System.out.println("Cities : "+cities);
		cities.clear();
		System.out.println("Cities after removal:"+cities);
		sc.close();
	}
}





