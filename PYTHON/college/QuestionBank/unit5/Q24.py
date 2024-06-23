# Create a class called Person with private attributes __name and __age. Implement 
# methods to set and get these attributes. Ensure that age is always a positive integer.
class Person:
    def __init__(self, name, age):
        self.__name = name
        self.__age=age

    def set_age(self, age):
        if isinstance(age, int) and age > 0:
            self.__age = age
        else:
            raise ValueError("Age must be a positive integer.")

    def get_age(self):
        return self.__age

    def set_name(self, name):
        self.__name = name

    def get_name(self):
        return self.__name

# Example usage:

person = Person("John Doe", 25)

# Accessing private attributes using getter methods
print("Name:", person.get_name())
print("Age:", person.get_age())

# Trying to set an invalid age
try:
    person.set_age(-5)
except ValueError as e:
    print(f"Error: {e}")

# Setting a valid age
person.set_age(30)

# Accessing the updated age
print("Updated Age:", person.get_age())
