/*
Problem: Find the missing number
You are given an array arr containing n-1 distinct integers. 
The array consists of integers taken from the range 1 to n, meaning one integer is missing from this sequence.
Your task is to find the missing integer.

Solution:
First find the sum of n numbers. Then find sum of the array. Then substract both.
The result is the solution.

 */

public class Day_2_Finding_missing_Num_in_array
{
    public static int findNum(int[] arr)  // Function to find the missing element
    {   
        int sum_of_n = 0;

        for (int i = 1; i <= arr.length+1; i++)  // To find the sum of n numbers
        {
            sum_of_n = sum_of_n + i;
        }

        int sum_of_array=0;

        for (int i = 0; i < arr.length; i++)  // To find sum of the array
        {
            sum_of_array= sum_of_array + arr[i];
        }
        return (sum_of_n - sum_of_array);
    }
    
    public static void main(String[] args) {

        int[] initial_array = {1,2,3,4,6,7}; // Array
        int result;
        result = findNum(initial_array);     // Calling find function
        System.out.print("The missing element is: ");
        System.out.println(result);
    }


}