CREATE TABLE usuario (
    codigo uuid,
    nome varchar ,
    login varchar ,
    email varchar ,
    cidade varchar,
    primary key ( codigo, cidade ) 
);

INSERT INTO usuario ( codigo, nome, login, email, cidade ) values ( uuid(), 'Ana', 'ana', 'ana@correioeletronico.com', 'Rio de Janeiro' ) ;
INSERT INTO usuario ( codigo, nome, login, email, cidade ) values ( uuid(), 'Nei', 'nei', 'nei@correioeletronico.com', 'Rio de Janeiro' ) ;
INSERT INTO usuario ( codigo, nome, login, email, cidade ) values ( uuid(), 'Rui', 'rui', 'rui@correioeletronico.com', 'Rio Grande do Sul' ) ;
INSERT INTO usuario ( codigo, nome, login, email, cidade ) values ( uuid(), 'Lia', 'lia', 'lia@correioeletronico.com', 'Rio Grande do Sul' ) ;
INSERT INTO usuario ( codigo, nome, login, email, cidade ) values ( uuid(), 'Maria', 'ana', 'maria@correioeletronico.com', 'Rio Grande do Norte' ) ;


SELECT * FROM usuario WHERE codigo = 6cc008c2-11bf-4e04-b80f-8c217482cf88;

SELECT * FROM usuario
WHERE codigo IN (4319c344-f7f9-40fb-92cd-53e1d8e9b449)
AND cidade IN ('Rio de Janeiro');

-- vai dar erro, precisa de um índice secundário
SELECT * FROM usuario WHERE nome = 'Lia' ;

CREATE INDEX ON usuario (nome) ;



SELECT count( nome ) as total
FROM usuario
WHERE cidade = 'Rio de Janeiro'
allow filtering ;

