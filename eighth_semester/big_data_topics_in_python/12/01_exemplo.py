import pandas as pd

df = pd.DataFrame(
    {
        "Animal": ["Falcon", "Falcon", "Parrot", "Parrot"],
        "Max Speed": [380.0, 370.0, 24.0, 26.0],
    }
)
grouped = df.groupby(["Animal"])
print(grouped.mean())
