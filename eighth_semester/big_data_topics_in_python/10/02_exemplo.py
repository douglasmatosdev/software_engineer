import pandas as pd

json_array = [{"a": 1, "b": 2}, {"a": 3, "b": 4}, {"a": 5, "b": 6}]

df = pd.DataFrame(json_array)

df.info()

# df.describe() – note que pode ser necessário usar print para exibir no console
