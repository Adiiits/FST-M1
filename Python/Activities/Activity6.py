"""
pattern generator
1
22
333
4444
55555
666666
7777777
88888888
999999999
"""

#Method1
for i in range(1,10):
  for j in range(1,i+1):
    #by default print prints in next line, that’s why use ‘end’
    print(i, end=" ")
  print()

#Method2
for i in range(10):
    print(str(i) * i)