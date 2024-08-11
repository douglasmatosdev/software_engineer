import pandas as pd
from sklearn.datasets import load_iris

data = load_iris()
df = pd.DataFrame(data.data, columns=data.feature_names)
df["encoded_target"] = data.target

print(df)
print(df.info())
print(df.describe())
