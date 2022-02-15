import pandas

dataframe = pandas.read_csv("emp2.csv")

print(dataframe)
print("--###--")
print(dataframe["Username"])
print("--###--")
print(dataframe["Passwords"])
print("--###--")
print("Username:", dataframe["Username"][1])
print("Password:", dataframe["Passwords"][1])

#Sort the Usernames column in descending order
print("====================================")
print("Data sorted in descending Usernames:")
print(dataframe.sort_values("Username", ascending=False))

#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Username'))
 
#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))

#Sort the Passwords column in ascending order
print("====================================")
print("Data sorted in ascending Passwords:")
print(dataframe.sort_values('Passwords'))