import pandas as pd

df = pd.DataFrame({"A": range(1, 6), "B": range(10, 0, -2), "C": range(10, 5, -1)})
print(df.query("A > B"))
# print(df.query("B == `C C`"))
print(df[df.A > df.B])
