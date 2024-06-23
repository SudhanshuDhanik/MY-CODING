# Create a base class called Animal with methods speak and move. Create a derived class 
# called Dog that inherits from Animal and overrides the speak method to make the dog 
# bark.
class Animal:
    def speak(self):
        print("Animal makes a sound")

    def move(self):
        print("Animal moves")


class Dog(Animal):
    def speak(self):
        print("Dog barks")

# Example usage:

animal_instance = Animal()
dog_instance = Dog()

# Calling methods of the base class
print("Animal:")
animal_instance.speak()
animal_instance.move()

# Calling methods of the derived class
print("\nDog:")
dog_instance.speak()
dog_instance.move()

