CREATE TABLE log (
    filial varchar,
    data timestamp ,
    datahora timeuuid ,
    login varchar ,
    PRIMARY KEY ( ( filial , data ), datahora ) 
) ;

INSERT INTO log ( filial , data , datahora , login ) VALUES ( 'filial_1 ', toTimestamp(toDate(now())) , now() , 'ana' ) ;
INSERT INTO log ( filial , data , datahora, login ) VALUES ( 'filial_1' , toTimestamp(toDate(now())) , now() , 'nei' ) ;
INSERT INTO log ( filial , data , datahora, login ) VALUES ( 'filial_1' , toTimestamp(toDate(now())) , now() , 'lia' ) ;
INSERT INTO log ( filial , data , datahora, login ) VALUES ( 'filial_2' , toTimestamp(toDate(now())) , now() , 'luis' ) ;
INSERT INTO log ( filial , data , datahora, login ) VALUES ( 'filial_2' , toTimestamp(toDate(now())) , now() , 'ana' ) ;
INSERT INTO log ( filial , data , datahora, login ) VALUES ( 'filial_2 ', toTimestamp(toDate(now())) , now() , 'rui' ) ;

--  vai dar erro
DELETE FROM log
WHERE datahora = '7bdad891-28df-11eb-84c0-793c4ada966f'
IN datahora = '7bd6e0f1-28df-11eb-84c0-793c4ada966f' ; -- OR datahora = '7bd6e0f1-28df-11eb-84c0-793c4ada966f' ;

-- ainda vai dar erro
DELETE FROM log WHERE login IN ( 'rui' , 'nei' ) ;

-- agora não vai dar erro
DELETE FROM log WHERE filial = 'filial_1' AND data = '2020-11-17 00:00:00+0000' ;
