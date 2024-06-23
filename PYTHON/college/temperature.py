temp=input("Enter temp in C or F: ")
unit=temp[-1]
value=temp[:-1]
if(unit=="c" or unit=="C"):
    newTemp=((float(value)/5)*9)+32
    print("temp in farenheit is {} F".format(newTemp))
elif(unit=="f" or unit=="F"):
    newTemp=((float(value)-32)*5)/9
    print("temp in celsius is {} C".format(newTemp))
else:
    print("Inalid input")
