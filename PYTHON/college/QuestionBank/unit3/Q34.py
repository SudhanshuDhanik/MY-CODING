#       a) What is tuple? Explain with Example. [3]
#       b) Write a Python function that takes a tuple of integers and returns the length of the 
#       longest subtuple with at most two distinct elements.[7]


#    a) Tuple:
#    A tuple is a data structure in Python that is similar to a list. 
# However, unlike lists, tuples are immutable, meaning their values 
# cannot be changed after creation. Tuples are defined using parentheses
# () and can contain a mix of different data types.
#    Example:
#       Creating a tuple
#    my_tuple = (1, 'apple', 3.14, True)

#       Accessing elements in a tuple
#    print(my_tuple[0])     Output: 1
#    print(my_tuple[1])     Output: 'apple'

#       Tuples are immutable
#       my_tuple[0] = 2     This will result in an error

#Ans(B):
def longest_subtuple_length(tuple_of_integers):
    if not tuple_of_integers:
        return 0

    start, end = 0, 0
    max_length = 1
    distinct_count = 0
    last_seen = {}

    while end < len(tuple_of_integers):
        if tuple_of_integers[end] not in last_seen:
            distinct_count += 1

        last_seen[tuple_of_integers[end]] = end

        while distinct_count > 2:
            if last_seen[tuple_of_integers[start]] == start:
                distinct_count -= 1
            start += 1

        max_length = max(max_length, end - start + 1)
        end += 1

    return max_length

# Example usage
my_tuple = (1, 2, 1,  3, 3, 4, 4, 4, 2)
result = longest_subtuple_length(my_tuple)
print("Length of the longest subtuple with at most two distinct elements:", result)
