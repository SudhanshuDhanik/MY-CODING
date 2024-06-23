# Create two base classes, Person and Employee, with relevant attributes and methods. 
# Implement a derived class called Manager that inherits from both Person and Employee. 
# Include a method in Manager called display_details that prints details from both parent 
# classes.
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display_person_details(self):
        print(f"Person: Name - {self.name}, Age - {self.age}")


class Employee:
    def __init__(self, employee_id, salary):
        self.employee_id = employee_id
        self.salary = salary

    def display_employee_details(self):
        print(f"Employee: ID - {self.employee_id}, Salary - {self.salary}")


class Manager(Person, Employee):
    def __init__(self, name, age, employee_id, salary, department):
        # Call the constructors of both parent classes
        Person.__init__(self, name, age)
        Employee.__init__(self, employee_id, salary)

        self.department = department

    def display_details(self):
        # Call the display methods of both parent classes
        self.display_person_details()
        self.display_employee_details()
        print(f"Manager: Department - {self.department}")


# Example usage:

manager_instance = Manager("John Doe", 35, "M123", 75000, "HR")
manager_instance.display_details()
