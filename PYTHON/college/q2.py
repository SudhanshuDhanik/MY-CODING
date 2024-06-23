l=["cat","dog","cow","tiger","Fox","Snake","Shark","mouse","bunny","deer"]

new =[]
for i in l:
    if i in new:
       continue
    else:
       result=[]
       for j in l:
          if i[0]==j[0]:
            result.append(j)
            new.append(j)
       print(result)

    