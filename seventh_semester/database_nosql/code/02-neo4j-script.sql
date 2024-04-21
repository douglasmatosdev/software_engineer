CREATE ( :Gerente { nome : 'Léa' } )
CREATE ( :Gerente { nome : 'Luís' } )

MATCH ( n ) RETURN n

CREATE ( : Projeto { nome : 'Projeto 1', data_inicio : '2019-10-06' } )
CREATE ( : Projeto { nome : 'Projeto 2', data_inicio : '2018-11-06' } )
CREATE ( : Projeto { nome : 'Projeto 3', data_inicio : '2017-09-06' } )
CREATE ( : Funcionario { nome : 'Lia', cargo : 'analista de sistemas júnior', salario : 4000.00 } )
CREATE ( : Funcionario { nome : 'Rui', cargo : 'desenvolvedor web júnior', salario : 5000.00 } )
CREATE ( : Funcionario { nome : 'Nei', cargo : 'administrador de banco de dados sênior', salario : 9500.00 } )

MATCH (n) RETURN n


MATCH ( p1 : Gerente { nome : 'Luís' } ) , ( p2 : Projeto { nome : 'Projeto 1' } )
CREATE ( p1 )-[ : GERENCIA ] -> ( p2 ) ;
MATCH ( p1 : Gerente { nome: 'Léa' } ) , ( p2 : Projeto {nome : 'Projeto 2' } )
CREATE ( p1 )-[ :GERENCIA ] -> ( p2 ) ;
MATCH ( p1 : Gerente { nome : 'Léa' } ) , ( p2 : Projeto { nome : 'Projeto 3' } )
CREATE ( p1 )-[ : GERENCIA ] -> ( p2 )

MATCH ( n ) RETURN n


MATCH ( p1 : Funcionario { nome : 'Lia' } ) , ( p2 : Projeto { nome : 'Projeto 1' } )
CREATE ( p1 )-[ : TRABALHA ] -> ( p2 ) ;
MATCH ( p1 : Funcionario { nome : 'Rui' } ) , ( p2 : Projeto { nome : 'Projeto 1' } )
CREATE ( p1 )-[ : TRABALHA ] -> ( p2 ) ;
MATCH ( p1 : Funcionario { nome : 'Nei' } ) , ( p2 : Projeto { nome : 'Projeto 2' } )
CREATE ( p1 )-[ : TRABALHA ] -> ( p2 ) ;
MATCH ( p1 : Funcionario { nome : 'Lia'} ) , ( p2 : Projeto { nome : 'Projeto 2' } )
CREATE ( p1 )-[ : TRABALHA ] -> ( p2 ) ;
MATCH ( p1 : Funcionario { nome : 'Nei'} ) , ( p2 : Projeto { nome : 'Projeto 3' } )
CREATE ( p1 )-[ : TRABALHA] -> ( p2 )

MATCH ( n ) RETURN n

-- --
MERGE ( f : Funcionario { nome : 'João', cargo : 'gerente de suporte pleno', salario : 4000.00 } ) RETURN f

-- --
MATCH ( n : Funcionario { nome : Rui } ) DELETE n

-- ---
MATCH ( p : Funcionario { nome : 'Lia' } )
SET p.salario = 4500.00
RETURN p
-- ---


MATCH ( p : Funcionario { nome : 'Lia Maria' } )

SET p += { email : 'lia@empresa.com.br' }

-- ---

MATCH ( p : Funcionario { nome : 'Lia Maria' } )

SET p.email = null

-- ---



