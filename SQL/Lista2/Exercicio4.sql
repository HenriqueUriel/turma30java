create database db_cidade_das_frutas;

create table tb_categoria (
	id_cat bigint (5) auto_increment,
    frutas varchar (20) not null,
    estoque int (5) not null,
    primary key (id_cat) ) engine=InnoDB;
    
create table tb_produto (
	id_prod bigint (5) auto_increment,
    nome varchar (20) not null,
    tipo varchar (20) not null,
    preco decimal (10,2) not null,
    bandeija char(1) not null check (bandeija in ('S','N')),
    id_cat bigint not null,
    primary key (id_prod),
    foreign key (id_cat) references tb_categoria (id_cat) ) engine=InnoDB;
    
insert into tb_categoria (frutas, estoque) values ("Doce",10);
insert into tb_categoria (frutas, estoque) values ("Azeda",10);
insert into tb_categoria (frutas, estoque) values ("Citrica",10);
insert into tb_categoria (frutas, estoque) values ("Grande",10);
insert into tb_categoria (frutas, estoque) values ("Pequena",10);

insert into tb_produto (nome, tipo, preco, bandeija, id_cat) values ("Banana Nanica","Fruta",10.00,'N',1);
insert into tb_produto (nome, tipo, preco, bandeija, id_cat) values ("Maça","Fruta",5.00,'S',1);
insert into tb_produto (nome, tipo, preco, bandeija, id_cat) values ("Melancia","Fruta",10.00,'N',4);
insert into tb_produto (nome, tipo, preco, bandeija, id_cat) values ("Laranja","Fruta",20.00,'S',3);
insert into tb_produto (nome, tipo, preco, bandeija, id_cat) values ("Limão","Fruta",2.00,'N',2);
insert into tb_produto (nome, tipo, preco, bandeija, id_cat) values ("Abobora","Legumes", 50.00,'S',4);
insert into tb_produto (nome, tipo, preco, bandeija, id_cat) values ("Melão","Fruta",6.00,'N',5);
insert into tb_produto (nome, tipo, preco, bandeija, id_cat) values ("Banana Prata","Fruta",17.00,'S',1);

select * from tb_produto where preco >= 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%C%";

select * from tb_produto
inner join tb_categoria on tb_produto.id_cat = tb_categoria.id_cat;

select tb_produto.nome, tb_produto.preco, tb_categoria.estoque from tb_produto
inner join tb_categoria on tb_produto.id_cat = tb_categoria.id_cat
where tb_produto.tipo like "%LEGUMES%";

    