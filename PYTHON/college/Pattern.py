for row in range(4):
    for col in  range(4):
      if(row==1 or row==2)and(col==1 or col==2):
        print(" " ,end="")
      else:
        print("*", end="")
    print("")

for row in range(6):
   for col in range(4):
      if(row==0 and col==0)or(row==0 and col==3)or ((row==1 or row==2 or row==4 or row==5)and (col==1 or col==2)):
         print(" ",end="")
      else:
         print("*",end="")
   print("")