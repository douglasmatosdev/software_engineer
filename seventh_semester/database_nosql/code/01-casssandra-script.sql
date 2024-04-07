-- cqlsh
-- cqlsh -h
-- cqlsh -u cassandra -p cassandra

CREATE KEYSPACE aula WITH replication = {'class':'SimpleStrategy','replication_factor' : 1 };

DESCRIBE keyspaces;

USE aula;

DESCRIBE aula ;

CREATE KEYSPACE aula WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'}AND durable_writes = true ;

DROP keyspace aula;

CREATE TABLE cliente (
    codigo uuid primary key ,
    nome varchar ,
    cidade varchar 
) ;

CREATE COLUMNFAMILY cliente2 (
    codigo uuid primary key ,
    nome varchar ,
    cidade varchar 
) ;

DROP COLUMNFAMILY cliente2 ;

DROP TABLE cliente ;

ALTER TABLE cliente ADD fone map< text, text> ;

INSERT INTO cliente(codigo, nome, cidade, fone) VALUES (uuid(), 'Ana', 'Rio de Janeiro', {'21' : '1111-2222'});

INSERT INTO cliente(codigo, nome, cidade, fone) VALUES (uuid(), 'Lia', 'Minas Gerais', {'21' : '1111-2222' , '31' : '2222-3333'});

SELECT * FROM cliente;

UPDATE cliente SET fone = fone - {'21'} WHERE codigo =309c705e-cc18-434f-88ee-a1a208f43f1f ;

ALTER TABLE cliente ADD contatos set<text> ;
UPDATE cliente SET contatos = { 'Rui', 'Nei' } WHERE codigo =309c705e-cc18-434f-88ee-a1a208f43f1f;

