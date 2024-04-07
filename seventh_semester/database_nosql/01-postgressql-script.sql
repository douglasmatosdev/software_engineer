CREATE EXTENSION hstore;

CREATE TABLE livros (
nr serial primary key,
titulo varchar(255),
detalhes hstore);

INSERT INTO livros ( titulo, detalhes ) VALUES
( 'Mastering PostgreSQL 10',
'
"paginas" => 428,
"assunto" => "PostgreSQL",
"idioma" => "inglês",
"ISBN" => "1788472292",
"ISBN-13" => "978-1788472296",
"peso" => "798 g"
' ) ;

INSERT INTO livros ( titulo, detalhes )

VALUES ( 'NOSQL Essencial: Um Guia Conciso para o Mundo Emergente da Persistência Poliglota',
'
"paginas" => 216,
"publicador" => "Novatec",
"idioma" => "português",
"ISBN" => "8575223380",
"peso" => "381 g"
') ;

SELECT * from livros;

UPDATE livros
SET detalhes = REPLACE(detalhes::text,'"paginas"=>"428"'::text,'"paginas"=>"429"'::text)::hstore
WHERE detalhes ->'ISBN' = '1788472292';

SELECT * FROM livros
WHERE detalhes->'ISBN' = '1788472292';

DROP TABLE livros;