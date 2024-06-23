# # a) What is list? Explain with an example. [3]
# # b) Write a Python function that takes a string and returns the length of the longest 
# # substring without repeating characters. [7]


# ans(A):In Python, a list is a mutable, ordered collection of elements.
# Lists are defined by enclosing elements in square brackets ([]).
# Each element in a list can be of any data type, and elements can be accessed using an index.
# Lists allow for the storage and manipulation of multiple items in a single variable.
#    Example:
# # Creating a list
# fruits = ['apple', 'banana', 'orange', 'grape']

# # Accessing elements by index
# print("First fruit:", fruits[0])
# print("Second fruit:", fruits[1])

# # Modifying elements
# fruits[2] = 'kiwi'
# print("Updated list:", fruits)

# # Adding elements to the end of the list
# fruits.append('pear')
# print("List after append:", fruits)

#Ans(B):
def longest_substring_length(s):
    # Check if the input string is empty
    if not s:
        return 0

    # Initialize variables
    start = 0  # Start index of the current substring
    max_length = 0  # Maximum length of substring without repeating characters
    char_index_map = {}  # Dictionary to store the index of each character

    # Iterate through the string
    for i, char in enumerate(s):
        # If the character is already in the substring, update the start index
        if char in char_index_map and char_index_map[char] >= start:
            start = char_index_map[char] + 1

        # Update the index of the current character
        char_index_map[char] = i

        # Update the maximum length
        max_length = max(max_length, i - start + 1)

    return max_length

# Example usage:
input_string = "abcabcbb"
result = longest_substring_length(input_string)
print("Length of the longest substring without repeating characters:", result)
