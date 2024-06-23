# Write a recursive function sum_nested_lists that takes a nested list of integers as an 
# argument and returns the sum of all the integers in the list, considering all levels of 
# nesting.
def sum_nested_lists(nested_list):
    total_sum = 0

    for element in nested_list:
        if isinstance(element, list):
            # If the element is a list, recursively call the function
            total_sum += sum_nested_lists(element)
        elif isinstance(element, int):
            # If the element is an integer, add it to the total sum
            total_sum += element

    return total_sum

# Example usage
nested_list = [1, [2, 3, [4, 5]], [6, [7, 8]]]
result = sum_nested_lists(nested_list)
print("Sum of all integers in the nested list:", result)
