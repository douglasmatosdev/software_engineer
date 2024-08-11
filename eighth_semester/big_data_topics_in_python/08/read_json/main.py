import pandas as pd

df = pd.read_json("../arquivo.json", orient="records")
print(df)
