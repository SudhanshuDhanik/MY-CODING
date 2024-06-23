# Write a Python function that takes a list of dictionaries representing students and their 
# grades. Each dictionary has keys 'name' and 'grades' where 'grades' is a list of integers. 
# Return a new dictionary where keys are names and values are the average grades of the 
# students
def calculate_average_grades(students):
    # Check if the list is not empty
    if not students:
        return {}

    # Create a dictionary to store average grades
    average_grades_dict = {}

    # Iterate through the list of dictionaries
    for student in students:
        # Extract name and grades from the dictionary
        name = student.get('name', '')
        grades = student.get('grades', [])

        # Calculate the average grade for each student
        if grades:
            average_grade = sum(grades) / len(grades)
            average_grades_dict[name] = average_grade

    return average_grades_dict

# Example usage:
students_list = [
    {'name': 'Alice', 'grades': [85, 90, 92]},
    {'name': 'Bob', 'grades': [78, 88, 85]},
    {'name': 'Charlie', 'grades': [90, 92, 88]}
]

result = calculate_average_grades(students_list)
print("Average Grades:", result)
