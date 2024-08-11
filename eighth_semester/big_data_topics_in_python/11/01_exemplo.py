import pandas as pd

df = pd.DataFrame(
    [[1, 2], [4, 5], [7, 8]],
    index=["cobra", "viper", "sidewinder"],
    columns=["max_speed", "shield"],
)
print(df.loc["viper"])
print(df.loc[["viper", "sidewinder"]])
