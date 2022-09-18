-- =  igual
-- <> ou != diferente
-- >  maior
-- <  menor


SELECT * from EMPREGADO;
SELECT * from EMPREGADO WHERE ID < 3;
SELECT * from CLIENTE;
SELECT ID from CLIENTE WHERE NOME = 'Ponto Quente';
SELECT ID from CLIENTE WHERE UPPER(NOME) = 'PONTO QUENTE';
SELECT ID, NOME from CLIENTE WHERE UPPER(NOME) = 'PONTO QUENTE';
SELECT ULT_NOME, DT_ADMISSAO from EMPREGADO WHERE DT_ADMISSAO = '3/3/2009';
SELECT ULT_NOME, DT_ADMISSAO FROM EMPREGADO WHERE DT_ADMISSAO = '3/MAR/2009';
SELECT ULT_NOME, DT_ADMISSAO FROM EMPREGADO WHERE DT_ADMISSAO = '3/MARCH/2009';
SELECT ULT_NOME, DT_ADMISSAO FROM EMPREGADO WHERE DT_ADMISSAO = '3/MAR/09';

SELECT * FROM EMPREGADO WHERE UPPER(ULT_NOME) > 'NEVES';
SELECT * FROM EMPREGADO WHERE DT_ADMISSAO >= '05/05/2009';

SELECT * FROM EMPREGADO WHERE DT_ADMISSAO > '1/1/2010' AND SALARIO > 10000;
SELECT * FROM EMPREGADO WHERE DT_ADMISSAO > '1/1/2010' OR SALARIO > 10000;


-- Atividade

-- 1. Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- Mostrar primeiro nome e sobrenome dos empregados lotados no departamento, cuja identificação é 20. O retorno esperado é exibido na figura.
SELECT ult_nome, cargo FROM EMPREGADO WHERE id_depto = 20;

-- 2. Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- Mostrar sobrenome e cargo dos empregados admitidos após 3/3/2009. O retorno esperado é exibido na figura.
SELECT ult_nome, cargo FROM EMPREGADO WHERE dt_admissao > '3/3/2009';

-- 3. Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- Mostrar sobrenome, cargo e salário dos empregados que não sejam Vendedores. O retorno esperado é exibido na figura.
SELECT ult_nome, cargo, salario FROM EMPREGADO WHERE UPPER(cargo) <> 'VENDEDOR';

-- 4. Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- Mostrar sobrenome, cargo e salário dos empregados que ganham menos que R$18.000 e que não sejam vendedores. O retorno esperado é exibido na figura.
SELECT ult_nome, cargo, salario FROM EMPREGADO WHERE salario < 18000 AND UPPER(cargo) <> 'VENDEDOR';

-- 5. Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- Mostrar sobrenome, cargo e salário dos empregados que são vendedores ou que ganham pelo menos R$18.000. O retorno esperado é exibido na figura.
SELECT ult_nome, cargo, salario FROM EMPREGADO WHERE UPPER(CARGO) = 'VENDEDOR' OR salario >= 18000;

-- 6. Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- Altere o comando:
-- SELECT ULT_NOME, CARGO, SALARIO FROM EMPREGADO WHERE UPPER(CARGO) = 'VENDEDOR' OR SALARIO >= 18000
-- Para mostrar sobrenome, cargo e salário dos empregados que ganham menos que R$18.000 e que não sejam vendedores.
-- Essa alteração deverá ser feita pelo acréscimo do operador lógico NOT e de parênteses onde for o caso.
-- O retorno esperado é exibido na figura.
SELECT ULT_NOME, CARGO, SALARIO FROM EMPREGADO WHERE NOT (UPPER(CARGO) = 'VENDEDOR' OR salario >= 18000);

-- 7. Utilizando o nosso banco de dados de exemplo para fazer alguns exercícios.
-- Mostrar todos os dados dos empregados contratados que trabalham no departamento 10 ou no departamento 30 (resolver utilizando operadores lógicos).
-- O retorno esperado é exibido na figura.
SELECT * FROM EMPREGADO WHERE id_depto  = 10 OR id_depto  = 30;


