package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random rand = new Random();
		//1. make an array of 5 Strings
		String[] array= {"string1","string2","string3","string4","string5"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2]="asdfghjkl";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//6. make an array of 50 integers
		int[] array2 = new int[50];
		for (int i = 0; i < array2.length; i++) {
			array2[i]=rand.nextInt(200);
		}
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		int smallest=200;
		for (int i : array2) {
			if(i<smallest) {
				smallest=i;
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for (int i : array2) {
			System.out.println(i);
		}
		//10. print the largest number in the array.
		int largest=-1;
		for (int i : array2) {
			if(i>largest) {
				largest=i;
			}
		}
		System.out.println(largest);
	}
}
