--
SELECT *
FROM EMPREGADO
WHERE ID_DEPTO = (
        SELECT ID
        FROM DEPARTAMENTO
        WHERE UPPER (NOME) = 'VENDAS'
    );
--
SELECT *
FROM EMPREGADO
WHERE SALARIO > (
        SELECT AVG(SALARIO)
        FROM EMPREGADO
    );
-- 
SELECT ID_DEPTO,
    AVG(SALARIO)
from empregado
group by id_depto;
--
select ID_DEPTO,
AVG(SALARIO)
from empregado
group by id_depto
having AVG(salario) >= (
        select avg(salario)
        from empregado
    );
--
select ID_DEPTO,
AVG(SALARIO),
(
    select AVG(salario)
    from empregado
) as MEDIA
from empregado
group by id_depto
having AVG(salario) >= (
        select avg(salario)
        from empregado
    );
--
select D.NOME,
SUM(SALARIO) as FOLHA,
AVG(SALARIO) as MEDIA
from empregado e
    inner join departamento d on E.ID_DEPTO = D.ID
group by D.ID,
    D.NOME
having AVG(SALARIO) >= (
        select AVG(SALARIO)
        from empregado
    );
--
select ID_DEPTO, SUM(SALARIO) as FOLHA, AVG(SALARIO) as MEDIA
from empregado
group by id_depto
having AVG(SALARIO) >= (
        select AVG(SALARIO)
        from empregado
    );
