'''
Problem: Sort an Array of 0s, 1s, and 2s
You are given an array arr consisting only of 0s, 1s, and 2s. The task is to sort the array in increasing order
in linear time (i.e., O(n)) without using any extra space. This means you need to rearrange the array in-place.

'''

# Function to sort the array 
def sort_array(arr):
    zeros=0
    ones=0
    twos=0
    for i in arr:  # Runs in O(n) to get count of 0,1 and 2
        if(i==0):
            zeros+=1
        if(i==1):
            ones+=1
        if(i==2):
            twos+=1
# Runs in O(n) to replace elements in array with first 0 till its count
# then replace with 1 and finally with 2
    for i in range(len(arr)): 
        if i<=(zeros-1):
            arr[i]=0
            ones+=1 # To increment starting index of one
            twos+=1
        elif (i<=ones-1) and (i<=twos):
            arr[i]=1
            twos+=1 # To increment starting index of two
        else:
            arr[i]=2
    return arr

original_array=[0,2,1,0,2,2,1,0,1,2,0,1]
print("Unsorted array: ")
print(original_array)
sorted_array=sort_array(original_array)
print(" ")
print("Sorted array:")
print(sorted_array)