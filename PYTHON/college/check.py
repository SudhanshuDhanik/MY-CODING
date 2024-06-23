s="$a1B2c 3D4 5e@"
count=0
for i in s:
    count+=1
print(count)

count_i=0#integer
count_=0 #Space
count_a=0#alphabet
count_s=0 #Special character
for char in s:
    if char.isdigit():
     count_i+=1
    elif char==" ":
     count_+=1
    elif char.isalpha():
     count_a+=1
    else:
      count_s+=1
print(count_i)
print(count_)
print(count_a)
print(count_s)

         
       

