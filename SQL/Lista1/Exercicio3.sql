-- criando banco de dados
create database db_escola;
-- atributos
use db_escola;
create table tb_dadosalunos (
	id_aluno bigint (5) auto_increment,
    nome varchar (30) not null,
    idade int(2) not null,
    data_nasc date null,
    ddd int(2) not null,
    telefone varchar (9) not null,
    nota int not null,
    primary key (id_aluno)
);
-- populando
insert into tb_dadosalunos (nome,idade,data_nasc,ddd,telefone) value ("Bia",10,2011-10-10,11,37854258,7);
insert into tb_dadosalunos (nome,idade,data_nasc,ddd,telefone) value ("Ale",10,2011-10-10,11,37854444,5);
insert into tb_dadosalunos (nome,idade,data_nasc,ddd,telefone) value ("Bruna",10,2011-10-10,11,37856666,6);
insert into tb_dadosalunos (nome,idade,data_nasc,ddd,telefone) value ("Roberta",10,2011-10-10,11,37857777,8);
insert into tb_dadosalunos (nome,idade,data_nasc,ddd,telefone) value ("Carlos",10,2011-10-10,11,37858888,8);
insert into tb_dadosalunos (nome,idade,data_nasc,ddd,telefone) value ("Paulo",10,2011-10-10,11,37854999,3);
insert into tb_dadosalunos (nome,idade,data_nasc,ddd,telefone) value ("Bruno",10,2011-10-10,11,37854000,4);
insert into tb_dadosalunos (nome,idade,data_nasc,ddd,telefone) value ("Rico",10,2011-10-10,11,37854333,5);
-- select nota maior que 7
select * from tb_dadosalunos where nota >7;
-- select nota menor que 7
select * from tb_dadosalunos where nota <7;
-- update 
update tb_dadosalunos set nota = 5 where id_aluno = 3; 
update tb_dadosalunos set nota = 9 where id_aluno = 6; 
update tb_dadosalunos set nota = 10 where id_aluno = 4; 
