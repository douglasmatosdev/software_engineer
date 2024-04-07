CREATE TABLE cliente (
    codigo uuid primary key ,
    nome varchar ,
    login varchar ,
    email varchar ,
    cidade varchar 
) ;

CREATE TABLE clientes_por_cidade (
    login varchar PRIMARY KEY,
    cidade varchar 
) ;

-- Para a inclusão de registros na tabela clientes_por_cidade, pode-se usar também o comando INSERT que avalia a existência de registros com o mesmo valor no campo criado como chave primária
INSERT INTO clientes_por_cidade ( login, cidade ) VALUES ( 'ana', 'Rio de Janeiro' ) IF NOT EXISTS ;

-- Se fosse identificada a necessidade de consultar os clientes por meio do atributo e-mail, outra tabela poderia ser criada considerando o atendimento a essa demanda.
CREATE TABLE clientes_por_email ( email varchar PRIMARY KEY, login varchar ) ;

