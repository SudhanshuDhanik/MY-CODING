# Write a dictionary comprehension to create a dictionary where keys are numbers from 
# 1 to 10, and values are their squares, but only for odd numbers


# Dictionary comprehension to create a dictionary of squares for odd numbers from 1 to 10
squares_dict = {num: num**2 for num in range(1, 11) if num % 2 != 0}

# Print the resulting dictionary
print(squares_dict)
