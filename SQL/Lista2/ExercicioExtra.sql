create database db_cursoDaMinhaVida;

create table tb_categoria (
	id_cat bigint (5) auto_increment,
    tipo_livro varchar (20) not null,
    estoque boolean,
    primary key (id_cat) ) engine=InnoDB;

create table tb_produto (
	id_prod bigint (5) auto_increment,
    nome varchar (40) not null,
    editora varchar (30) not null,
    fabricacao date,
    tamanho_paginas bigint (4) not null,
    primary key (id_prod),
    id_cat bigint not null,
    foreign key (id_cat) references tb_categoria (id_cat) ) engine=InnoDB;
  
ALTER TABLE tb_produto ADD preco decimal (10,2);  
select * from tb_produto; 
 
insert into tb_categoria (tipo_livro, estoque) values ("Infantil", true);    
insert into tb_categoria (tipo_livro, estoque) values ("Quadrinhos", true); 
insert into tb_categoria (tipo_livro, estoque) values ("Adulto", true); 
insert into tb_categoria (tipo_livro, estoque) values ("Adolescente", true); 
insert into tb_categoria (tipo_livro, estoque) values ("Reliosos", true); 

insert into tb_produto (nome, editora, fabricacao, tamanho_paginas, id_cat) values ("Biblia Sagrada", "Abril", "20211010",1000,5);
insert into tb_produto (nome, editora, fabricacao, tamanho_paginas, id_cat) values ("Pequeno Urso", "OiOi", "20210202",100,1);
insert into tb_produto (nome, editora, fabricacao, tamanho_paginas, id_cat) values ("Homem Aranha", "Marvel", "19901009",200,2);
insert into tb_produto (nome, editora, fabricacao, tamanho_paginas, id_cat) values ("50 tons", "UiUi", "20210829",150,3);
insert into tb_produto (nome, editora, fabricacao, tamanho_paginas, id_cat) values ("Chico Xavier", "Abril", "20211010",300,5);
insert into tb_produto (nome, editora, fabricacao, tamanho_paginas, id_cat) values ("Se Conhecendo", "Norte", "20201010",45,4);
insert into tb_produto (nome, editora, fabricacao, tamanho_paginas, id_cat) values ("Pé de Feijão", "Criança", "20091010",400,1);
insert into tb_produto (nome, editora, fabricacao, tamanho_paginas, id_cat) values ("Harry Potter", "Cadabra", "20101022",2000,4);

update tb_produto set preco = 100.00 where id_cat =1;
update tb_produto set preco = 50.00 where id_cat =2;
update tb_produto set preco = 30.00 where id_cat =3;
update tb_produto set preco = 200.00 where id_cat =4;
update tb_produto set preco = 60.00 where id_cat =5;
update tb_produto set preco = 20.00 where id_cat =6;
update tb_produto set preco = 75.00 where id_cat =7;
update tb_produto set preco = 300.00 where id_cat =8;

select * from tb_produto where preco >50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%J%";

select * from tb_produto
inner join tb_categoria on tb_produto.id_cat = tb_categoria.id_cat
order by tb_produto.id_prod;

select tb_produto.nome, tb_produto.editora, tb_produto.preco, tb_categoria.tipo_livro from tb_produto 
inner join tb_categoria on tb_produto.id_cat = tb_categoria.id_cat
where tb_categoria.tipo_livro like "%Infantil%";
  

