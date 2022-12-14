-- Criando uma tabela com chave primária
CREATE TABLE MODELO (COD_MOD NUMERIC(3) PRIMARY KEY, NOME VARCHAR(80));

-- criando uma tabela com chave primária
CREATE TABLE PROPRIETARIO (COD_PROP NUMERIC(8) PRIMARY KEY, NOME VARCHAR(110) NOT NULL, CPF VARCHAR(11) UNIQUE);

-- criando uma tabela com chave primária e relacinamento com outra tabela
CREATE TABLE VEICULO
(PLACA CHAR(7) PRIMARY KEY,
COR VARCHAR(20),
MODELO NUMERIC(3) REFERENCES MODELO(COD_MOD),
PROPRIETARIO NUMERIC(8) REFERENCES PROPRIETARIO(COD_PROP),
ANO_FAB CHAR(4),
ANO_MOD CHAR(4),
VALOR_SEGURADO NUMERIC(9,2));

-- criando uma tabela com chave primária
CREATE TABLE DEPARTAMENTO (ID NUMERIC(7) PRIMARY KEY, NOME VARCHAR(40) NOT NULL);

-- selecionando uma tabela
SELECT * FROM DEPARTAMENTO;

-- Criando tabela com chave primária e relacinamento com outra tabela
CREATE TABLE EMPREGADO
( ID NUMERIC(7) PRIMARY KEY,
ULT_NOME VARCHAR(20) NOT NULL,
PRIM_NOME VARCHAR(20) NOT NULL,
CARGO VARCHAR(30),
SALARIO NUMERIC(7,2),
DT_ADMISSAO DATE,
CPF CHAR(11) UNIQUE,
ID_DEPTO NUMERIC(7) REFERENCES DEPARTAMENTO(ID));

-- Criando uma tabela como chave primária e campo de preenchimento obrigatório
CREATE TABLE CLIENTE
( ID NUMERIC(7) PRIMARY KEY,
NOME VARCHAR(40) NOT NULL,
VENDEDOR NUMERIC(7));

-- Selecionando uma tabela
SELECT * FROM DEPARTAMENTO;

-- Adicionando uma coluna na tabela
ALTER TABLE DEPARTAMENTO ADD descricao VARCHAR(30) NOT NULL;
SELECT * FROM DEPARTAMENTO;

-- Deletando uma coluna da tabela
ALTER TABLE DEPARTAMENTO DROP COLUMN DESCRICAO;
SELECT * FROM DEPARTAMENTO;

-- Adicionando uma chave estrangeira
ALTER TABLE CLIENTE ADD FOREIGN KEY (VENDEDOR) REFERENCES EMPREGADO(ID);
SELECT * FROM CLIENTE;

-- Chaves primárias compostas
CREATE TABLE TURMAS
(CODIGO_TURMA NUMBER(6),
CODIGO_CURSO NUMBER(3),
CODIGO_FUNCIONARIO NUMBER(6),
DATA_INICIO DATE,
DATA_FIM DATE ,
SALA NUMBER(2),
PRIMARY KEY (CODIGO_TURMA, CODIGO_CURSO) );

-- deletando a tabela turmas
DROP TABLE TURMAS;
SELECT * FROM TURMAS; -- vai dar erro pois acabamos de deletar a tabela

-- tentando deletar uma tabela que possui relacionamento com outra
DROP TABLE DEPARTAMENTO;
--ERROR:  cannot drop table departamento because other objects depend on it
--DETAIL:  constraint empregado_id_depto_fkey on table empregado depends on table departamento
--HINT:  Use DROP ... CASCADE to drop the dependent objects too.
--SQL state: 2BP01

-- inserindo dados na tabela MODELO
INSERT INTO MODELO(COD_MOD, NOME) VALUES (101, 'CLASSIC');
INSERT INTO MODELO(COD_MOD, NOME) VALUES (102, 'SANDERO');
INSERT INTO MODELO(COD_MOD, NOME) VALUES (103, 'KA');
INSERT INTO MODELO(COD_MOD, NOME) VALUES (104, 'PALIO');
INSERT INTO MODELO(COD_MOD, NOME) VALUES (105, 'GOL');

BEGIN TRANSACTION;
UPDATE MODELO;
SET COD_MOD = COD_MOD  + 100;
SELECT * FROM MODELO;

BEGIN TRANSACTION;
UPDATE MODELO;
SET COD_MOD = COD_MOD  + 100 WHERE COD_MOD > 203;
SELECT * FROM MODELO;

DELETE FROM MODELO; -- deleta todas as linhas da tabela
ROLLBACK -- desfaz todas alterações desde BEGIN TRANSACTION

-- inserindo dados na tabela PROPRIETARIO
INSERT INTO PROPRIETARIO (COD_PROP, NOME, CPF) VALUES(10812, 'DILMA NEVES', '51230611266');
INSERT INTO PROPRIETARIO (COD_PROP, NOME, CPF) VALUES(10816, 'JAQUELINE MEIRELES', NULL);
INSERT INTO PROPRIETARIO (COD_PROP, NOME, CPF) VALUES(10819, 'IVONE NEVILLE', '21233622471');
INSERT INTO PROPRIETARIO (COD_PROP, NOME, CPF) VALUES(10821, 'MARIANA ROSA', '41293524158');
INSERT INTO PROPRIETARIO (COD_PROP, NOME, CPF) VALUES(10823, 'MARIA CHINALIA', '62421381231');


-- inserindo dados na tabela VEICULO
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('LGA4674', 'BRANCO', 101, 10816, '2010', '2011', 22849.4);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('KTM2693', 'PRETO', 101, 10823, '2010', '2010', 20584.68);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('KTM6449', 'VERMELHO', 102, 10823, '2018', '2018', 52584.68);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('NTA3259', 'VERDE', 102, 10819, '2013', '2014', 33000.93);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('LVA3600', 'PRETO', 103, 10823, '2015', '2015', 38979.67);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('KTM8642', 'PRETO', 105, 10812, '2009', '2009', 172584.68);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('LTU4580', 'AMARELO', 105, 10816, '2015', '2015', 35732.11);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('LVA8755', 'VERMELHO', 104, 10819, '2016', '2016', 23452.93);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('NTA4860', 'PRETO', 103, 10819, '2016', '2016', 39017.24);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('KTM9642', 'VERMELHO', 102, 10823, '2014', '2014', 31510.3);

-- inserindo dados na tabela DEPARTAMENTO
INSERT INTO DEPARTAMENTO (ID, NOME) VALUES(100, 'VENDAS');
SELECT  * FROM DEPARTAMENTO;

INSERT INTO DEPARTAMENTO (ID, NOME) VALUES(200, 'COMPRAS');
SELECT  * FROM DEPARTAMENTO;


-- inserindo valores nulos
INSERT INTO EMPREGADO (ID, PRIM_NOME, ULT_NOME, ID_DEPTO) VALUES(10, 'PEDRO', 'RODRIGUES', 100);
SELECT  * FROM EMPREGADO;

-- ou

INSERT INTO EMPREGADO VALUES(20, 'FONSECA', 'ANTONIO', null, null, null, null, 200);
SELECT  * FROM EMPREGADO;

-- cuidado com o formato da data, pois pode dar erro no formato DD/MM/AAAA o padrão no Postgres é AAAA/MM/DD
INSERT INTO EMPREGADO VALUES(2, 'Neves', 'Lauro', 'Diretor de Compras',19500, '2009/03/07','23456789012',200);
INSERT INTO EMPREGADO VALUES(3, 'Nogueira', 'Mário','Diretor de Vendas', 18000, '2010/04/07','34567890123',100);
INSERT INTO EMPREGADO VALUES(4, 'Queiroz', 'Mark','Gerente de Compras',8000, '2010/11/07','12345432123',200);
INSERT INTO EMPREGADO VALUES( 5, 'Rodrigues', 'Alberto', 'Vendedor',4000, '2008/1/10', '87965432123', 100);
INSERT INTO EMPREGADO VALUES( 6, 'Ugarte', 'Marlene', 'Vendedor', 3500,'2009/11/23', '87654345678',100);
SELECT  * FROM EMPREGADO;

-- alterando o valor em todas as linhas
UPDATE EMPREGADO SET SALARIO = SALARIO + 1000;
SELECT  * FROM EMPREGADO;

-- alterando valores pelo id
UPDATE EMPREGADO SET SALARIO = 3000 WHERE ID = 10 OR ID = 20;
SELECT * FROM EMPREGADO;

-- deletando pelo id
DELETE FROM EMPREGADO WHERE ID = 10;
SELECT * FROM EMPREGADO;

-- deletando tabelas
DROP TABLE CLIENTE;
DROP TABLE EMPREGADO;
DROP TABLE DEPARTAMENTO;


-- ATIVIDADE
CREATE TABLE REGIAO (ID_REGIAO NUMERIC(7) PRIMARY KEY, NOME VARCHAR(40));
SELECT * FROM REGIAO;

CREATE TABLE DEPARTAMENTO (ID NUMERIC(7) PRIMARY KEY, NOME VARCHAR(40) NOT NULL, ID_REGIAO NUMERIC(7) REFERENCES REGIAO(ID_REGIAO));
SELECT * FROM DEPARTAMENTO;

CREATE TABLE EMPREGADO (
	ID NUMERIC(7) PRIMARY KEY,
	ULT_NOME VARCHAR(20) NOT NULL,
	PRIM_NOME VARCHAR(20) NOT NULL,
	CARGO VARCHAR(30),
	SALARIO NUMERIC(7,2),
	DT_ADMISSAO DATE,
	CPF CHAR(11) UNIQUE,
	ID_DEPTO NUMERIC(7) REFERENCES DEPARTAMENTO(ID),
	ID_GERENTE NUMERIC(7) REFERENCES EMPREGADO(ID)
);
SELECT * FROM EMPREGADO;


CREATE TABLE CLIENTE (
	ID NUMERIC(7) PRIMARY KEY,
	NOME VARCHAR(40) NOT NULL,
	VENDEDOR NUMERIC(7) REFERENCES EMPREGADO(ID)
);


-- POPULANDO AS TABELAS
BEGIN TRANSACTION;
INSERT INTO REGIAO VALUES(1, 'Norte');
INSERT INTO REGIAO VALUES(2, 'Sul');

INSERT INTO DEPARTAMENTO VALUES(10, 'Administrativo', 1);
INSERT INTO DEPARTAMENTO VALUES(20, 'Vendas', 1);
INSERT INTO DEPARTAMENTO VALUES(30, 'Compras', 2);


INSERT INTO EMPREGADO VALUES(1, 'Velasques', 'Carmen', 'Presidente', 29500, '05/05/2009', '34567890125', 10, NULL);
INSERT INTO EMPREGADO VALUES(2, 'Neves', 'Lauro', 'Diretor de Compras', 19500, '03/03/2009', '23456789012', 30, 1);
INSERT INTO EMPREGADO VALUES(3, 'Nogueira', 'Emane', 'Diretor de Compras', 18000, '07/04/2010', '34567890123', 20, 1);
INSERT INTO EMPREGADO VALUES(4, 'Queiroz', 'Mark', 'Gerente de Compras', 8000, '11/11/2010', '11111111111', 30, 2);
INSERT INTO EMPREGADO VALUES(5, 'Rodrigues', 'Alberto', 'Vendedor', 4000, '10/10/2008', '22222222222', 20, 3);
INSERT INTO EMPREGADO VALUES(6, 'Ugarte', 'Mariene', 'Vendedor', 3500, '03/03/2009', '3333333333', 20, 3);


INSERT INTO CLIENTE VALUES(110, 'Ponto Quente', 5);
INSERT INTO CLIENTE VALUES(120, 'Casa Supimpa', 6);
INSERT INTO CLIENTE VALUES(130, 'Coisas e Tralhas', 5);
INSERT INTO CLIENTE VALUES(140, 'Casa Desconto', NULL);
COMMIT;


SELECT COUNT(*) FROM EMPREGADO;

-- ATIVIDADE
CREATE TABLE PROPRIETARIO (
	COD_PROP NUMERIC(8) PRIMARY KEY,
	NOME VARCHAR(40),
	CPF CHAR(11) UNIQUE
);

CREATE TABLE MODELO(
	COD_MOD NUMERIC(3) PRIMARY KEY,
	NOME VARCHAR(40)
);
CREATE TABLE VEICULO (
	PLACA          CHAR(7) PRIMARY KEY,
  COR            VARCHAR(20),
  MODELO         NUMERIC(3) REFERENCES MODELO(COD_MOD),
  PROPRIETARIO   NUMERIC(8) REFERENCES PROPRIETARIO (COD_PROP),
  ANO_FAB        CHAR(4),
  ANO_MOD        CHAR(4),
  VALOR_SEGURADO NUMERIC(9,2));

INSERT INTO PROPRIETARIO VALUES(10812,'DILMA NEVES','51230611266');
INSERT INTO PROPRIETARIO VALUES(10816,'JAQUELINE MEIRELES',NULL);
INSERT INTO PROPRIETARIO VALUES(10819,'IVONE NEVILLE','21233622471');
INSERT INTO PROPRIETARIO VALUES(10821,'MARIANA ROSA','41293524158');
INSERT INTO PROPRIETARIO VALUES(10823,'MARIA CHINALIA','62421381231');

INSERT INTO MODELO VALUES(101, 'CLASSIC');
INSERT INTO MODELO VALUES(102, 'SANDERO');
INSERT INTO MODELO VALUES(103, 'KA');
INSERT INTO MODELO VALUES(104, 'PALIO');
INSERT INTO MODELO VALUES(105, 'GOL');

INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('LGA4674', 'BRANCO', 101, 10816, '2010', '2011', 22849.4);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('KTM2693', 'PRETO', 101, 10823, '2010', '2010', 20584.68);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('KTM6449', 'VERMELHO', 102, 10823, '2018', '2018', 52584.68);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('NTA3259', 'VERDE', 102, 10819, '2013', '2014', 33000.93);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('LVA3600', 'PRETO', 103, 10823, '2015', '2015', 38979.67);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('KTM8642', 'PRETO', 105, 10812, '2009', '2009', 172584.68);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('LTU4580', 'AMARELO', 105, 10816, '2015', '2015', 35732.11);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('LVA8755', 'VERMELHO', 104, 10819, '2016', '2016', 23452.93);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('NTA4860', 'PRETO', 103, 10819, '2016', '2016', 39017.24);
INSERT INTO VEICULO (PLACA, COR, MODELO, PROPRIETARIO, ANO_FAB, ANO_MOD, VALOR_SEGURADO) VALUES('KTM9642', 'VERMELHO', 102, 10823, '2014', '2014', 31510.3);

