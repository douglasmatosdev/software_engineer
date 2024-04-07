CREATE TABLE filmes ( idfilme serial NOT NULL,dados jsonb);

SELECT * FROM filmes;


INSERT INTO filmes (dados) VALUES
( '{ "titulo": "Filme_A", "generos": ["Curta", "Romance", "Terror"], "publicado": false }' ) ,
( '{ "titulo": "Filme_B", "generos": ["Marketing", "Auto-ajuda", "Psicologia"], "publicado": true }' ) ,
( '{ "titulo": "Filme_C", "generos": ["Justiça", "Política"], "autores": ["Ana","Nei"],"publicado" : true }' ) ,
( '{ "titulo": "Filme_D", "generos": ["Produtividade", "Tecnologia"]," publicado": true }' ) ,
( '{ "titulo": "Filme_E", "generos": ["Ficção", "Infanto-juvenil"], "publicado": true }' ) ;

-- As consultas a seguir listam os títulos e os gêneros dos filmes em formato JSONB e em texto, respectivamente.
SELECT dados -> 'titulo' as titulo, dados -> 'generos' AS generos FROM filmes ORDER BY 1 ;
SELECT dados ->> 'titulo' as titulo, dados ->> 'generos' AS generos FROM filmes ORDER BY 1 ;

-- Uma consulta para exibir somente registros que satisfazem a uma determinada condição em uma chave booleana.
SELECT * FROM filmes WHERE dados->'publicado' = 'false';

-- Com a função jsonb_array() pode-se listar cada elemento de um campo JSON em linhas separadas.
SELECT jsonb_array_elements_text(dados -> 'generos') AS genero FROM filmes WHERE idfilme = 3;

-- Pode-se efetuar a busca na tabela a partir do valor de um elemento do array em JSONB
SELECT dados->'titulo' as titulo,dados->'generos' as generos FROM filmes WHERE dados->'generos' @> '["Ficção"]'::jsonb;

INSERT INTO filmes (dados) VALUES
( '{ "titulo": "Filme_F", "generos": ["Curta", "Romance"], "publicado": false }' ) ;
SELECT dados -> 'titulo' as titulo, dados -> 'generos'AS generos
FROM filmes
WHERE dados->'generos' @> '["Curta", "Romance"]'::jsonb;

-- As consultas a seguir apresentam os registros que contêm, respectivamente, o total de registros com as chaves‘autores’ e‘generos’. 
SELECT COUNT(*) as total FROM filmes WHERE dados ? 'autores';
SELECT COUNT(*) as total FROM filmes WHERE dados ? 'generos';

-- na próxima consulta é apresentada a função jsonb_pretty( ) que possibilita a visão dos dados de forma indentada. 
SELECT dados -> 'titulo' as titulo, dados -> 'generos'AS generos, jsonb_pretty( dados ) FROM filmes order by 1 ;

-- Caso seja necessário adicionar uma chave, pode-se realizar a concatenação da seguinte forma:
UPDATE filmes SET dados = dados || '{"ano":"2015"}'::jsonb WHERE idfilme = 3 ;










