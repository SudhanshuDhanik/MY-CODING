#There are 3 types of functions in Java :
#a. In-built functions
# int() str() float() min() range() max()
#b. Module functions
#Module is a file that contains some functions & variables which can be imported
#for use in other files.
#Each module should contain some related tasks
#Example : math, random, string
import math
print(dir(math))#it gives all function available in module
print("\n")
import random
print(dir(random))#it gives all function available in module
print("\n")
import string
print(dir(string))#it gives all function available in module
from math import sqrt
#from math import * : it will import all function of module
print(sqrt(4))
#c. User-defined functions
def sum(a, b=4):
 print(a + b)
sum(1, 2)
sum(1)
