/*
Problem : 
Find All Subarrays with Zero Sum.
You are given an integer array arr of size n. Your task is to find all the subarrays whose elements sum up to zero. 
A subarray is defined as a contiguous part of the array, and you must return the starting and 
ending indices of each subarray.
 */
import java.util.ArrayList;
import java.util.List;

public class Day_6_Subarray_with_sumZero 
{

    // Function to find all subarrays with sum zero
    public static List<int[]> find_sum_zero(int[] arr) 
    {   
        List<int[]> result = new ArrayList<>(); // To store the results
        int starting_index = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) 
        {   
            starting_index = i;
            sum = 0;

            for (int j = i; j < arr.length; j++) 
            {
                sum += arr[j]; 
                // If sum becomes zero, store the starting and ending indices
                if (sum == 0)
                {
                    result.add(new int[] {starting_index, j}); 
                }
            }
        }

        return result;
    }

    public static void main(String[] args) 
    {
        int[] array = {4,-1,-3,1,2,-1};
        
        List<int[]> subarrays = find_sum_zero(array);

        List<String> output = new ArrayList<>();
        for (int[] subarray : subarrays) 
        {
            output.add("(" + subarray[0] + ", " + subarray[1] + ")");
        }
        System.out.println(output);
    }
}
