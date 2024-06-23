# Write a program to check whether an element “y” and “a” belongs to the tuple 
# My_tuple = (“p” , “y” ,”t” , “h”, “o” , “n “) and printing the result, delete the tuple
# Given tuple
my_tuple = ("p", "y", "t", "h", "o", "n")

# Check if "y" and "a" belong to the tuple
element_y_exists = "y" in my_tuple
element_a_exists = "a" in my_tuple

# Print the result
print(f"Element 'y' exists: {element_y_exists}")
print(f"Element 'a' exists: {element_a_exists}")

# Delete the tuple
del my_tuple

# Attempting to access the tuple after deletion will result in an error
# Uncomment the line below to see the error
#gj