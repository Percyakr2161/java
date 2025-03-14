// Write a java program to read ‘n’ names of your friends, //store it into linked list, also
//display contents of the same

import java.util.*;

class FriendList {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<String> friends = new LinkedList<>();
		System.out.print("Enter number of friends:");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter friend " + (i + 1) + ":");
			friends.add(sc.nextLine());
		}
		System.out.println("Friends:"+friends);
		sc.close();
	}
}
