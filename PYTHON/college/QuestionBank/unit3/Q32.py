# Write a Python function that takes a dictionary where keys are names and values are 
# lists of integers. Return a new dictionary where keys are names and values are the sum 
# of the squares of the integers in the corresponding list.
def sum_of_squares(dictionary):
    # Check if the dictionary is not empty
    if not dictionary:
        return {}

    # Create a new dictionary to store the sum of squares
    sum_of_squares_dict = {}

    # Iterate through the dictionary items
    for name, numbers in dictionary.items():
        # Calculate the sum of squares for each list of integers
        sum_squares = sum(x ** 2 for x in numbers)
        sum_of_squares_dict[name] = sum_squares

    return sum_of_squares_dict

# Example usage:
input_dict = {
    'Alice': [1, 2, 3],
    'Bob': [4, 5, 6],
    'Charlie': [7, 8, 9]
}

result = sum_of_squares(input_dict)
print("Sum of Squares:", result)
