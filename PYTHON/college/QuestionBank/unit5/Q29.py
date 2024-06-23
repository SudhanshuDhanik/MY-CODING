# Advanced Mathematics in Python Problem: Implement a Python script that performs 
# the following mathematical tasks:
#  Prime Number Generator:
#  Fibonacci Sequence:
#  Matrix Operations:
#  Root Finding:

import math
import numpy as np

# Prime Number Generator
def generate_primes(n):
    primes = []
    for num in range(2, n + 1):
        is_prime = all(num % i != 0 for i in range(2, int(math.sqrt(num)) + 1))
        if is_prime:
            primes.append(num)
    return primes

# Fibonacci Sequence
def generate_fibonacci(n):
    fibonacci_sequence = [0, 1]
    while len(fibonacci_sequence) < n:
        next_term = fibonacci_sequence[-1] + fibonacci_sequence[-2]
        fibonacci_sequence.append(next_term)
    return fibonacci_sequence

# Matrix Operations
def matrix_multiply(matrix1, matrix2):
    return np.dot(matrix1, matrix2)

# Root Finding (using Newton's method)
def find_root(func, func_derivative, initial_guess, tolerance=1e-6, max_iterations=100):
    x = initial_guess
    for _ in range(max_iterations):
        x_next = x - func(x) / func_derivative(x)
        if abs(x_next - x) < tolerance:
            return x_next
        x = x_next
    raise ValueError("Root not found within the specified tolerance and iterations")

# Example usage:

# Prime Number Generator
print("Prime Numbers up to 20:", generate_primes(20))

# Fibonacci Sequence
print("\nFibonacci Sequence of length 10:", generate_fibonacci(10))

# Matrix Operations
matrix_a = np.array([[1, 2], [3, 4]])
matrix_b = np.array([[5, 6], [7, 8]])
result_matrix = matrix_multiply(matrix_a, matrix_b)
print("\nMatrix Multiplication Result:")
print(result_matrix)

# Root Finding
def quadratic_function(x):
    return x**2 - 4

def quadratic_derivative(x):
    return 2 * x

root = find_root(quadratic_function, quadratic_derivative, initial_guess=2)
print("\nRoot of the quadratic function x^2 - 4:", root)
