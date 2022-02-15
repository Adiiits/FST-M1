"""
Fruit Shop
Create a Python dictionary that contains a bunch of fruits and their prices.
Write a program that checks if a certain fruit is available or not.
"""

Fruit_Shop={
    'guava':10,
    "mango":11,
    'cherry':20,
    "grapes":14
}

fruitToFind = input("Enter fruit to find: ").lower()

if(fruitToFind in Fruit_Shop):
    print("Fruit is found.")
else:
    print("Fruit not found.")
