from pyspark import SparkContext
from operator import add

spark_contexto = SparkContext()

paralelo = spark_contexto.parallelize(
    ["distribuida", "distribuida", "spark", "rdd", "spark", "spark"]
)

funcao_lambda = lambda x: (x, 1)

mapa = paralelo.map(funcao_lambda).reduceByKey(add).collect()

for w, c in mapa:
    print("{}: {}".format(w, c))

# spark: 3
# distribuida: 2
# rdd: 1

spark_contexto.stop()
