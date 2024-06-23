#Tuples are like lists (sequence of objects) but they are immutable
# i.e. once they have been defined we cannot change them.
#Parenthesis in tuples are optional.
marks = (95, 98, 97, 97)
#marks[0] = 98,give error coz tuples are immutable
for mark in marks:
 print (marks)
for mark in marks:
 print (mark)
print(marks.count(97))
print(marks.index(97))
