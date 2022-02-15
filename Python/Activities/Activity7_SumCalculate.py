"""
List Sum Calculator
Activity 7
Write a Python program to calculate the sum of all the elements in a list.
Bonus points if you can make the user enter their own list.
"""

from typing import List

#Method1
listNumber =[]

while(True):
 number = int(input("Enter a number: "))
 listNumber.append(number)
 flag = (input("wanna add more?y/n: ")).lower()
 if(flag=='n'):
     break
  
print("List of the numbers is: ",listNumber)

Sum = 0
for item in listNumber:
 Sum += item

print("Sum of number in the list is: ", Sum)

#Method2

numbers = list(input("Enter a sequence of comma(followed by a space) separated values: ").split(", "))
sum = 0
 
for number in numbers:
  sum += int(number)
 
print(sum)
