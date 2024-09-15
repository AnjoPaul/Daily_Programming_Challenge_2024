'''
Problem : Trapping Rain Water
You are given an array height[] of non-negative integers where each element represents the height of a 
bar in a histogram-like structure. These bars are placed next to each other, and the width of each bar is 1 unit. 
When it rains, water gets trapped between the bars if there are taller bars on both the left and right of the 
shorter bars. The task is to calculate how much water can be trapped between these bars after the rain.

'''

def trap(height):
    if not height or len(height) < 3: # No tapped water cases
        return 0

    n = len(height)
    left_max=[0]*n   # to get max size
    right_max=[0]*n

    # to fill left_max array
    left_max[0]=height[0]
    for i in range(1, n):
        left_max[i] = max(left_max[i-1], height[i])

    # to fill right_max array
    right_max[n-1] = height[n-1]
    for i in range(n-2,-1,-1):
        right_max[i] = max(right_max[i+1], height[i])

    # now calculate trapped water
    trapped_water = 0
    for i in range(1, n-1):
        trapped_water += min(left_max[i], right_max[i]) - height[i]

    
    return trapped_water

# Test cases
array_height=[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
result = trap(array_height)
print(result)

