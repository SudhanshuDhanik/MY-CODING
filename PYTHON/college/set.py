s1={ 'd', 'e', 'v', 'b', 'h', 'o', 'o', 'm', 'i'}
s2={ 'u', 'n', 'i', 'v', 'e', 'r', 's', 'i', 't', 'y'}
print(s1-s2)
print(s1.difference(s2))
print(s1.symmetric_difference(s2))
print(s1^s2)
print(s1==s2)
s1.intersection_update(s2)
print(s1,s2)
print(s1.issubset(s2))
print(s1.issuperset(s2))
s1=frozenset(s1)