# Create a module named vehicles that includes a class Car and a class Motorcycle. In 
# your main script, import this module with aliasing and use both the Car and Motorcycle 
# classes to create instances and demonstrate their functionality

# vehicles.py
class Car:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year

    def start_engine(self):
        return f"The {self.year} {self.make} {self.model}'s engine is started."

    def stop_engine(self):
        return f"The {self.year} {self.make} {self.model}'s engine is stopped."

class Motorcycle:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year

    def start_engine(self):
        return f"The {self.year} {self.make} {self.model}'s engine is started."

    def stop_engine(self):
        return f"The {self.year} {self.make} {self.model}'s engine is stopped."



# main_script.py
from vehicles import Car as CarAlias, Motorcycle as MotorcycleAlias

# Create instances of Car and Motorcycle
car_instance = CarAlias("Toyota", "Camry", 2022)
motorcycle_instance = MotorcycleAlias("Harley-Davidson", "Sportster", 2023)

# Demonstrate functionality
print(car_instance.start_engine())
print(car_instance.stop_engine())

print(motorcycle_instance.start_engine())
print(motorcycle_instance.stop_engine())
