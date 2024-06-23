#Create a class called Employee with a parameterized constructor that takes the 
# employee's name, salary, and department as parameters. Include a method to display 
# the details of the employee.
class Employee:
    def __init__(self, name, salary, department):
        self.name = name
        self.salary = salary
        self.department = department

    def display_details(self):
        print(f"Employee Details:\nName: {self.name}\nSalary: {self.salary}\nDepartment: {self.department}")

# Example usage:

employee_instance = Employee("John Doe", 60000, "IT")
employee_instance.display_details()
