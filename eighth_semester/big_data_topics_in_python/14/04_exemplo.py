import plotly.express as px

df = px.data.tips()
fig = px.pie(df, values="tip", names="day")
fig.show()
