# Write a function named is_prime, which takes an integer as an argument and returns 
# true if the argument is a prime number, or false otherwise. Also, write the main function 
# that displays prime numbers between 1 to 500.
def is_prime(num):
    #Returns True if the given number is prime, and False otherwise.
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def main():
    #Displays prime numbers between 1 and 500.
    print("Prime numbers between 1 and 500:")
    for number in range(1, 501):
        if is_prime(number):
            print(number, end=' ')

if __name__ == "__main__":
    main()
