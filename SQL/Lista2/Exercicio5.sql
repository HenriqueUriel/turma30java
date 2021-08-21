create database db_construindo_a_nossa_vida;

create table tb_categoria (
	id_cat bigint (5) auto_increment,
    data_fabricacao date,
    estoque boolean,
    primary key (id_cat) ) engine=InnoDB;

create table tb_produto (
    id_prod bigint (5) auto_increment,
    nome varchar (20) not null,
    preco decimal (10,2) not null,
    tipo varchar (20) not null,
    primary key (id_prod),
    id_cat bigint,
    foreign key (id_cat) references tb_categoria (id_cat) ) engine=InnoDB;
    
insert into tb_categoria (data_fabricacao,estoque) values ("20211012",true);
insert into tb_categoria (data_fabricacao,estoque) values ("20211012",true);
insert into tb_categoria (data_fabricacao,estoque) values ("20211012",true);
insert into tb_categoria (data_fabricacao,estoque) values ("20211012",true);
insert into tb_categoria (data_fabricacao,estoque) values ("20211012",true);

select * from tb_categoria;

insert into tb_produto (nome, preco, tipo, id_cat) values ("Martelo Demolição", 100.00,"construção",1); 
insert into tb_produto (nome, preco, tipo, id_cat) values ("Prego", 10.00,"construção",1); 
insert into tb_produto (nome, preco, tipo, id_cat) values ("Chave de fenda", 7.00,"construção",1); 
insert into tb_produto (nome, preco, tipo, id_cat) values ("Madeira", 20.00,"material",2); 
insert into tb_produto (nome, preco, tipo, id_cat) values ("Pedra", 39.00,"material",2); 
insert into tb_produto (nome, preco, tipo, id_cat) values ("Areia", 20.00,"material",2); 
insert into tb_produto (nome, preco, tipo, id_cat) values ("Marreta", 100.00,"construção",1); 
insert into tb_produto (nome, preco, tipo, id_cat) values ("Machado", 200.00,"construção",1); 

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%C%";

select *from tb_produto
inner join tb_categoria on tb_produto.id_cat = tb_categoria.id_cat;

select tb_produto.nome, tb_produto.preco, tb_categoria.data_fabricacao, tb_produto.tipo from tb_produto
inner join tb_categoria on tb_produto.id_cat = tb_categoria.id_cat
where tb_produto.tipo like "%construção%";

