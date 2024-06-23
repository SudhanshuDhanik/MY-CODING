# . Write a Python function that takes two lists of integers as input and returns a new list 
# containing the elements that appear more than once across both lists. The result should 
# be in ascending order, and each repeated element should appear only once in the output 
# list.
# For example, given the input lists [3, 1, 4, 4, 5, 6] and [2, 4, 6, 8, 4, 9], the function 
# should return [4, 6]
def find_repeated_elements(list1, list2):
    # Concatenate the two lists
    combined_list = list1 + list2
    
    # Create a dictionary to count the occurrences of each element
    element_count = {}
    for element in combined_list:
        if element in element_count:
            element_count[element] += 1
        else:
            element_count[element] = 1
    
    # Create a list of elements that appear more than once
    repeated_elements = [element for element, count in element_count.items() if count > 1]
    
    # Sort the list in ascending order
    repeated_elements.sort()
    
    return repeated_elements

# Example usage
list1 = [3, 1, 4, 4, 5, 6]
list2 = [2, 4, 6, 8, 4, 9]
result = find_repeated_elements(list1, list2)
print("Repeated elements in ascending order:", result)
