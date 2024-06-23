# Write a Python function that takes a set of tuples and returns a new set containing tuples 
# with the same second element. If multiple tuples have the same second element, include 
# only one of them in the result.
def same_second_element_tuples(input_set):
    # Create a dictionary to store tuples with the same second element
    result_dict = {}
    
    # Iterate through each tuple in the input set
    for tup in input_set:
        # Extract the second element of the tuple
        second_element = tup[1]
        
        # Check if the second element is already in the dictionary
        # If not, add the tuple to the dictionary with the second element as the key
        if second_element not in result_dict:
            result_dict[second_element] = tup
    
    # Convert the values of the dictionary back to a set
    result_set = set(result_dict.values())
    
    return result_set

# Example usage:
input_set = {(1, 2), (3, 4), (5, 4), (7, 8), (9, 4)}
result = same_second_element_tuples(input_set)
print(result)
