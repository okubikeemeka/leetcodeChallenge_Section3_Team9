# PSEUDOCODES FOR THE LEETCODE EXERCISES

## Pseudocode for Exercise 1 (Missing Number)
Steps:
- Define the method findMissingNumber(nums) that takes an array nums as input.
- Calculate n as the length of the array.
- Calculate the expected sum of numbers from 0 to n using the arithmetic sum formula.
- Calculate the actual sum by:
    - Setting actualSum to 0,
    - Then, Loop through each element in the array,
    - Add the element to actualSum.
- Find the missing number by subtracting actualSum from the expected sum.
- Return the missing number.
- Outputs:
   - Prints missing numbers for the three examples provided in exercise.

## Pseudocode for Exercise 2 (Average Salary)
Steps:
- Define a method averageSalary that takes an array of integers (salary) as input. The method calculates the average salary, excluding the smallest and largest values.
- Initialize these variables:
    - Minimum value (minSalary)
    - Maximum value (maxSalary)
    - Total sum (totalSum)
- Loop through each salary in the input array:
   - Add the current salary to the total sum.
   - Update the minimum salary if the current salary is smaller.
   - Update the maximum salary if the current salary is larger.
- Adjust the total sum by removing the minimum and maximum salaries.
- Calculate number (count) of remaining salaries.
- Calculate the average of the remaining salaries.
- Return the calculated average.
- Print the results for examples provided in the exercise.

## Pseudocode for Exercise 3 (Add Two Numbers)
Steps:
- Create a dummy head node with an initial value of 0.
	- Create a pointer current that points to the dummy head.
	- Initialize a variable carry to 0 to track the carry value during the addition process.
- Continue iterating as long as there are nodes left in either l1 or l2, or a carry value greater than zero.
- Start with the sum equal to the carry value from the previous operation.
- If the current node in l1 exists, add its value to the sum and move the l1 pointer to the next node.
- If the current node in l2 exists, add its value to the sum and move the l2 pointer to the next node.
- Calculate the new carry value as the integer division of sum by 10 (i.e., carry = sum / 10).
- Create a new node with the value equal to the ones digit of sum (i.e., current.next = new ListNode(sum % 10)).
- Move the current pointer to the newly created node.
- Go back to step 4 until both l1, l2, and the carry are processed.
- Return the node following the dummy head (dummyHead.next), which is the beginning of the resulting list.

## Pseudocode for Exercise 4 (Merge Two Sorted Lists)
Inputs: list1 and list2
Steps:
- Create a result list
- While both lists have a next node
    - Consider the next node in each list to get a node1 and node2
    - If node1.value <= node2.value
        - add node1 to the result list
        - add node2 to the result list
    - Else
        - add node2 to the result list
        - add node1 to the result list
  - While node1 is not null
     - add node1.val to the result
     - set node1 = node1.next
  - While node2 is not null
     - add node2.val to the result
     - set node2 = node2.next
- Return result list 

## Pseudocode for Exercise 5 (Squares of a Sorted Array)
Steps:
- Given array is sorted in ascending order
- Create sortedNums with the same length as nums
   - foreach value in nums
   - square the value
- Insert squaredValue in same position in sortedNums
   - sort sortedNums in ascending order
   - return sortedNums

