# Create a base class called Vehicle with a method display_info. Implement two derived 
# classes, Car and Bike, that inherit from Vehicle. Override the display_info method in 
# each derived class to include specific information about the vehicle type.
class Vehicle:
    def __init__(self, brand, model, year):
        self.brand = brand
        self.model = model
        self.year = year

    def display_info(self):
        print(f"Vehicle Info: {self.year} {self.brand} {self.model}")

class Car(Vehicle):
    def __init__(self, brand, model, year, num_doors):
        super().__init__(brand, model, year)
        self.num_doors = num_doors

    def display_info(self):
        super().display_info()
        print(f"Type: Car, Number of Doors: {self.num_doors}")

class Bike(Vehicle):
    def __init__(self, brand, model, year, num_wheels):
        super().__init__(brand, model, year)
        self.num_wheels = num_wheels

    def display_info(self):
        super().display_info()
        print(f"Type: Bike, Number of Wheels: {self.num_wheels}")

# Example usage:

car_instance = Car("Toyota", "Camry", 2022, 4)
bike_instance = Bike("Harley-Davidson", "Sportster", 2022, 2)

# Display information for the car
car_instance.display_info()

# Display information for the bike
bike_instance.display_info()
