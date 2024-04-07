CREATE TABLE pedidos(
	nr serial primary key,
	detalhes json NOT NULL
);

SELECT * FROM pedidos;

INSERT INTO pedidos(detalhes) VALUES ('{"cliente":"Nei","produto":"Smartphone Xiaomi","qtd":8}'),('{"cliente":"Rui","produto":"Tablet Samsung","qtd":9}'),
('{"cliente":"Lia","produto":"Smartphone iPhone","qtd":5,"peso":194}');

SELECT * FROM pedidos;

drop table pedidos;