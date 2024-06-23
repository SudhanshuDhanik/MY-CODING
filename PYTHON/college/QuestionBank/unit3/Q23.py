# Write a Python function to find the kth smallest subarray sum from a given list of 
# positive integers. The subarray sum is the sum of consecutive elements in the list.

import math 
# Function to find the Smallest Subarray with
# Sum K from an Array
def smallestSubarraySumK(arr,  k):
    result = 2147483647 
 
    for i in range(0, len(arr)): 
        ans = 0 
        for j in range(i, len(arr)):
            ans += arr[j] 
            if (ans == k): 
                result = min(result, (j - i + 1)) 
             
    # Return result
    return result
 
 
# Driver code
 
arr = [ -8, -8, -3, 8 ] 
k = 5
 
result = smallestSubarraySumK(arr, k) 
if (result == 2147483647):
    print(-1) 
else:
    print(result) 