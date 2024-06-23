# Write a function sumPdivisors() that finds the sum of proper divisors of a number. 
# Proper divisors of a number are those numbers by which the number is divisible, except 
# the number itself. For example proper divisors of 36 are 1, 2, 3, 4, 6, 9, 18
def sumPdivisors(number):
    if number <= 0:
        return "Please provide a positive integer greater than 0."

    divisors_sum = 0
    for i in range(1, number):
        if number % i == 0:
            divisors_sum += i

    return divisors_sum

# Example usage
number = 36
result = sumPdivisors(number)
print(f"The sum of proper divisors of {number} is: {result}")
