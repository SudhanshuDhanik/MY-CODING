# Create a module named math_operations that includes both a class Calculator with 
# basic arithmetic methods (add, subtract, multiply, divide) and a function 
# calculate_power for calculating the power of a number. In your main script, import and 
# demonstrate the use of both the class and the function.
# math_operations.py

class Calculator:
    def add(self, x, y):
        """Add two numbers."""
        return x + y
    
    def subtract(self, x, y):
        """Subtract y from x."""
        return x - y
    
    def multiply(self, x, y):
        """Multiply two numbers."""
        return x * y
    
    def divide(self, x, y):
        """Divide x by y."""
        if y != 0:
            return x / y
        else:
            raise ValueError("Cannot divide by zero.")

def calculate_power(base, exponent):
    """Calculate the power of a number."""
    return base ** exponent



# main_script.py
import math_operations

# Create an instance of the Calculator class
calculator_instance = math_operations.Calculator()

# Demonstrate basic arithmetic operations
result_add = calculator_instance.add(5, 3)
result_subtract = calculator_instance.subtract(10, 4)
result_multiply = calculator_instance.multiply(6, 2)
result_divide = calculator_instance.divide(8, 2)

# Display the results of basic arithmetic operations
print(f"Addition: {result_add}")
print(f"Subtraction: {result_subtract}")
print(f"Multiplication: {result_multiply}")
print(f"Division: {result_divide}")

# Demonstrate the use of calculate_power function
power_result = math_operations.calculate_power(2, 3)

# Display the result of the power calculation
print(f"Power: {power_result}")
