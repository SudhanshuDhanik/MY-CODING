# Create a function called divide_numbers that takes two parameters and returns the result 
# of dividing them. Handle exceptions for division by zero and invalid input types.
def divide_numbers(num1, num2):
    try:
        result = num1 / num2
        return result
    except ZeroDivisionError:
        print("Error: Division by zero is not allowed.")
    except (TypeError, ValueError):
        print("Error: Invalid input types. Please provide valid numeric values.")

# Example usage:

# Example 1: Valid division
result1 = divide_numbers(10, 2)
print("Result 1:", result1)

# Example 2: Division by zero
result2 = divide_numbers(5, 0)

# Example 3: Invalid input types
result3 = divide_numbers("abc", 2.5)
