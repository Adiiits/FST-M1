"""
Combining Lists
Activity 9
Given a two list of numbers create a new list such that new list should contain only odd numbers from the first list and even numbers from the second list.
"""
newList =[]
numbers1 = list(input("Enter list 1 of numbers separated by , : ").split(","))
numbers2 = list(input("Enter list 2 of numbers separated by , : ").split(","))
print("List 1 of numbers: ", numbers1)
print("List 2 of numbers: ", numbers2)

for item in numbers1:
    if int(item)%2!=0:
        newList.append(item)
for item in numbers2:
    if int(item)%2==0:
        newList.append(item)

print("New List is : ", newList)