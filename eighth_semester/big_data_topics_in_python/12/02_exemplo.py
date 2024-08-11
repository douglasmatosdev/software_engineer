import pandas as pd
import numpy as np

df = pd.DataFrame([[4, 9]] * 3, columns=["A", "B"])
df.apply(np.sqrt)
df["A"] = df["A"].apply(lambda x: x["A"] + 1)
df["C"] = df.apply(lambda x: x["A"] + x["B"], axis=1)
