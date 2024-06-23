# Create two base classes, Bird and Fish, with a method move. Implement a derived class 
# called Penguin that inherits from both Bird and Fish. Override the move method to 
# specify that penguins swim underwater and waddle on land
class Bird:
    def move(self):
        print("Bird is flying")


class Fish:
    def move(self):
        print("Fish is swimming")


class Penguin(Bird, Fish):
    def move(self):
        print("Penguin swims underwater and waddles on land")


# Example usage:

bird_instance = Bird()
fish_instance = Fish()
penguin_instance = Penguin()

print("Bird:")
bird_instance.move()

print("\nFish:")
fish_instance.move()

print("\nPenguin:")
penguin_instance.move()
