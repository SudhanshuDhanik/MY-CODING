# Create a subclass called Manager that inherits from the Employee class. Add parameter, 
# subordinates, to the constructor of the Manager class. Use super() to call the constructor 
# of the base class. Update the display method to include information about subordinates.
class Employee:
    def __init__(self, name, salary):
        self.name = name
        self.salary = salary

    def display(self):
        print(f"Employee: {self.name}, Salary: {self.salary}")


class Manager(Employee):
    def __init__(self, name, salary, subordinates):
        super().__init__(name, salary)
        self.subordinates = subordinates

    def display(self):
        super().display()
        print(f"Manager - Subordinates: {', '.join(self.subordinates)}")

# Example usage:

# Create an Employee instance
employee_instance = Employee("John Doe", 60000)

# Display information for the Employee
print("Employee:")
employee_instance.display()

# Create a Manager instance
manager_instance = Manager("Jane Smith", 80000, ["Alice", "Bob"])

# Display information for the Manager
print("\nManager:")
manager_instance.display()
