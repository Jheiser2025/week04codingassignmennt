package week04coding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class week04CodingProject {
	
public static void main(String[] args) {
	

//Coding Steps
//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

//	List<Integer> ages = Arrays.asList(3, 9, 23, 64, 2, 8, 28, 93);
	ArrayList<Integer> ages = new ArrayList<Integer>();
	ages.add(3);
	ages.add(9);
	ages.add(23);
	ages.add(64);
	ages.add(2);
	ages.add(8);
	ages.add(28);
	ages.add(93);


	//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
	//(i.e. do not use ages[7] in your code). Print the result to the console.  
	    
	int firstAges = ages.get(0);
	int lastAges = ages.get(ages.size() - 1);
	int result1 = lastAges - firstAges;
	     System.out.println("Difference of ages = " + result1);
	 
	
		
	//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

	List<Integer> ages2 = Arrays.asList(8, 5, 13, 30, 45, 105, 42, 50,65);
		
		//i. Make sure that there are 9 elements of type int in this new array.  
int count = ages2.size();
	System.out.println("the number of elements in new array = " + count);


		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array
			//ages2 from the last element of ages2).
	
	int moreAges = ages2.get(0);
	int veryLastAges = ages2.get(ages2.size() - 1);
	int result2 = veryLastAges -moreAges;
	     System.out.println("Difference of ages2 = " + result2);

	
		//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths). 
	     // are you asking for more arrrays or more iterations of ii?
	     

	
	//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
   
	     
double sum = 0;

for (int age : ages2) {
	sum += age;
}

//double result3 = (double) ;
System.out.println("Average age is " + sum / ages2.size());


//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	 	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

	//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the 
		//console.

	   double totalLetters = 0;
	for (String name : names) {
		 totalLetters += name.length();
 }
 //  double averageName =  totalLetters / names.length;  
	  System.out.println("Average number of letters is " + totalLetters / names.length);  
	     
	//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print
	//the result to the console.

	     StringBuilder concatenateNames = new StringBuilder();
for (String name : names) {
	
concatenateNames.append(name).append(" ");

}
System.out.println("names "+ concatenateNames.toString());

//3. How do you access the last element of any array?

//int lastElement = names[names.length -1];

//4. How do you access the first element of any array?

//int firstElement = names[0];

//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add 
		//the length of each name to the nameLengths array.


int[] nameLengths = new int[names.length];   
for (int i = 0; i < names.length; i++) {   
	nameLengths[i] = names[i].length();   
	}


//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
	//Print the result to the console.

	
	 sum = 0; 
for (int length : nameLengths) {
	sum += length;
}
System.out.println("#6 " + sum);

//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n 
	//number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

String result7 = wordConcatenate("Hello", 3);
System.out.println("#7 " + result7);

//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first 
	//and the last name as a String separated by a space).


String firstName = "Cindy";
String lastName = "Black";
String space = " ";


StringBuilder sbe = new StringBuilder();
sbe.append(firstName);
sbe.append(space);
sbe.append(lastName);
System.out.println("#8 " + sbe.toString());

//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	
List<Integer> numberSums = Arrays.asList(8, 5, 13, 30, 45);
	boolean result9 = isGreaterThan100(numberSums);
	System.out.println("Results for problem 9 = " + result9);

//10. Write a method that takes an array of double and returns the average of all the elements in the array.

	double[] glucose = {40.0, 20.0, 30.5, 40.0, 50.5,100.5}; 
	double average = calculateAverage(glucose); 
System.out.println("#10 " + average);

//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
	//is greater than the average of the elements in the second array.
	double[] array1 = {95.0, 80.5, 75.5, 65.0, 50.5}; 
	double[] array2 = {80.5, 99.5, 89.6, 75.6, 75.0};
	boolean average11 = isAverageGreater(array1, array2);
System.out.println("#11 " + average11);


//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true 
	//if it is hot outside and if moneyInPocket is greater than 10.50.
boolean isHotOutside = true; 
double moneyInPocket = 15.00; 
boolean result12 = willBuyDrink(isHotOutside, moneyInPocket);
System.out.println("Will buy drink: " + result12); 


//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
Map<String, Double> shoppingList = Map.of( "TV", 1000.50, "Earbuds", 149.50 );
double taxRate = 0.10;
double totalCost = calculateCostWithTax(shoppingList, taxRate);
	System.out.println("Budget for Gifts $" + totalCost);


}//******end of main *******

//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n 
	//number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

public static String wordConcatenate (String word, int n) {
	StringBuilder result7= new StringBuilder();
	for (int i = 0; i <n; i++) {
		result7.append(word);
	}
return result7.toString();
}

//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first
//and the last name as a String separated by a space).

public static String fullName(String firstName, String lastName) {
	return firstName + " " + lastName;
}

//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
public static boolean isGreaterThan100(List<Integer> numberSums) {
	int sum = 0;
	for (int number : numberSums) {
		sum+= number;
	}
	return sum > 100;
}

//10. Write a method that takes an array of double and returns the average of all the elements in the array.
public static double calculateAverage(double[] glucoses) { 
	double sum = 0;
	for (double glucose : glucoses) {
		sum += glucose;
		}
	return sum/glucoses.length;
	
}

//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
	//is greater than the average of the elements in the second array.
public static boolean isAverageGreater(double[] array1, double[] array2) {
//	double sum1 = 0; 
//	for (double number : array1) {
//		sum1 += number; } 
//	double average1 = sum1 / array1.length; 
//	double sum2 = 0; 
//		for (double number : array2) { 
//			sum2 += number;
//			} 
//		double average2 = sum2 / array2.length; 
//		//return average1 > average2;
return(calculateAverage(array1))>(calculateAverage(array2));
} 


//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true 
	//if it i hot outside and if moneyInPocket is greater than 10.50.
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	return isHotOutside && moneyInPocket > 10.50;
}


//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

public static double calculateCostWithTax(Map<String, Double> shoppingList, double taxRate) { 
	double totalCost = 0.0; 
	for (double price : shoppingList.values()) {
		totalCost += price + (price * taxRate); 
	} 
	return totalCost;
	}

}//************end of Class*******


