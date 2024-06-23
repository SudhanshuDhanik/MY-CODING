# Write a python program to find sum of squares of first n natural numbers using functions
def sum_of_squares(n):
    #Returns the sum of squares of the first n natural numbers.
    return sum(i**2 for i in range(1, n+1))

def main():
    #Accepts the value of n from the user and prints the sum of squares.
    try:
        # Input from the user
        n = int(input("Enter the value of n: "))

        # Calculate and print the sum of squares
        result = sum_of_squares(n)
        print(f"The sum of squares of the first {n} natural numbers is: {result}")

    except ValueError:
        print("Please enter a valid integer.")

if __name__ == "__main__":
    main()

