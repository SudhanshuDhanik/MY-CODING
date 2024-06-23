#List is a complex type in Python.
friends = ["amar", "akbar", "anthony"]
print(friends[0])
print(friends[1])
print(friends[-1])
print(friends[-2])
friends[0] = "aman"
print(friends)
print(friends[0:2]) #returns a new list
for friend in friends:
 print(friend)
#List Methods :
marks = ["english", 95, "chemistry", 98]
marks.append("physics")#Append means insertion at end
marks.append(97)
print(marks)
marks.insert(0, "math")
marks.insert(1, 99)
print(marks)
print("math" in marks)
print(len(marks)/2)
marks.clear()
print(marks)
i = 0
marks=[57,86,95]
while i < len(marks):
 print(marks[i])
 i = i + 1
