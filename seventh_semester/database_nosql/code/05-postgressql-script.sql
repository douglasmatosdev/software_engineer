CREATE TABLE pedidos (
    nrped serial PRIMARY KEY ,
    detalhes json NOT NULL
) ;


INSERT INTO pedidos (detalhes) VALUES
( '{"cliente": "Nei", "produto": "Produto_1", "qtd": 8, "peso": "1 kg"}' ) ,
( '{"cliente": "Rui", "produto": "Produto_2", "qtd": 9, "peso": "10 kg"}' ) ,
( '{"cliente": "Lia", "produto": "Produto_3", "qtd": 15, "peso": "200 gr"}' ) ,
( '{"cliente": "Lia", "produto": "Produto_4", "qtd": 25, "volume": 2, "cor": "azul"}' ) ,
( '{"cliente": "Ana", "produto": "Produto_5", "qtd": 35, "volume": 3, "cor": "verde"}' ) ,
( '{"cliente": "Lia", "produto": "Produto_6", "qtd": 45, "volume": 4, "cor": "branco"}' ) ,
( '{"cliente": "Rui", "produto":"Produto_7", "qtd":55, "comprimento": "30 cm"}' ) ,
( '{"cliente": "Lia", "produto":"Produto_8", "qtd":65, "comprimento": "4 m"}' ) ,
( '{"cliente": "Rui", "produto":"Produto_9", "qtd":75, "comprimento": "50 mm"}' ) ,
( '{"cliente": "Eli", "produto": "Produto_10", "qtd": 85, "caixa_com": 20}' ) ,
( '{"cliente": "Eli", "produto": "Produto_11", "qtd": 95, "caixa_com": 30}' ) ,
( '{"cliente": "Ana", "produto": "Produto_12", "qtd": 105, "caixa_com": 60}' ) ;

SELECT * FROM pedidos;

-- Para listar uma parte de uma chave como tipo JSON usa-se o operador “->”. Nesse caso,serão listados três nomes de clientes;
SELECT detalhes -> 'cliente' AS cliente FROM pedidos limit 3;

-- Uma observação é que não se pode usar o distinct e order by sobre o campo JSON. Assim, necessita-se transformar para texto com o operador “ ->> ”.
SELECT distinct detalhes ->> 'cliente' AS cliente FROM pedidos order by 1 ;

-- Esse operador também pode ser usado para gerar a listagem apresentando os pedidos feitos pela cliente de nome igual a ‘Ana’. 
SELECT * FROM pedidos WHERE ( detalhes ->> 'cliente'::text ) = 'Ana' ;

-- Caso a necessidade seja a de listar cada chave e o seu respectivo valor em separado.
SELECT json_each ( detalhes )FROM pedidos WHERE ( detalhes ->> 'cliente'::text ) = 'Nei' ;

-- Agora vamos verificar como incluir itens em um pedido usando vetores (arrays) em JSON.
INSERT INTO pedidos(detalhes) VALUES
( '{"cliente": "Nei","itens": [
{ "produto": "Produto_1", "qtd": 2 } ,
{ "produto": "Produto_2", "qtd": 3 } ,
{ "produto": "Produto_3", "qtd": 4 }] }') ;
SELECT * FROM pedidos where nrped = 13;

-- Para verificar somente os itens pode-se fazer assim
SELECT detalhes -> 'itens' as itens FROM pedidos where nrped = 13;

-- Execute as consultas a seguir e verifique que é possível acessar cada elemento do array por meio de seu índice, que tem o valor iniciado em zero:
SELECT detalhes -> 'itens'->>0 as itens FROM pedidos where nrped = 13;

SELECT detalhes -> 'itens'->> 1 as itens FROM pedidos where nrped = 13;

-- A consulta a seguir lista os tipos de dados usados na definição da estrutura da tabela.
-- Esse tipo de consulta permite confirmar os tipos de dados usados e dessa forma avaliar o operador JSON adequado às respostas necessárias.
SELECT distinct json_typeof(detalhes) as detalhes,
json_typeof(detalhes->'itens') as itens FROM pedidos