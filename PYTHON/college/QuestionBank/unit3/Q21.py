# Create a function that takes a list of numbers and returns a new list with each element 
# being the product of all the other elements, except for the element at that index
def product(nums):
    new_nums = []

    for i in nums:
        nums_product = 1

        for j in nums:     
            if j != i:
                nums_product = nums_product * j
        new_nums.append(nums_product)

    return new_nums

print(product([10, 20, 30, 40, 50]))
print(product([1, 2, 0, 4]))
print(product([1, 2, 3, -4]))
