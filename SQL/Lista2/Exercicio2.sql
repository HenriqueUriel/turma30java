create database db_pizzaria_legal;

create table tb_categoria (
 id_cat bigint (5) auto_increment,
 nome varchar (20) not null,
 tipo varchar (20) not null,
 tamanho varchar (20) not null,
 primary key (id_cat) ) engine=InnoDB;
 select * from tb_categoria;
 
 create table tb_pizza (
	id_pizza bigint (5) auto_increment,
    sabor varchar (20) not null,
    borda varchar (20) not null,
    azeitona char (1) not null check (azeitona in ('S','N')),
    extra_recheio varchar (20) not null,
    preco int (5) not null,
    primary key (id_pizza),
    id_cat bigint (5) not null,
    foreign key (id_cat) references tb_categoria(id_cat) ) engine=InnoDB;
select * from tb_pizza;

insert into tb_categoria (nome, tipo, tamanho) values ("Americana","Salgada","Grande");
insert into tb_categoria (nome, tipo, tamanho) values ("Portuguesa","Salgada","Grande");
insert into tb_categoria (nome, tipo, tamanho) values ("Chocolate","Doce","Pequena");
insert into tb_categoria (nome, tipo, tamanho) values ("Rucula","Salgada","Pequena");
insert into tb_categoria (nome, tipo, tamanho) values ("Dobro","Salgada","Grande");
 select * from tb_categoria;
 
insert into tb_pizza (sabor,borda,azeitona,extra_recheio,preco,id_cat) values ("Salgada","Catupiry",'S',"Não",30,1);
insert into tb_pizza (sabor,borda,azeitona,extra_recheio,preco,id_cat) values ("Salgada","Catupiry",'S',"Não",50,2);
insert into tb_pizza (sabor,borda,azeitona,extra_recheio,preco,id_cat) values ("Doce","Cheddar",'N',"Queijo",40,3);
insert into tb_pizza (sabor,borda,azeitona,extra_recheio,preco,id_cat) values ("Doce","Normal",'S',"Não",30,3);
insert into tb_pizza (sabor,borda,azeitona,extra_recheio,preco,id_cat) values ("Salgada","Catupiry",'S',"Não",60,5);
insert into tb_pizza (sabor,borda,azeitona,extra_recheio,preco,id_cat) values ("Salgada","Normal",'N',"Queijo",45,4);
insert into tb_pizza (sabor,borda,azeitona,extra_recheio,preco,id_cat) values ("Salgada","Cheddar",'N',"Não",30,2);
insert into tb_pizza (sabor,borda,azeitona,extra_recheio,preco,id_cat) values ("Salgada","Requeijão",'S',"Não",70,5);
 select * from tb_pizza;
 
select * from tb_pizza where preco > 45;
select * from tb_pizza where preco between 29 and 60;

select * from tb_pizza where borda like "%c%";

select * from tb_pizza
inner join tb_categoria on tb_pizza.id_cat = tb_categoria.id_cat;

-- pizza doce
select tb_categoria.nome, tb_categoria.tipo, tb_categoria.tamanho, tb_pizza.sabor, tb_pizza.preco from tb_pizza
inner join tb_categoria on tb_pizza.id_cat = tb_categoria.id_cat
where tb_categoria.tipo like "%doce%";