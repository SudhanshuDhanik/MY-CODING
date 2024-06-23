#Add two subsequent digit to next two subsequent digit
no=input("Enter 10 digit number: ")
sum=0
if(len(no)==10 and no.isdigit()):
    for i in range(0,len(no),2):
        dig=no[i:i+2]
        sum+=int(dig)
    print(sum)