/*
 * 
Problem : Merge Two Sorted Arrays
You are given two sorted arrays arr1 of size m and arr2 of size n. Your task is to merge these two arrays into 
a single sorted array without using any extra space (i.e., in-place merging). The elements in arr1 should be merged first, 
followed by the elements of arr2, resulting in both arrays being sorted after the merge.

Solution:
First sort the first array with comparing with the second array.
Second sort the second array using bubble sort.
 */

public class Day_4_Inplace_merge_Sort {

    public static void sort_array(int[] arr1,int[] arr2) 
    {   
        int i=0;
        int j=0;
        int temp;
        while(i<arr1.length)
        {
            if (arr1[i] > arr2[j])
            {   
                temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;  
            }
            i++;
        }
        i=i-1;
        while(j<arr2.length)
        {
            if (arr1[i] > arr2[j])
            {   
                temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;  
            }
            j++;
        }

        for (i = 0; i < arr2.length; i++)   // bubble sort
        {
            for (j=0; j < i; j++)
            {
                if (arr2[j] > arr2[j+1])
                {   
                    temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;  
                }
            }
        }

        for (int k = 0; k < arr1.length; k++) 
        {
            System.out.print(arr1[k]+" ");
        }

        System.out.println(" ");
        for (int k = 0; k < arr2.length; k++)
        {
            System.out.print(arr2[k]+ " ");
        }
  
    }
    
    public static void main(String[] args) {

        int[] array1 = {1,6,8}; // Array1
        int[] array2 = {3,5,7,9}; // Array2
        sort_array(array1,array2);     

    }

}