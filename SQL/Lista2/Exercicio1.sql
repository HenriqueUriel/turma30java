create database db_generation_game_online;

create table tb_classe (
	id bigint (5) auto_increment,
	tipo varchar(20) not null,
    ataque bigint(6),
    defesa bigint(6),
    primary key (id)) engine=InnoDB;

create table tb_personagens (
	id_pers bigint(5) auto_increment,
    nome varchar (20) not null,
    idade int (2),
    genero char(1) not null check (genero in ('F','M')),
    mundo varchar (20) not null,
    hab_princ varchar (20) not null,
    id bigint (5) not null,
    foreign key (id) references tb_classe (id),
	primary key (id_pers) ) engine=InnoDB;

insert into tb_classe (tipo, ataque, defesa) value ("ARQUEIRO", 2000, 1000);
insert into tb_classe (tipo, ataque, defesa) value ("GUERREIRO", 4000, 2000);
insert into tb_classe (tipo, ataque, defesa) value ("MAGO", 2500, 500);
insert into tb_classe (tipo, ataque, defesa) value ("CURANDEIRO", 0, 5000);
insert into tb_classe (tipo, ataque, defesa) value ("CAÇADOR", 2000, 1000);

insert into tb_personagens (nome,idade,genero,mundo,hab_princ,id) value ("Rock",19,'M',"Ionia","Correr", 1);
insert into tb_personagens (nome,idade,genero,mundo,hab_princ,id) value ("Fif",27,'F',"Ionia","Voar", 3);
insert into tb_personagens (nome,idade,genero,mundo,hab_princ,id) value ("Lulu",38,'F',"Ionia","Pular", 5);
insert into tb_personagens (nome,idade,genero,mundo,hab_princ,id) value ("Bill",54,'M',"Ionia","Força", 2);
insert into tb_personagens (nome,idade,genero,mundo,hab_princ,id) value ("Brut",44,'M',"BRK","Força", 2);
insert into tb_personagens (nome,idade,genero,mundo,hab_princ,id) value ("Pat",65,'F',"BRK","Voar", 4);
insert into tb_personagens (nome,idade,genero,mundo,hab_princ,id) value ("Sant",57,'M',"BRK","Correr", 3);
insert into tb_personagens (nome,idade,genero,mundo,hab_princ,id) value ("Paul",45,'M',"BRK","Força", 4);

select * from tb_classe where ataque > 2000;
select * from tb_classe where defesa BETWEEN 1000 AND 2000;
select * from tb_personagens where nome like "%c%";

select * from tb_personagens
inner join tb_classe on tb_personagens.id = tb_classe.id;

select tb_classe.tipo, tb_personagens.nome from tb_personagens
inner join tb_classe on tb_personagens.id = tb_classe.id
where tb_classe.tipo like "%CAÇADOR%";

