# Implement a custom exception class called NegativeValueError. Write the 
# divide_numbers function to raise this exception if any parameter is a negative number
class NegativeValueError(Exception):
    def __init__(self, value):
        self.value = value
        super().__init__(f"NegativeValueError: {value} is a negative number. Please provide non-negative values.")

def divide_numbers(num1, num2):
    if num1 < 0 or num2 < 0:
        raise NegativeValueError(num1 if num1 < 0 else num2)

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

# Example 3: Negative value
result3 = divide_numbers(-8, 2.5)
