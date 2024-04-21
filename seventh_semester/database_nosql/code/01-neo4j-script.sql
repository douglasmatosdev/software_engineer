CREATE (ana:Pessoa {nome: 'Ana' , email: 'ana@meumail.com'})
CREATE (lia:Pessoa {nome: 'Lia' , email: 'lia@meumail.com'})
CREATE (luis:Pessoa {nome: 'Luís' , email: 'luis@meumail.com'})
CREATE (rui:Pessoa {nome: 'Rui' , email: 'rui@meumail.com'})
CREATE (nei:Pessoa {nome: 'Nei' , email: 'nei@meumail.com'})
CREATE (ana)-[:AMIGO] -> (lia)-[:AMIGO] -> (luis)
CREATE (ana)-[:AMIGO] -> (rui)-[:AMIGO] -> (nei)
return ana, lia, luis, rui, nei

-- Os dados dos nós podem ser visualizados pelo comando abaixo, que é comparado a um SELECT * FROM <nome_da_tabela>. 
MATCH (n) RETURN n

MATCH (n) RETURN n.nome

MATCH (n) RETURN n.nome, n.email ORDER BY n.nome

MATCH ( n { nome : 'Lia' } ) SET n.nome = 'Lia Maria' RETURN n.nome

MATCH ( n { nome : 'Lia Maria' } ) RETURN n