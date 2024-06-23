# 9. a) What is a dictionary? Explain with an example. [3]
# b) Write a Python function that takes a list of dictionaries, each representing a person 
# with keys 'name', 'age', and 'salary', and returns the name of the person with the highest 
# total salary.[7]

# ans. A dictionary in Python is an unordered collection of items before 3.7 version after 
#  that it is ordered.Each item in a dictionary has a key-value pair. 
# It is similar to a real-world dictionary where 
# you look up a word (key)to find its definition (value). 
# In Python, dictionaries are defined using curly braces {},
# and key-value pairs are separated by colons :.
#Example: 
# Creating a dictionary
# person = {
#     'name': 'John Doe',
#     'age': 30,
#     'salary': 50000
# }

# # Accessing values using keys
# print("Name:", person['name'])
# print("Age:", person['age'])
# print("Salary:", person['salary'])
def highest_salary_person(people):
    # Check if the list is not empty
    if not people:
        return None

    # Initialize variables to track the person with the highest total salary
    highest_salary = 0
    highest_salary_person_name = ""

    # Iterate through the list of dictionaries
    for person in people:
        # Calculate the total salary for each person
        total_salary = person.get('salary', 0)  # Default to 0 if 'salary' key is not present
        if total_salary > highest_salary:
            highest_salary = total_salary
            highest_salary_person_name = person.get('name', '')

    return highest_salary_person_name

# Example usage:
people_list = [
    {'name': 'Alice', 'age': 25, 'salary': 60000},
    {'name': 'Bob', 'age': 35, 'salary': 75000},
    {'name': 'Charlie', 'age': 28, 'salary': 90000}
]

result = highest_salary_person(people_list)
print("Person with the highest total salary:", result)


