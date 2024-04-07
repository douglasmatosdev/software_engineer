CREATE TABLE livros (
nr serial primary key ,
titulo varchar(255) ,
detalhes json ) ;

SELECT * FROM livros ;

INSERT INTO livros ( titulo, detalhes ) VALUES
( 'Mastering PostgreSQL 10',
'{
"paginas" : 428,
"peso" : "798 g",
"ISBN" : "1788472292",
"idioma" : "inglês",
"assunto" : "PostgreSQL",
"ISBN-13" : "978-1788472296 "
}' ) ;

INSERT INTO livros ( titulo, detalhes )
VALUES ( ' NOSQL Essencial: Um Guia Conciso para o Mundo Emergente da Persistência Poliglota ',
'{
"paginas" : 216,
"publicador" : "Novatec",
"idioma" : "português",
"ISBN" : "8575223380",
"peso" : "381 g",
"ISBN-13" : "978-1788472296"
}' ) ;

UPDATE livros
SET detalhes = replace(detalhes::text,'"paginas" : 428 '::text,'"paginas" : 429 '::text)::json
WHERE detalhes ->> 'ISBN' = '1788472292'

SELECT detalhes -> 'idioma' AS "Idioma" FROM livros;

SELECT * FROM livros WHERE detalhes ->> 'ISBN' = '1788472292';

SELECT * FROM livros WHERE detalhes ->> 'ISBN' ILIKE '%88%' ;
