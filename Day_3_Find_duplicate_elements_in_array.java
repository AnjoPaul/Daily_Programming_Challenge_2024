/*
Problem: Find the duplicate number
You are given an array arr containing n+1 integers, where each integer is in the range [1, n] inclusive. 
There is exactly one duplicate number in the array, but it may appear more than once. Your task is to 
find the duplicate number without modifying the array and using constant extra space.

Input :
An integer array arr of size n+1, where each element is an integer in the range [1, n].

Solution:
First find the sum of n numbers. Then find sum of the array. Then substract sum of array with
sum of n numbers. The result is the solution.
 */

public class Day_3_Find_duplicate_elements_in_array {

    public static int findDuplicateNum(int[] arr)  // Function to find the missing element
    {   
        int sum_of_n = 0;

        for (int i = 1; i < arr.length; i++)  // To find the sum of n numbers
        {
            sum_of_n = sum_of_n + i;
        }

        int sum_of_array=0;

        for (int i = 0; i < arr.length; i++)  // To find sum of the array
        {
            sum_of_array= sum_of_array + arr[i];
        }
        return (sum_of_array - sum_of_n); // return result
    }
    
    public static void main(String[] args) {

        int[] initial_array = {1,2,3,4,5,4}; // Array
        int result;
        result = findDuplicateNum(initial_array);     // Calling find function
        System.out.print("The duplicate element is: ");
        System.out.println(result);
    }


}
