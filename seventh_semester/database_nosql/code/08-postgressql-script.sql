
--cria a tabela temporária
WITH cliente_locacao AS
--agrupa os livros por autor
(
SELECT c.dataAS cliente,json_agg(l.data) as locacao
FROM cliente c LEFT JOIN locacao l
ON c.idcliente = l.cliente_idcliente
WHERE l.cliente_idcliente is not NULL
GROUP BY 1
)

--aplicação da função jsonb_pretty() sobre a tabela temporária para apresentar os documentos indentados:
SELECT jsonb_pretty(cliente || jsonb_build_object('locacao', locacao)) AS locacao FROM cliente_locacao;
