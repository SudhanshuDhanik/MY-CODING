s="sonudhanik"
print(s[::-1])

#second method
l=len(s)
newS=""
for i in range(-1,-l-1,-1):
    newS=newS+s[i]
print(newS)