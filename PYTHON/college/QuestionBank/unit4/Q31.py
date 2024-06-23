# What are the different types of Passing arguments. Explain with examples. 
Types of Python Function Arguments
Python supports various types of arguments that can be passed at the time of the function call. 
In Python, we have the following 4 types of function arguments.

Default argument
Keyword arguments (named arguments)
Positional arguments
Arbitrary arguments (variable-length arguments *args and **kwargs)
Let’s discuss each type in detail. 

Default Arguments
A default argument is a parameter that assumes a default value 
if a value is not provided in the function call for that argument. 
The following example illustrates Default arguments. 
# Python program to demonstrate
# default arguments
def myFun(x, y=50):
    print("x: ", x)
    print("y: ", y)
myFun(10)
Output:
x:  10
y:  50


Keyword Arguments
The idea is to allow the caller to specify the argument name with values 
so that the caller does not need to remember the order of parameters.
# Python program to demonstrate Keyword Arguments
def student(firstname, lastname):
    print(firstname, lastname)
# Keyword arguments
student(firstname='Geeks', lastname='Practice')
student(lastname='Practice', firstname='Geeks')
Output:
Geeks Practice
Geeks Practice


Positional Arguments
We used the Position argument during the function call so that the first argument (or value) is 
assigned to name and the second argument (or value) is assigned to age. By changing the position,
or if you forget the order of the positions, the values can be used in the wrong places, as shown in the Case-2 
example below, where 27 is assigned to the name and Suraj is assigned to the age.

def nameAge(name, age):
    print("Hi, I am", name)
    print("My age is ", age)
# You will get correct output because 
# argument is given in order
print("Case-1:")
nameAge("Suraj", 27)
# You will get incorrect output because
# argument is not in order
print("\nCase-2:")
nameAge(27, "Suraj")
Output:
Case-1:
Hi, I am Suraj
My age is  27
Case-2:
Hi, I am 27
My age is  Suraj


Arbitrary Keyword  Arguments
In Python Arbitrary Keyword Arguments, *args, and **kwargs can pass a variable number of arguments to a function
using special symbols. There are two special symbols:
*args in Python (Non-Keyword Arguments)
**kwargs in Python (Keyword Arguments)
Example 1: Variable length non-keywords argument

# Python program to illustrate
# *args for variable number of arguments
def myFun(*argv):
    for arg in argv:
        print(arg)
myFun('Hello', 'Welcome', 'to', 'GeeksforGeeks')
Output:
Hello
Welcome
to
GeeksforGeeks
Example 2: Variable length keyword arguments

# Python program to illustrate
# *kwargs for variable number of keyword arguments
 
 
def myFun(**kwargs):
    for key, value in kwargs.items():
        print("%s == %s" % (key, value))
 
 
# Driver code
myFun(first='Geeks', mid='for', last='Geeks')
Output:
first == Geeks
mid == for
last == Geeks
