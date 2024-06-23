list=["s","s",'d',9,"g",'g',1,1,4,"g7",9]
s=set(list)
print("No of Unique elements are:{} ".format(len(s)))
for i in s:
    count=list.count(i)
    print("Frequency of",i,"is",count)