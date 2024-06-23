# Create a module named geometry that includes a function calculate_area for 
# calculating the area of a rectangle. In your main script, import this module and calculate 
# the area of a rectangle with a given length and width. Demonstrate the use of name 
# spacing

# geometry.py
def calculate_area(length, width):
    #Calculate the area of a rectangle."""
    return length * width


# main_script.py
import geometry

# Given length and width of the rectangle
length = 5
width = 10

# Calculate the area using the geometry module
area = geometry.calculate_area(length, width)

# Display the result
print(f"The area of the rectangle with length {length} and width {width} is: {area}")
