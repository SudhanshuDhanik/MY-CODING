# # 22. What is the output of the following code?
# # a) global x x = 10 
# # def func(a): 
# # print(‘x is’, a) a = 5 
# # print(‘Changed value of x is’, a) func(x) 
# # print(‘value of x is’,x) 
# # b) def fun1(num): return num + 25 fun1(5) 
# # print(num) 


# Let's analyze the code:

# a)
# global x
# x = 10

# def func(a):
#     print('x is', a)
#     a = 5
#     print('Changed value of x is', a)

# func(x)
# print('value of x is', x)
# In this code, you're using a global variable x, setting its value to 10,
# and then passing it to the function func.
# However, inside the function func, you are using a local variable a,
# which shadows the global variable x. Therefore, the global variable x
# remains unaffected by the changes made inside the function.

# Output:
# x is 10
# Changed value of x is 5
# value of x is 10

# b)
# def fun1(num):
#     return num + 25

# fun1(5)
# print(num)
# In this code, you are defining a function fun1 that takes a parameter num and returns num + 25. However, when you call the function fun1(5), you don't capture or print the result. Additionally, there is an attempt to print a variable num outside the function, which will result in an error since num is not defined in the global scope.

# To fix the code and see the result of the function call, you should capture the result and print it:
# result = fun1(5)
# print(result)
# So, the corrected code would be:

# def fun1(num):
#     return num + 25

# result = fun1(5)
# print(result)

# This would output:
# 30
# However, the original code with the print statement outside the function (print(num)) would result in an error.