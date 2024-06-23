# a) Explain Anonymous functions with an example.
# b) What is a fruitful function? Explain with an example
Python Lambda Functions are anonymous functions means that the function is without a name.
As we already know the def keyword is used to define a normal function in Python.
Similarly, the lambda keyword is used to define an anonymous function in Python. 

Python Lambda Function Syntax
Syntax: lambda arguments : expression

This function can have any number of arguments but only one expression, 
which is evaluated and returned.One is free to use lambda functions wherever
function objects are required.You need to keep in your knowledge that
lambda functions are syntactically restricted to a single expression.It has various 
uses in particular fields of programming, besides other types of expressions in functions.
EXample:str1 = 'GeeksforGeeks'

upper = lambda string: string.upper()
print(upper(str1))
output:GEEKSFORGEEKS


Fruitful Functions
These are the functions that return a value after their completion. 
A fruitful function must always return a value to where it is called from.
A fruitful function can return any type of value may it be string, integer, boolean, etc.
It is not necessary for a fruitful function to return the value of one variable,
 the value to be returned can be an array or a vector.
A fruitful function can also return multiple values.

Example 1:

# Creation of Function 
function add_f(a, b); 
    c = a + b; 
      
    # Returning the value 
    return c; 
end 
  
# Function call 
d = add_f(3, 4); 
print(d) 