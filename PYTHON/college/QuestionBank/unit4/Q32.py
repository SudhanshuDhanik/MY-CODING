# . Create a Python module named math_operations that includes the following functions:
# add(a, b): Returns the sum of two numbers.
# subtract(a, b): Returns the result of subtracting b from a.
# multiply(a, b): Returns the product of two numbers.
# divide(a, b): Returns the result of dividing a by b.
# Then, create a script that imports this module and demonstrates the use of each function.

# math_operations.py
def add(a, b):
    #Returns the sum of two numbers.
    return a + b

def subtract(a, b):
    #Returns the result of subtracting b from a.
    return a - b

def multiply(a, b):
    #Returns the product of two numbers.
    return a * b

def divide(a, b):
   # Returns the result of dividing a by b.
    if b != 0:
        return a / b
    else:
        return "Cannot divide by zero."
    

# main_script.py
# Importing the math_operations module
import math_operations as math_ops

# Example usage
num1 = 10
num2 = 5

# Use each function from the imported module
sum_result = math_ops.add(num1, num2)
diff_result = math_ops.subtract(num1, num2)
prod_result = math_ops.multiply(num1, num2)
div_result = math_ops.divide(num1, num2)

# Print the results
print(f"Sum: {sum_result}")
print(f"Difference: {diff_result}")
print(f"Product: {prod_result}")
print(f"Division: {div_result}")

