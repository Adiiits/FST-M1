"""
Adding List Numbers
Write a function sum() such that it can accept a list of elements and print the sum of all elements
"""

numbers = [10,20,30,50]

def sumList(numbers):
    sum=0
    for n in numbers:
        sum+=n
    return sum
    
print("Sum of list of numbers: ", sumList(numbers))