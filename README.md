# Team Challenge: Leetcode Exercises

## Overview

This repository contains solutions to selected LeetCode problems as part of a team coding challenge. Each problem is solved collaboratively, with solutions documented alongside their respective pseudocode and flowcharts.

## Problems Solved 
### 1. Missing Number
**Problem Statement:** 
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

**Solution Approach:** 
- Calculate the expected sum of numbers from 0 to n using the arithmetic sum formula.
- Compute the actual sum of all elements in the input array.
- Find the missing number by subtracting the actual sum from the expected sum.
- Return the missing number as the result.

### 2. Average Salary Excluding the Minimum and Maximum Salary
**Problem Statement:** 
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

**Solution Approach:** 
- Traverse the input salary array to calculate the total sum while identifying the smallest (minimum) and largest (maximum) salaries.
- Exclude the smallest and largest salaries from the total sum.
- Determine the count of the remaining salaries.
- Compute the average of the remaining salaries by dividing the adjusted total sum by the count.
- Return the calculated average as the result.

### 3. Add Two Numbers
**Problem Statement:** 
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

**Solution Approach:** 
- Use a dummy head to simplify linked list construction.
- Iterate through the input lists, adding corresponding digits and any carry.
- Compute the carry and the current digit, then create a new node for the result.
- Continue until all digits and the carry are processed.
- Return the result list, starting after the dummy head.

### 4. Merge Two Sorted Lists
**Problem Statement:** 
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

**Solution Approach:**
- Merge two sorted lists into a single sorted list by comparing nodes from each list.
- Traverse both lists simultaneously, adding the smaller node to the result list at each step.
- Append any remaining nodes from either list to the result once one list is fully traversed.
- Return the merged sorted list.


### 5. Squares of a Sorted Array
**Problem Statement:** 
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

**Solution Approach:**
- Iterate through the input array, squaring each element.
- Store the squared values in a new array.
- Sort the resulting array of squared values in ascending order.
- Return the sorted array.

### Check link below to view pseudocodes
**Pseudocode:** See [Pseudocode Document](./pseudocode/pseudocodes.md)

### Check link below to view the flowcharts document
**Flowchart:** See [View Flowcharts Document](./flowcharts.pdf)

**Language used:** Java

**Contributors:** Team members
