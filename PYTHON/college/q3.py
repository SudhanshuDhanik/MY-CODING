words=["Hello","JAVA","Python","HTML","Javascript","PHP"]
for i in words:
    s=len(i)
    print("No of letters in the word",i,"is",s)
    lower,upper=0,0
    for j in i:
        if(j.islower()):
            lower+=1
        else:
            upper+=1
    print("no of lowercase char is",lower)
    print("no of uppercase char is",upper)