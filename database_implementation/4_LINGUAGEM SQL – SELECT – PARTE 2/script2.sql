-- IN CONTIDO EM (LISTA)
-- BETWEEN ENTRE VALORES
-- LIKE STRING SEMELHANTE
-- IS NULL Testa valores nulos

-- antes
SELECT * FROM EMPREGADO WHERE ID_DEPTO = 10 OR ID_DEPTO = 30;
-- depois
SELECT * FROM EMPREGADO WHERE ID_DEPTO IN (10,30);


-- antes
SELECT * FROM EMPREGADO WHERE not (ID_DEPTO = 10 OR ID_DEPTO = 30);
-- depois
SELECT * FROM EMPREGADO WHERE ID_DEPTO NOT IN (10,30);

-- antes
SELECT * FROM EMPREGADO WHERE SALARIO >= 8000 AND SALARIO <= 20000;
-- depois
SELECT * FROM EMPREGADO WHERE SALARIO BETWEEN 8000 AND 20000;

SELECT * FROM EMPREGADO WHERE dt_admissao BETWEEN '01/01/2009' AND '12/31/2009';
SELECT * FROM EMPREGADO WHERE dt_admissao NOT BETWEEN '01/01/2009' AND '12/31/2009';


-- NULL
SELECT * FROM EMPREGADO WHERE id_gerente IS NULL;

-- NOT NULL
SELECT * FROM EMPREGADO WHERE id_gerente IS NOT NULL;

-- LIKE
SELECT * FROM EMPREGADO WHERE UPPER(ult_nome) LIKE 'N%';

SELECT * FROM EMPREGADO WHERE UPPER(ult_nome) LIKE '%E%';
SELECT * FROM EMPREGADO WHERE UPPER(ult_nome) LIKE '%E';
SELECT * FROM EMPREGADO WHERE UPPER(ult_nome) LIKE '_E%';
SELECT * FROM EMPREGADO WHERE UPPER(ult_nome) NOT LIKE '_E%';

-- ILIKE
SELECT * FROM EMPREGADO WHERE ult_nome ILIKE '_E%';


-- Atividade

-- 8. Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- Mostrar sobrenome, cargo e código do departamento dos empregados que NÃO são Gerentes de Vendas ou Vendedores (resolver utilizando IN). O retorno esperado é exibido na figura.
SELECT ult_nome, cargo, id_depto 
FROM EMPREGADO
where UPPER(CARGO)
NOT INT ('GERENTE DE VENAS','VENDEDOR');

-- 9. Mostrar Ult_nome, data de admissão e salário dos empregados contratados
-- no ano de 2010 (resolver utilizando Between). O retorno esperado é exibido na figura.
SELECT ult_nome, dt_admissao, salario  
FROM EMPREGADO
WHERE dt_admissao BETWEEN '01/01/2010' AND '12/31/2010';

-- 10. Mostrar Ult_nome, data de admissão e salário dos empregados que ganham menos
--  que R$8.000 ou mais que R$18.000 (resolver utilizando Between). O retorno esperado é exibido na figura.
SELECT ult_nome, dt_admissao, salario  
FROM EMPREGADO
WHERE salario NOT BETWEEN 8000 AND 18000;


-- 11. Mostrar primeiro nome e sobrenome dos empregados cujo nome comece pela letra L. O retorno esperado é exibido na figura.
SELECT prim_nome, dt_admissao  
FROM EMPREGADO
WHERE UPPER(prim_nome) LIKE 'L%';

-- 12.Mostrar todos os dados dos clientes cujo nome possua a palavra Casa. O retorno esperado é exibido na figura.
SELECT *  
FROM CLIENTE
WHERE UPPER(nome) LIKE '%CASA%';

-- 13.Mostrar todos os dados dos clientes que possuem pelo menos 13 letras no nome. O retorno esperado é exibido na figura.
SELECT *  
FROM CLIENTE
WHERE UPPER(nome) LIKE '_____________%';

-- 14.Mostrar todos os dados dos clientes que possuem 12 letras ou menos no nome. O retorno esperado é exibido na figura.
SELECT *  
FROM CLIENTE
WHERE UPPER(nome) NOT LIKE '_____________%';


-- 15.Utilizando o banco de dados da seguradora, emita os comandos abaixo utilizando operadores relacionais e lógicos.
-- a. Selecione todos os dados dos proprietários que têm código maior que 10816.
select * from proprietario where cod_prop > 10816;
-- b. Selecione todos os dados dos modelos cujos nomes vêm alfabeticamente depois de ‘ka’.
select * from modelo where nome  > 'KA';
-- c. Selecione todos os dados dos veículos cujo ano de fabricação é diferente do ano do modelo.
select * from veiculo where ano_fab <> ano_mod;
-- d. Selecione todos os dados dos veículos cujo valor segurado seja menor de R$30.000.
select * from veiculo where valor_segurado < 30000;
-- e. Selecione todos os dados dos veículos do modelo 104.
select * from veiculo where modelo = 104;
-- f. Selecione a placa dos veículos do proprietário 10.823.
select placa from veiculo where proprietario = 10823;
-- g. Selecione a placa, o proprietário e a cor dos veículos pretos ou do proprietário 10.812.
select placa, proprietario, cor from veiculo where upper(cor)  = 'PRETO' or proprietario = 10812;
-- h. Selecione a placa, a cor e o modelo dos veículos pretos do modelo 105.
select placa, cor, modelo from veiculo where upper(cor)  = 'PRETO' AND modelo = 105;

-- 16. Utilizando o banco de dados da seguradora, emita os comandos abaixo utilizando operadores do SQL.
-- a. Selecione o código do proprietário que não possui CPF cadastrado.
select cod_prop from proprietario where cpf is null;
-- b. Selecione todos os dados dos modelos cujo nome inicie por ‘P’.
select * from modelo where upper(nome) like 'P%';
-- c. Selecione todos os dados dos veículos cujo ano de fabricação esteja entre 2010 e 2013.
select * from veiculo where ano_fab between '2010' AND '2013';
-- d. Selecione todos os dados dos veículos que não são dos modelos 102 ou 105.
select * from modelo where cod_mod NOT in (102,105);
-- e. Selecione todos os dados dos modelos cujo nome não esteja entre Gol e Palio inclusive.
select * from modelo where upper(nome) not between 'GOL' and 'PALIO';
-- f. Selecione a placa e o código dos proprietários dos veículos pertencentes aos proprietários 10.823 ou 10.812.
select PLACA, proprietario from veiculo WHERE proprietario in (10823,10812);
-- g. Selecione todos os dados dos proprietários cujo CPF não tenha a sequência ‘33’.
select * from proprietario where cpf not like '%33%';
-- h. Selecione todos os dados dos modelos cuja segunda letra seja ‘A’.
select * from modelo where upper(nome) like '_A%'; 