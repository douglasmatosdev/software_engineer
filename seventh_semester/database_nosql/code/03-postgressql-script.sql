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

SELECT distinct akeys(detalhes) FROM livros order by 1;

SELECT distinct skeys(detalhes) FROM livros;

SELECT distinct avals(detalhes) as detalhes FROM livros;

SELECT distinct svals(detalhes) as detalhes FROM livros WHERE detalhes->'ISBN' = '1788472292';

SELECT * FROM livros WHERE detalhes ? 'ISBN-13';

SELECT titulo FROM livros WHERE detalhes @>'"peso" => "798 g"'::hstore ;

SELECT hstore_to_json (detalhes) json FROM livros ;

SELECT titulo,(EACH(detalhes) ).* FROM livros;