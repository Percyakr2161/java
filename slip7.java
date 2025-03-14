Write a program that loads names and phone numbers from a text file where the
data is organized as one line per record and each field in a record are separated
by a tab (\t).it takes a name or phone number as input and prints the
corresponding other value from the hash table (hint: use hash tables)


import java.io.*;
import java.util.*;

class PhoneBook {

	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		Hashtable<String , String> phoneBook = new Hashtable<>();

		try(BufferedReader br = new BufferedReader(new FileReader("contacts.txt"))) {
		String line;

		while ( (line = br.readLine()) != null) {
		
			String[] parts = line.split("\t");
			 
			if(parts.length == 2) {
			
				phoneBook.put(parts[0], parts[1]);
				phoneBook.put(parts[1], parts[0]);
			}
		    }
		}
		System.out.print("Enter name or phone number:");
		String input = sc.nextLine();
		System.out.println(phoneBook.getOrDefault(input, "Not Found"));

		sc.close();
	}
}
