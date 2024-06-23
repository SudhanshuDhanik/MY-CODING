# 28. Write a one-liner list comprehension to generate a list of all prime numbers less than
# 100.
prime_numbers = [num for num in range(2, 100) if all(num % i != 0 for i in range(2, int(num**0.5) + 1))]
print(prime_numbers)