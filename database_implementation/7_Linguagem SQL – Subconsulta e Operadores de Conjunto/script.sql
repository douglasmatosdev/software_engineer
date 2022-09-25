SELECT C.ID, C.NOME, E.ID, E.ULT_NOME, E. CARGO FROM EMPREGADO E INNER JOIN CLIENTE C ON C.VENDEDOR = E. ID

SELECT C.ID, C.NOME, E.ID, E.ULT_NOME, E. CARGO FROM EMPREGADO E LEFT JOIN CLIENTE C ON C. VENDEDOR = E. ID

SELECT C. ID, C. NOME, E. ID, E. ULT_NOME, E. CARGO FROM EMPREGADO E RIGHT JOIN CLIENTE C ON C.VENDEDOR = E. ID

INSERT INTO REGIAO VALUES (3,'Centro');

select * from regiao r left join departamento d on r.id_regiao  = d.id_regiao;

select * from regiao r left join departamento d on r.id_regiao  = d.id_regiao where d.id is null;

select r.* from regiao r left join departamento d on r.id_regiao  = d.id_regiao where d.id is null;

select r.* from regiao r inner join departamento d on r.id_regiao  = d.id_regiao;

select r.* from regiao r left join departamento d on r.id_regiao  = d.id_regiao;

select r.nome, d.nome from regiao r left join departamento d on r.id_regiao  = d.id_regiao;

select r.nome, coalesce(d.nome, 'NÃO TEM') from regiao r left join departamento d on r.id_regiao  = d.id_regiao;

select c.id, c.nome, e.id, e.ult_nome, e.cargo from empregado e right outer join cliente c on c.vendedor = e.id;

select c.id, c.nome, e.id, e.ult_nome, e.cargo
from cliente c, empregado e
where c.vendedor (+) = e.id;

SELECT G.ID, G.ULT_NOME, G.CARGO, S.ID, S.ULT_NOME, S. CARGO
FROM EMPREGADO G, EMPREGADO S
WHERE S.ID_GERENTE = G.ID

