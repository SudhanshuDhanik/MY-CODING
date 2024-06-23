#  Explain the basic operations and load data into tables using SQLite in Python with 
# example.



#SQLite is a lightweight and serverless database engine that is commonly used for embedded systems and small-scale applications.
import sqlite3

# Connect to a database (this will create a new database if it doesn't exist)
conn = sqlite3.connect('example.db')

# Create a cursor object to execute SQL commands
cursor = conn.cursor()

# Execute an SQL command to create a table
cursor.execute('''
    CREATE TABLE IF NOT EXISTS employees (
        id INTEGER PRIMARY KEY,
        name TEXT NOT NULL,
        salary REAL
    )
''')

# Insert data into the table
cursor.execute("INSERT INTO employees (name, salary) VALUES (?, ?)", ('John Doe', 50000.0))
cursor.execute("INSERT INTO employees (name, salary) VALUES (?, ?)", ('Jane Smith', 60000.0))

# Commit the changes
conn.commit()

# Close the connection
conn.close()
