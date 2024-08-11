import pandas as pd

json_array = [{"a": 1, "b": 2}, {"a": 3, "b": 4}, {"a": 5, "b": 6}]
print(json_array)

df = pd.DataFrame(json_array)
print(df)

df.to_json("./arquivo_to_json.json", orient="records")
