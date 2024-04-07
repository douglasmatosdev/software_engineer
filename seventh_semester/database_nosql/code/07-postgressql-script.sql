CREATE TABLE socio (
    idsocio SERIAL NOT NULL ,
    nome VARCHAR ,
    endereco VARCHAR ,
    telefone INT ,
    email VARCHAR ,
    PRIMARY KEY(idsocio)
);

CREATE TABLE editora (
    ideditor SERIAL NOT NULL ,
    nome VARCHAR ,
    PRIMARY KEY(ideditor)
);

CREATE TABLE autor (
    idautor SERIAL NOT NULL ,
    nome VARCHAR ,
    PRIMARY KEY(idautor)
);

CREATE TABLE Titulos (
    isbn SERIAL NOT NULL ,
    editora_ideditor INTEGER NOT NULL ,
    titulo INTEGER ,
    PRIMARY KEY(isbn),
    FOREIGN KEY(editora_ideditor) REFERENCES editora(ideditor)
);

CREATE TABLE videos (
    Titulos_isbn INTEGER NOT NULL ,
    duracao NUMERIC ,
    PRIMARY KEY(Titulos_isbn),
    FOREIGN KEY(Titulos_isbn) REFERENCES Titulos(isbn)
);

CREATE TABLE exemplar (
    idlivro SERIAL NOT NULL ,
    Titulos_isbn INTEGER NOT NULL ,
    data_entrada DATE ,
    edicao INTEGER ,
    PRIMARY KEY(idlivro),
    FOREIGN KEY(Titulos_isbn) REFERENCES Titulos(isbn)
);

CREATE TABLE livro (
    Titulos_isbn INTEGER NOT NULL ,
    paginas INTEGER ,
    peso NUMERIC ,
    PRIMARY KEY(Titulos_isbn),
    FOREIGN KEY(Titulos_isbn) REFERENCES Titulos(isbn)
);

CREATE TABLE emprestimo (
    idemprestimo SERIAL NOT NULL ,
    socio_idsocio INTEGER NOT NULL ,
    exemplar_idlivro INTEGER NOT NULL ,
    data_emp DATE ,
    data_devolucao DATE ,
    multa NUMERIC(7,2) ,
    data_reserva DATE ,
    PRIMARY KEY(idemprestimo),
    FOREIGN KEY(exemplar_idlivro) REFERENCES exemplar(idlivro),
    FOREIGN KEY(socio_idsocio) REFERENCES socio(idsocio)
);

CREATE TABLE produz (
    Titulos_isbn INTEGER NOT NULL ,
    autor_idautor INTEGER NOT NULL ,
    PRIMARY KEY(Titulos_isbn, autor_idautor),
    FOREIGN KEY(Titulos_isbn) REFERENCES Titulos(isbn),
    FOREIGN KEY(autor_idautor) REFERENCES autor(idautor)
);

CREATE TABLE cliente(idcliente SERIAL PRIMARY KEY, data JSONB);

INSERT INTO cliente (data) VALUES
(' { "nome" : "Ana" , "rua" : "Rua A" , "nr" : 1 , "complemento" : "101" , "bairro" : "Centro" , "cidade" : "Rio" , "estado" : "RJ", "email" : "ana@mail.com" }'::JSONB) ,
(' { "nome" : "Rui", "rua" : "Rua B", "nr" : 2 , "complemento" : "102", "bairro" : "Centro" , "cidade" : "Rio" , "estado" : "RJ" , "email" : "ana@mail.com" }'::JSONB) ,
(' { "nome" : "Nei" , "rua" : "Rua C" , "nr" : 3 , "complemento" : "103" , "bairro" : "Centro" , "cidade" : "Rio" , "estado" : "RJ" , "email" : "ana@mail.com" }'::JSONB)

SELECT * FROM cliente;

CREATE TABLE locacao(
    nrlocacao SERIAL PRIMARY KEY,
    data JSONB,
    cliente_idcliente INTEGER REFERENCES cliente
);

INSERT INTO locacao (data,cliente_idcliente) VALUES
('{"data_locacao":"2019-06-06","data_devolucao":"2019-06-08","preco":"20.00","categoria":"romance","titulo":"Titulo A"}'::JSONB,1), --cast
('{"data_locacao":"2019-06-07","data_devolucao":"2019-06-09","preco":"10.00","categoria":"humor","titulo":"Titulo B"}'::JSONB,1),
('{"data_locacao":"2019-06-08","data_devolucao":"2019-06-10","preco":"15.00","categoria":"aventura","titulo":"Titulo C"}'::JSONB,2),
('{"data_locacao":"2019-06-09","data_devolucao":"2019-06-11","preco":"17.00","categoria":"ficção","titulo":"Titulo D"}'::JSONB,2),
('{"data_locacao":"2019-06-10","data_devolucao":"2019-06-12","preco":"20.00","categoria":"humor","titulo":"Titulo E"}'::JSONB,2);
 

select data ->> 'titulo' from locacao
