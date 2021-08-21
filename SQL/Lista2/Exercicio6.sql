create database db_cursoDaMinhaVida1;

create table tb_categoria (
	id_cat bigint (5) auto_increment,
    tipo_curso varchar (20) not null,
    horas int (20) not null,
    primary key (id_cat) ) engine=InnoDB;
    
create table tb_produto (
	id_prod bigint (5) auto_increment,
    nome varchar (40) not null,
    categoria varchar (30) not null,
    preco decimal (10,2) not null,
    id_cat bigint not null,
    primary key (id_prod),
    foreign key (id_cat) references tb_categoria (id_cat)) engine=InnoDB;
    
insert into tb_categoria (tipo_curso, horas) values ("Pago", 50);
insert into tb_categoria (tipo_curso, horas) values ("Gratis", 35);

insert into tb_produto (nome, categoria, preco, id_cat) values ("Java Básico", "Programação",50.00, 1);
insert into tb_produto (nome, categoria, preco, id_cat) values ("Word", "Informatica",0.00, 2);
insert into tb_produto (nome, categoria, preco, id_cat) values ("Java Avançado", "Programação",100.00, 1);
insert into tb_produto (nome, categoria, preco, id_cat) values ("Excel", "Informatica",0.00, 2);
insert into tb_produto (nome, categoria, preco, id_cat) values ("CorelDraw", "Desenho Tecnico",50.00, 1);
insert into tb_produto (nome, categoria, preco, id_cat) values ("AutoCad", "Desenho Tecnico",60.00, 1);
insert into tb_produto (nome, categoria, preco, id_cat) values ("Logica de Programação", "Programação",0.00, 2);
insert into tb_produto (nome, categoria, preco, id_cat) values ("MySQL", "Programação",0.00, 2);

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%J%";

select * from tb_produto
inner join tb_categoria on tb_produto.id_cat = tb_categoria.id_cat;

select tb_produto.nome, tb_produto.categoria, tb_categoria.tipo_curso, tb_categoria.horas from tb_produto
inner join tb_categoria on tb_produto.id_cat = tb_categoria.id_cat
where tb_categoria.tipo_curso like "%Gratis%"
order by tb_produto.nome;
