package com.leetcode_exercise2;

public class AverageSalary {

	public static double averageSalary(int[] salary) {
		// Initializes variables to track minimum salary, maximum salary, and total sum
		int minSalary = Integer.MAX_VALUE; // Start with the largest possible value to find the minimum
		int maxSalary = Integer.MIN_VALUE; // Start with the smallest possible value to find the maximum
		int totalSum = 0; // To store the sum of all salaries

		// Loops through the salary array to calculate total sum, minSalary, and
		// maxSalary
		for (int sal : salary) {
			totalSum += sal; // Adds the current salary to the total sum
			if (sal < minSalary) {
				minSalary = sal; // Updates minSalary if the current salary is smaller
			}
			if (sal > maxSalary) {
				maxSalary = sal; // Updates maxSalary if the current salary is larger
			}
		}

		// Subtract minSalary and maxSalary from the total sum to exclude them
		totalSum -= (minSalary + maxSalary);

		// Calculate the count of remaining salaries (excluding min and max)
		int count = salary.length - 2;

		// Calculate and return the average salary (excluding min and max)
		return (double) totalSum / count;
	}

	public static void main(String[] args) {

		int[] salary1 = { 4000, 3000, 1000, 2000 }; // Example 1
		System.out.printf("Example 1 Output: %.5f%n", averageSalary(salary1)); // Expected: 2500.00000

		int[] salary2 = { 1000, 2000, 3000 }; // Example 2
		System.out.printf("Example 2 Output: %.5f%n", averageSalary(salary2)); // Expected: 2000.00000
	}
}
