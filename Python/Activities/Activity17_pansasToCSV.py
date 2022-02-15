# Import pandas
import pandas as pd


# Create a Dictionary that will hold our data
data = {
    "Username" : ["admin", "Charles", "Deku"],
    "Passwords" : ["password", "Charl13", "AllMight"]

    }
	
# Create a DataFrame using that data
dataframe = pd.DataFrame(data)
	
# Print the DataFrame
print(dataframe)

#Will write index numbers to the file
dataframe.to_csv("emp1.csv")

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv("emp2.csv", index=False)
