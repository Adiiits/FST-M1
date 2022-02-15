"""
Recursive Adder
Write a recursive function to calculate the sum of numbers from 0 to 10
"""

def sum(n):
    if(n>=1):
        return n+(sum(n-1))
    else:
        return 0

number = int(input("Enter a number: "))
Sum = sum(number)

print("Sum of all the number till ",number,": ", Sum)
