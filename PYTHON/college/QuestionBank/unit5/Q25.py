# Implement a class called Book with private attributes __title and __author. Create a 
# class method that returns the number of books created. Ensure that the title and author 
# are strings
class Book:
    # Class attribute to keep track of the number of books created
    __num_books = 0

    def __init__(self, title, author):
        self.set_title(title)
        self.set_author(author)
        # Increment the number of books created
        Book.__num_books += 1

    def set_title(self, title):
        if isinstance(title, str):
            self.__title = title
        else:
            raise ValueError("Title must be a string.")

    def get_title(self):
        return self.__title

    def set_author(self, author):
        if isinstance(author, str):
            self.__author = author
        else:
            raise ValueError("Author must be a string.")

    def get_author(self):
        return self.__author

    @classmethod
    def get_num_books(cls):
        return cls.__num_books

# Example usage:

book1 = Book("The Catcher in the Rye", "J.D. Salinger")
book2 = Book("To Kill a Mockingbird", "Harper Lee")

# Accessing private attributes using getter methods
print("Book 1 - Title:", book1.get_title())
print("Book 1 - Author:", book1.get_author())

print("Book 2 - Title:", book2.get_title())
print("Book 2 - Author:", book2.get_author())

# Accessing the number of books created using the class method
print("Number of books created:", Book.get_num_books())
