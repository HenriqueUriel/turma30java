create database db_farmacia_do_bem;

create table tb_categoria (
	id_cat bigint (5) auto_increment,
    nome varchar (30) not null,
    ativo boolean not null,
    primary key (id_cat)) engine=InnoDB;
    
create table tb_produto (
	id_prod bigint (5) auto_increment,
    nome varchar (20) not null,
    preco decimal (10,2),
    estoque int (5) not null,
    id_cat bigint not null, -- tabela 1 (tb_categoria)
    primary key (id_prod),
    foreign key (id_cat) references tb_categoria (id_cat) ) engine=InnoDB;
    
insert into tb_categoria (nome, ativo) values ("Remedios", true);
insert into tb_categoria (nome, ativo) values ("Bebidas", true);
insert into tb_categoria (nome, ativo) values ("Kits", true);
insert into tb_categoria (nome, ativo) values ("Cosmeticos", true);
insert into tb_categoria (nome, ativo) values ("Perfumaria", true);

insert into tb_produto (nome, preco, estoque, id_cat) values ("Diana", 100.00, 10, 1);
insert into tb_produto (nome, preco, estoque, id_cat) values ("Shampoo", 5.00, 3, 4);
insert into tb_produto (nome, preco, estoque, id_cat) values ("Agua de Cheiro", 100.00, 10, 5);
insert into tb_produto (nome, preco, estoque, id_cat) values ("Dipirona", 20.00, 10, 1);
insert into tb_produto (nome, preco, estoque, id_cat) values ("Agua", 2.00, 20, 2);
insert into tb_produto (nome, preco, estoque, id_cat) values ("Kit Beleza", 200.00, 1, 3);
insert into tb_produto (nome, preco, estoque, id_cat) values ("Dorflex", 7.00, 10, 1);
insert into tb_produto (nome, preco, estoque, id_cat) values ("Aquarine", 259.00, 2, 5);
 
select * from tb_produto where preco >50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%B%";

select * from tb_produto
inner join tb_categoria on tb_produto.id_cat = tb_categoria.id_cat;

select tb_categoria.nome, tb_categoria.ativo, tb_produto.nome, tb_produto.preco from tb_produto
inner join tb_categoria on tb_produto.id_cat = tb_categoria.id_cat
where tb_categoria.nome like "%Remedios%";
    

