# Create a function called process_data that takes a filename as a parameter. The function 
# should read data from the file, convert it to integers, and perform some calculations. 
# Handle the following scenarios:
# • File Not Found: If the file is not found, print an error message.
# • ValueError: If the data in the file cannot be converted to integers, print an error 
#  Message.
# • Division by Zero: If a division by zero occurs during calculations, print an error 
# message.
# • Successful Execution: If the file is found, the data is valid, and calculations are 
# successful 
#  print the result. Implement the function and demonstrate its usage with different test 
# cases
def process_data(filename):
    try:
        with open(filename, 'r') as file:
            data = file.read().split()

            # Check if the file is empty
            if not data:
                print("Error: File is empty.")
                return

            # Convert data to integers
            numbers = [int(num) for num in data]

            # Check if there are no numbers in the file
            if not numbers:
                print("Error: No valid numbers found in the file.")
                return

            # Perform calculations
            result = sum(numbers) / len(numbers)
            print("Result:", result)

    except FileNotFoundError:
        print(f"Error: File '{filename}' not found.")
    except ValueError:
        print("Error: Data in the file cannot be converted to integers.")
    except ZeroDivisionError:
        print("Error: Division by zero occurred during calculations.")

# Example usage:

# Test Case 1: File found and valid data
process_data("data.txt")

# Test Case 2: File not found
process_data("nonexistent_file.txt")

# Test Case 3: Data cannot be converted to integers
process_data("invalid_data.txt")

# Test Case 4: Division by zero
process_data("division_by_zero.txt")

# Test Case 5: Empty file
process_data("empty_file.txt")
