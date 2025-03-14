//1) Write a program to create a new tree set, add some colors (string) and print out the tree set.


import java.util.*;

class ColorTreeSet {

	public static void main(String[] args)
	{
		TreeSet<String> colors = new TreeSet<>();

		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Purple");

		System.out.println("Treeset of colors:"+colors);
	}
}
