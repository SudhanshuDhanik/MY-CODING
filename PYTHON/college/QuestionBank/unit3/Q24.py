# 4. Write a Python function that takes a list of integers and returns the maximum sum of a 
# non-empty subarray such that no two elements in the subarray are adjacent
def maxSum(arr, n):
    # Base case
    if n == 0:
        return 0
    if n == 1:
        return arr[0]
    if n == 2:
        return max(arr[0], arr[1])
 
    # DP table to store solutions to subproblems
    dp = [0] * n
 
    # Initializing base cases
    dp[0] = arr[0]
    dp[1] = max(arr[0], arr[1])
 
    # Filling up the DP table using recurrence relation
    for i in range(2, n):
        dp[i] = max(dp[i - 1], arr[i] + dp[i - 2])
 
    # Returning the final answer
    return dp[n - 1]
arr = [12, 90, 70, 33]
n = len(arr)
print(maxSum(arr, n))