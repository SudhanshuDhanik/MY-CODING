# Write a Python function that takes two tuples of integers and returns a new tuple 
# containing elements that are common to both tuples. The result should be in ascending  order
def common_elements(tuple1, tuple2):
    # Convert the tuples to sets to find the common elements
    set1 = set(tuple1)
    set2 = set(tuple2)
    
    # Find the common elements
    common_set = set1.intersection(set2)
    
    # Convert the set back to a tuple and sort it in ascending order
    result_tuple = tuple(sorted(common_set))
    
    return result_tuple

# Example usage:
tuple1 = (1, 20, 3, 4, 5)
tuple2 = (20, 4, 5, 60, 7)
result = common_elements(tuple1, tuple2)
print(result)
