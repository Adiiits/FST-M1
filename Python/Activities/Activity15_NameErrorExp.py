#import sys
from sys import exc_info

name = input("Enter  a name: ")
try:
    print("name is:", name)
except:
    #print(sys.exc_info()[0])
    print(exc_info()[0])
else:
    print("code ran with no exception")
    del name
print("code ran after deleting the name ")
try:
    print("name is:", name)
except:
    #print(sys.exc_info()[0])
    print(exc_info()[0])
else:
    print("no exception")   
"""
---raise name error explicitly---
try:
    raise NameError("Hi there")  # Raise Error
except NameError:
    print ("An exception")
    raise  # To determine whether the exception was raised or not
"""