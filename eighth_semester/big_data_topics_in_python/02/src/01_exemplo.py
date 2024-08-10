from pyspark import SparkContext
import numpy as np
from operator import add

spark_contexto = SparkContext()

vetor = np.array([10, 20, 30, 40, 50])

paralelo = spark_contexto.parallelize(vetor)

print(paralelo)

mapa = paralelo.map(lambda x : x**2+x) # f(x) = x² + x

print(mapa.collect()) # [110, 420, 930, 1640, 2550]

somatorio = mapa.reduce(add)

print(somatorio) # 5650