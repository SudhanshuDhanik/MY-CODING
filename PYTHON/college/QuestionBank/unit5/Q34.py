# Create a class called Calculator that has a method called add with different 
# implementations for handling integers, floats, and strings. The method should 
# concatenate strings and perform addition for numeric types using Method Overloading.
class Calculator:
    def add(self, a, b):
        if isinstance(a, int) and isinstance(b, int):
            return self._add_integers(a, b)
        elif isinstance(a, float) and isinstance(b, float):
            return self._add_floats(a, b)
        elif isinstance(a, str) or isinstance(b, str):
            return self._concatenate_strings(a, b)
        else:
            raise ValueError("Unsupported types for addition.")

    def _add_integers(self, a, b):
        return a + b

    def _add_floats(self, a, b):
        return a + b

    def _concatenate_strings(self, a, b):
        return str(a) + str(b)

# Example usage:

calculator = Calculator()

# Adding integers
result_integers = calculator.add(5, 3)
print("Result (Integers):", result_integers)

# Adding floats
result_floats = calculator.add(3.5, 2.5)
print("Result (Floats):", result_floats)

# Concatenating strings
result_strings = calculator.add("Hello", "World")
print("Result (Strings):", result_strings)

# Unsupported types
try:
    result_invalid = calculator.add(True, "Python")
except ValueError as e:
    print("Error:", e)
