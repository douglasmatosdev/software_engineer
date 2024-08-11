import pandas as pd

s1 = pd.Series(["a", "b"])
s2 = pd.Series(["c", "d"])

pd.concat([s1, s2], axis=1)
