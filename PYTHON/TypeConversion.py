old_age = input("Enter your age : ")#This will take input in form of string.
#new_age = old_age + 2 .give error as we can't concate string and integer
#print(new_age)
new_age = int(old_age) + 2
print(new_age)
#Useful converion functions
# 1. float()
# 2. bool()
# 3. str()
# 4. int()
first_number = input("Enter 1st number : ")
second_number = input("Enter 2nd number : ")
sum = float(first_number) + float(second_number)
sum2=first_number+second_number
print("the sum is : " + str(sum))
print("the sum is : " + sum2)

