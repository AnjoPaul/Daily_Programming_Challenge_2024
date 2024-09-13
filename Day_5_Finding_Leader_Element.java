/*
Problem : Find the Leaders in an Array
You are given an integer array arr of size n. An element is considered a leader if it 
is greater than all the elements to its right. Your task is to find all such leader elements in the array.
 */
import java.util.ArrayList;
import java.util.List;

public class Day_5_Finding_Leader_Element {

    public static void find_leader(int[] arr1) 
    {   
        List<Integer> result = new ArrayList<>(); // Dynamic list to store leaders
        int i;
        int j;
        int flag;

        for(i=0 ; i < arr1.length-1;i++)
        {   
            flag=0;
            for(j=i+1;j<arr1.length;j++)
            {
                if(arr1[j]>arr1[i]) // To check the condition
                {flag=1;}
            }
            if (flag==0)
            {
                result.add(arr1[i]); // Add the leader to the result list
            }
        }
        
        result.add(arr1[arr1.length - 1]);  // The last element is always a leader

        System.out.println("Leaders: " + result);
    }
    
    public static void main(String[] args) {

        int[] array = {16, 17, 4, 3, 5, 2}; // Array1
        find_leader(array);     

    }
}
