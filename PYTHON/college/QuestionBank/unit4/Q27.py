# Write a function in python to find the sum of the cube of elements in a list. The list is 
# received as an argument to the function, in turn, the function must return the sum. Write 
# the main function which invokes the above function. 
def sum_of_cubes(input_list):
    #Returns the sum of the cubes of elements in the given list.
    return sum(x**3 for x in input_list)

def main():
    #Demonstrates the usage of the sum_of_cubes function.
    try:
        # Input from the user
        input_list = [float(x) for x in input("Enter a list of numbers separated by spaces: ").split()]

        # Calculate and print the sum of the cubes
        result = sum_of_cubes(input_list)
        print(f"The sum of the cubes of elements in the list is: {result}")

    except ValueError:
        print("Please enter valid numeric values.")

if __name__ == "__main__":
    main()
