-- retorna todas as colunas da tabela empregado
SELECT * FROM EMPREGADO;

-- retorna as colunas id, prim_nome, ult_nome da tabela empregado
SELECT ID, PRIM_NOME, ULT_NOME FROM EMPREGADO;

-- retorna todas as colunas da tabela departamento
SELECT * FROM departamento;

-- retorna as colunas nome e id da tabela cliente
SELECT nome, id FROM cliente;

-- retorna a data systema
SELECT NOW() FROM empregado;

-- usando expressões matemáticas
SELECT PRIM_NOME, SALARIO, SALARIO + 10, SALARIO * 10, SALARIO / 10, SALARIO - 10 FROM empregado;

-- concatenação
SELECT PRIM_NOME || ' ' || ULT_NOME FROM EMPREGADO;

-- concatenação com alias para definir o nome da coluna usando o "AS"
SELECT PRIM_NOME || ' ' || ULT_NOME AS NOME_COMPLETO FROM EMPREGADO;

-- concatenação com alias para definir o nome da coluna sem o "AS"
SELECT PRIM_NOME || ' ' || ULT_NOME "NOME_COMPLETO" FROM EMPREGADO;

-- Como seria o comando para mostrar os últimos nomes dos empregados com o cabeçalho Sobrenome
SELECT ULT_NOME AS ULTIMO_NOME FROM EMPREGADO;

-- Como seria o comando para mostrar a concatenação do ID do cliente com o seu Nome com o cabeçalho ‘Dados dos Clientes’? O Id deverá vir separado do nome por um hífen ( - )
SELECT ID || '-' || NOME AS "Dados do Cliente" FROM CLIENTE;

-- exibir resultados de operações aritméticas, retorno de funções ou textos sem o FROM.
SELECT 'ALO', 5+9, NOW();

-- exibir resultados de operações aritméticas, retorno de funções ou textos com o FROM.
SELECT 'ALO', 5+9, NOW() from cliente;