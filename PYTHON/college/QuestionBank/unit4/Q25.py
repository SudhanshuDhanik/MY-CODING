# Write a function, is_vowel that returns the value true if a given character is a vowel, 
# and otherwise returns false. Write another function main, in main() function accept a 
# string from user and count number of vowels in that string. 
def is_vowel(char):
    #Returns True if the given character is a vowel, and False otherwise.
    vowels = "aeiouAEIOU"
    return char in vowels

def main():
   # Accepts a string from the user and counts the number of vowels.
    try:
        # Input from the user
        user_input = input("Enter a string: ")

        # Count the number of vowels
        vowel_count = sum(1 for char in user_input if is_vowel(char))

        # Print the result
        print(f"The number of vowels in the string is: {vowel_count}")

    except Exception as e:
        print(f"An error occurred: {e}")

if __name__ == "__main__":
    main()
