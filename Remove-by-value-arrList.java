// Java program to Remove Elements from ArrayList
// Using remove() method by values

// Importing required classes
import java.util.ArrayList;
import java.util.List;

// Main class
public class Remove-by-value-arrList {
	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of List interface with
		// reference to ArrayList
		List<Integer> al = new ArrayList<>();

		// Adding elements to ArrayList class
		// using add() method
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);

		// Printing the current ArrayList
		System.out.println(al);

		// This makes a call to remove(Object) and
		// removes element 1
		al.remove(Integer.valueOf(1));

		// This makes a call to remove(Object) and
		// removes element 2
		al.remove(Integer.valueOf(2));
		
		// Printing the modified ArrayList
		System.out.println(al);
	}
}
