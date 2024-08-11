from pyspark import SparkContext

spark_contexto = SparkContext()

lista = [1, 2, 3, 4, 5, 3]

lista_rdd = spark_contexto.parallelize(lista)

count = lista_rdd.count()
print(count)  # 6

par_ordenado = lambda numero: (numero, numero * 10)

lista_flat = lista_rdd.flatMap(par_ordenado).collect()
print(lista_flat)  # [1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 3, 30]

lista_map = lista_rdd.map(par_ordenado).collect()
print(lista_map)  # [(1, 10), (2, 20), (3, 30), (4, 40), (5, 50), (3, 30)]


spark_contexto.stop()
