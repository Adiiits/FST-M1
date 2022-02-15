"""
List Checker
Given a list of numbers, return True if first and last number of a list is same.
Bonus points if you can make the user enter their own list.
"""

numbers = list(input("Enter numbers separated by , : ").split(","))
print(numbers)
print(numbers[0])
print(numbers[-1])
if(numbers[0]==numbers[-1]):
    print("true")
else:
    print("false")
        