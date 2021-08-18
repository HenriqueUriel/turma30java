create database empresa_rh;
-- tabela:
create table tb_funcionarios (
	id_func bigint (5) auto_increment,
    nome varchar (50) not null,
    cargo varchar (20) not null,
    departamento varchar (20) not null,
    salario decimal (10,2),
    primary key (id_func)
);
-- populando:
insert into tb_funcionarios (nome, cargo, departamento, salario) value ("Caio", "Assistente", "rh", 1000.00);
insert into tb_funcionarios (nome, cargo, departamento, salario) value ("Simone", "Cordenadora", "rh", 5000.00);
insert into tb_funcionarios (nome, cargo, departamento, salario) value ("Paulo", "Assistente", "compras", 1500.00);
insert into tb_funcionarios (nome, cargo, departamento, salario) value ("Alex", "comprador", "compras", 2500.00);
insert into tb_funcionarios (nome, cargo, departamento, salario) value ("Bruna", "Assistente", "vendas", 1200.00);

-- funcionario com salario maior que 2000:
select * from tb_funcionarios where salario >2000;
-- funcionario com salario menor que 2000:
select * from tb_funcionarios where salario <2000;

-- atualizando:
update tb_funcionario set salario = 1500.00 where id_func = 1;
update tb_funcionario set salario = 2000.00 where id_func = 3;