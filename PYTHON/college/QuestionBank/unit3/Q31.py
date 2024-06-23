# 31. Write a Python function that takes a list of dictionaries representing books and their 
# authors. Each dictionary has keys 'title' and 'author'. Return a new dictionary where 
# keys are authors and values are lists of titles written by that author.
def group_books_by_author(books):
    # Check if the list is not empty
    if not books:
        return {}

    # Create a dictionary to store books grouped by author
    books_by_author = {}

    # Iterate through the list of dictionaries
    for book in books:
        # Extract title and author from the dictionary
        title = book.get('title', '')
        author = book.get('author', '')

        # Add the title to the list of books for the author
        if author:
            if author in books_by_author:
                books_by_author[author].append(title)
            else:
                books_by_author[author] = [title]

    return books_by_author

# Example usage:
books_list = [
    {'title': 'Book1', 'author': 'Author1'},
    {'title': 'Book2', 'author': 'Author2'},
    {'title': 'Book3', 'author': 'Author1'},
    {'title': 'Book4', 'author': 'Author3'},
    {'title': 'Book5', 'author': 'Author2'},
]

result = group_books_by_author(books_list)
print("Books by Author:", result)
