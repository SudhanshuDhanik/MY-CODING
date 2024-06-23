l=["Aman","sonu","han","ayus","yoyo","kalam"]
count=0
for i in l:
    count+=1
    print("Good Morning {}".format(i))
    if i==l[0]:
        print("The First Student has Entered")
    else:
        print("There are {} students in classroom".format(count))