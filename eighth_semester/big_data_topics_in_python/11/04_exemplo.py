import pandas as pd

df = pd.DataFrame({"A": range(1, 6), "B": range(10, 0, -2), "C": range(10, 5, -1)})

df = df.drop(columns=["col1", "col2", "col3"])
df.drop(columns=["col1", "col2", "col3"], inplace=True)
df.drop([0, 1], inplace=True)
df = df.reset_index(drop=True)
df.reset_index(drop=True, inplace=True)
