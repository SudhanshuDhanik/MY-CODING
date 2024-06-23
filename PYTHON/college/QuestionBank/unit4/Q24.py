#  Write a function find_max that accepts three numbers as arguments and returns the 
# largest number among three. Write another function main, in main() function accept 
# three numbers from user and call find_max. 
def find_max(num1, num2, num3):
   # Returns the largest number among three.
    return max(num1, num2, num3)

def main():
    #Accepts three numbers from the user and calls find_max.
    try:
        # Input from the user
        num1 = float(input("Enter the first number: "))
        num2 = float(input("Enter the second number: "))
        num3 = float(input("Enter the third number: "))

        # Call find_max function and print the result
        result = find_max(num1, num2, num3)
        print(f"The largest number among {num1}, {num2}, and {num3} is: {result}")

    except ValueError:
        print("Please enter valid numeric values.")

if __name__ == "__main__":
    main()
