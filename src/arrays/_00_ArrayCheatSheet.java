package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] characters = { "Frisk", "Chara", "Toriel", "Alphys", "Asriel" };
		// 2. print the third element in the array
		System.out.println(characters[2]);
		// 3. set the third element to a different value
		characters[2] = "Undyne";
		// 4. print the third element again
		System.out.println(characters[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < characters.length; i++) {
			System.out.println(characters[i]);
		}
		// 6. make an array of 50 integers
		int[] nums = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(100);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
		}
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		// 10. print the largest number in the array.
		int max = nums[0];
		for (int i = 0; i > nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

		// bubble sort
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) { // for reverse sort, switch to <
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}
}
