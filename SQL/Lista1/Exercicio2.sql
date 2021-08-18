-- criando banco de dados
create database db_ecommerce;
-- atributos
use db_ecommerce;
create table tb_produtos(
	id bigint(5) auto_increment,
    nome varchar (50) not null,
    marca varchar (50) not null,
    valor decimal (10,2),
    estoque boolean,
    primary key (id)
 ); 
-- populando
insert into tb_produtos (nome,marca,valor,estoque) value ("Camisa","adidas",50.00,true);  
insert into tb_produtos (nome,marca,valor,estoque) value ("Calça","adidas",80.00,true);  
insert into tb_produtos (nome,marca,valor,estoque) value ("Blusa","adidas",100.00,true);  
insert into tb_produtos (nome,marca,valor,estoque) value ("Moleton","adidas",200.00,true);  
insert into tb_produtos (nome,marca,valor,estoque) value ("Regata","adidas",45.00,true);  
insert into tb_produtos (nome,marca,valor,estoque) value ("Shorts","adidas",60.00,true);  
insert into tb_produtos (nome,marca,valor,estoque) value ("Tennis","adidas",300.00,true);  
insert into tb_produtos (nome,marca,valor,estoque) value ("Meia","adidas",20.00,true); 
-- select maior valor maior que 500
select * from tb_produtos where valor > 500;
-- select menor que 500
select * from tb_produtos where valor < 500;
-- update de um produto
update tb_produtos set valor = 500.00 where id = 7;
 