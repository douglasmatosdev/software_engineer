-- produto cartesiano

--sintaxe tradicional
select * from empregado, departamento;
-- usando cross join
select * from empregado cross join departamento;


-- junção

-- sintaxe tradicional
select * from empregado, departamento where id_depto = DEPARTAMENTO.id;

-- usando inner join
select * from empregado inner join departamento on id_depto = DEPARTAMENTO.id;


-- join tabela cliente com a tabela empregado
-- sintaxe tradicional 
select * from cliente, empregado where vendedor = empregado.id;

-- com inner join
select * from cliente inner join empregado on vendedor = empregado.id;

-- join tabela departamento com a tabela regiao

--sintaxe tradicional
select * from departamento, regiao where departamento.id_regiao = regiao.id_regiao;

--sintaxe tradicional usando alias
select * from departamento d, regiao r where d.id_regiao = r.id_regiao;

-- usando inner join
select * from departamento d inner join regiao r on d.id_regiao = r.id_regiao;

-- retornando colunas 
select d.id, d.nome, r.nome from departamento d inner join regiao r on d.id_regiao = r.id_regiao;

select d.id, d.nome, r.* from departamento d inner join regiao r on d.id_regiao = r.id_regiao;



select * from departamento cross join regiao;

select * from empregado  cross join departamento cross join regiao;

select  d.nome, r.nome from departamento d cross join regiao r;

select  * from departamento d, regiao r  where d.id_regiao  = r.id_regiao;

select * from empregado e inner join departamento d on e.id_depto = d.id inner join regiao r on d.id_regiao = r.id_regiao;
select e.id, e.ult_nome, d.id, d.nome, r.nome  from empregado e inner join departamento d on e.id_depto = d.id inner join regiao r on d.id_regiao = r.id_regiao; 
select e.id, e.ult_nome, d.id, d.nome, r.nome  from empregado e, departamento d, regiao r where e.id_depto = e.id_depto and d.id_regiao = r.id_regiao;