select cargo from empregado;
select distinct cargo from empregado;
select distinct cargo, ult_nome from empregado;

-- Atividade

-- Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- 1. Mostrar uma única vez os cargos dos empregados como o cabeçalho Cargos Diferentes. O retorno esperado é exibido na figura.
select distinct cargo as "CARGOS DIFERENTES" from empregado;

SELECT * FROM DEPARTAMENTO;
SELECT * FROM DEPARTAMENTO WHERE ID_REGIAO = 1;

select COUNT(*) from departamento;
select COUNT(*) from departamento where id_regiao = 1;

-- FUNÇÕES DE GRUPO
-- AVG(coluna)
-- MAX(coluna)
-- MIN(coluna)
-- SUM(coluna)
-- COUNT(coluna)
-- COUNT(*)

SELECT * FROM empregado;
SELECT AVG(SALARIO), SUM(SALARIO) FROM empregado;

select MAX(SALARIO), MIN(SALARIO),
	   MAX(ULT_NOME), MIN(ULT_NOME),
	   MAX(DT_ADMISSAO), MIN(DT_ADMISSAO)
from empregado;

SELECT  COUNT(*), COUNT(ID), COUNT(ID_GERENTE) FROM EMPREGADO

select CARGO, ID_DEPTO from empregado;
select COUNT(CARGO), COUNT(distinct CARGO), COUNT(ID_DEPTO), COUNT(distinct ID_DEPTO) from empregado;


-- Atividade
-- Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- 2. Mostrar salário médio, maior salário, menor salário e total dos salários de todos os empregados. O retorno esperado é exibido na figura.
select avg(SALARIO), MAX(SALARIO), MIN(SALARIO), SUM(SALARIO) from empregado;

-- 3. Mostrar o sobrenome que é o primeiro em ordem alfabética com o alias.
-- Primeiro Ordem Alfabética.
select min(ult_nome) as "PRIMEIRO ORDEM ALFABÉTICA" from empregado;


-- 4. Mostrar o sobrenome que é o ÚLTIMO, em ordem alfabética com o alias.
-- – Último Ordem Alfabética.
select max(ult_nome) as "PRIMEIRO ORDEM ALFABÉTICA" from empregado;

-- 5. Mostrar a data de admissão do empregado que possui mais tempo de casa.
select min(dt_admissao) from empregado;

-- GROUP BY
SELECT  COUNT(*), AVG(SALARIO), SUM(SALARIO), ID_DEPTO FROM EMPREGADO GROUP BY ID_DEPTO

-- Atividade

-- Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- 6. Mostrar a quantidade de empregados de cada cargo. O retorno esperado é exibido na figura.
SELECT  CARGO, COUNT(*) FROM EMPREGADO GROUP BY CARGO

-- 7. Mostrar o ID do gerente e a quantidade de empregados que ele gerencia. O retorno esperado é exibido na figura.
select id_gerente , COUNT(*) FROM empregado where id_gerente is not NULL GROUP BY id_gerente

-- 8. Mostrar o ID do vendedor e a quantidade de clientes que ele atende. O retorno esperado é exibido na figura.
select VENDEDOR, COUNT(*)
from cliente
where vendedor is not null
group by vendedor 


SELECT  COUNT(*), AVG(SALARIO), SUM(SALARIO)
FROM EMPREGADO
WHERE ID_DEPTO = 20

SELECT  COUNT(*), AVG(SALARIO), SUM(SALARIO), ID_DEPTO
FROM EMPREGADO
GROUP BY ID_DEPTO
having COUNT(*) > 1


-- Atividade

-- Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- 9. Mostrar a quantidade de empregados, salário médio, maior salário, menor salário e total dos salários para os empregados do departamento 30. O retorno esperado é exibido na figura.
select count(*), avg(SALARIO), MAX(SALARIO), MIN(SALARIO), SUM(SALARIO)
from empregado
where id_depto = 30

-- 10. Mostrar o ID dos vendedores e quantidade de clientes para vendedores que atendem mais de um cliente. O retorno esperado é exibido na figura.
select VENDEDOR, count(*)
from cliente 
where vendedor is not null 
group by vendedor 
having count(*) > 1

-- 11. Mostrar a quantidade de empregados de cada cargo do departamento 20 para os cargos que possuem mais de um empregado. O retorno esperado é exibido na figura.
select cargo, count(*)
from empregado
where id_depto = 20
group by cargo 
having count(*) > 1


-- Ordenando consultas

select ID, ULT_NOME, DT_ADMISSAO, CARGO, SALARIO
from empregado 
order by salario 

select ID, ULT_NOME, DT_ADMISSAO, CARGO, SALARIO
from empregado 
order by salario desc 

-- Ordenação múltipla
select ID, ULT_NOME, DT_ADMISSAO, CARGO, SALARIO
from empregado 
order by cargo desc , salario asc 

select ID, ULT_NOME, DT_ADMISSAO, CARGO, SALARIO
from empregado 
order by 4 desc , 5 asc

