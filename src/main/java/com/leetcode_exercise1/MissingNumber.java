package com.leetcode_exercise1;

public class MissingNumber {
	public static int findMissingNumber(int[] nums) {
		// Get the length of the array, which defines the maximum value 'n' in the range
		// [0, n].
		int n = nums.length;
		// Calculate the expected sum of numbers from 0 to n
		int expectedSum = n * (n + 1) / 2;
		// Calculate the actual sum of the numbers in the array.
		int actualSum = 0;
		for (int num : nums) {
			actualSum += num;
		}
		// The missing number is the difference between the expected sum and the actual
		// sum.
		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		int[] nums1 = { 3, 0, 1 }; // Example 1
		System.out.println("Missing number for Example 1: " + findMissingNumber(nums1)); // Output: 2
		int[] nums2 = { 0, 1 }; // Example 2
		System.out.println("Missing number for Example 2: " + findMissingNumber(nums2)); // Output: 2
		int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 }; // Example 3
		System.out.println("Missing number for Example 3: " + findMissingNumber(nums3)); // Output: 8
	}
}