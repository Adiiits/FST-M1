
number_tuple = tuple(input("Enter list 1 of numbers separated by , : ").split(","))

print("tuples: ", number_tuple)
print("Numbers divisible by 5 are: ")
for item in number_tuple:
    if(int(item)%5==0):
     print(item, end=" ")