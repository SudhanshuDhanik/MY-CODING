# Create a Python module named data_operations that includes functions for working 
# with data, such as mean, median, and mode. In your main script, import this module 
# using aliasing, and only import the median function. Demonstrate the use of the median 
# function on a list of numbers

# data_operations.py
def mean(data):
    #Calculate the mean (average) of a list of numbers.
    if not data:
        return None
    return sum(data) / len(data)

def median(data):
   # Calculate the median of a list of numbers.
    sorted_data = sorted(data)
    n = len(sorted_data)

    if n % 2 == 0:
        # If the number of elements is even, calculate the average of the middle two elements
        mid1 = sorted_data[n // 2 - 1]
        mid2 = sorted_data[n // 2]
        return (mid1 + mid2) / 2
    else:
        # If the number of elements is odd, return the middle element
        return sorted_data[n // 2]

def mode(data):
    #Calculate the mode of a list of numbers.
    if not data:
        return None

    counts = {}
    for num in data:
        counts[num] = counts.get(num, 0) + 1

    mode_list = [key for key, value in counts.items() if value == max(counts.values())]
    
    return mode_list

# main_script.py
# Importing the median function from the data_operations module using aliasing
from data_operations import median as calculate_median

# Example usage
data = [4, 8, 2, 6, 7, 3, 8, 1, 5]

# Calculate and print the median using the alias
result = calculate_median(data)
print(f"The median of the list is: {result}")

