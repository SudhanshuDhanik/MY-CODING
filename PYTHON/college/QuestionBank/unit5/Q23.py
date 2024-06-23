# . Create a class called CustomList that inherits from the built-in list class. Override the 
# __add__ method to concatenate two lists and filter out duplicate elements.
class CustomList(list):
    def __add__(self, other):
        # Concatenate the lists
        result = super().__add__(other)

        # Filter out duplicate elements
        result = list(set(result))

        # Create a new instance of CustomList with the filtered result
        return CustomList(result)

# Example usage:

custom_list1 = CustomList([1, 2, 3, 4])
custom_list2 = CustomList([3, 4, 5, 6])

result_list = custom_list1 + custom_list2

print(result_list)
