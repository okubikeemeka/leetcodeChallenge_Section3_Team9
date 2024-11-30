package com.leetcode_exercise5;

import java.util.Arrays;

class SquaredArray {
	public static int[] sortedSquares(int[] nums) {

		// creating a new array to store the result of the sorted squares
		int[] sortedNums = new int[nums.length];
		int index = 0;

		// iterating over the nums array
		for (int value : nums) {

			// finding the squares of each value in the nums array
			int squaredNums = value * value;

			// returning the squares in the new array sortedNums created
			sortedNums[index] = squaredNums;
			index++;
		}
		// array after finding squares of values in it
		System.out.println("Before sorting: " + Arrays.toString(sortedNums));

		// sorting the squaredNums[]
		Arrays.sort(sortedNums);
		return sortedNums;
	}

	public static void main(String[] args) {
		int[] sortedNums = sortedSquares(new int[] { -4, -1, 0, 3, 10 });

		// array after sorting squares of values in it
		System.out.println("After sorting: " + Arrays.toString(sortedNums));

	}
}

