CREATE TABLE `tb_usuario` (
	`id_usuario` INT(3) NOT NULL AUTO_INCREMENT,
	`tipo_usuario` varchar(255) NOT NULL,
	`nome_comp` varchar(60) NOT NULL,
	`login` varchar(30) NOT NULL,
	`senha` INT(10) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

CREATE TABLE `tb_tema` (
	`id_tema` INT(3) NOT NULL AUTO_INCREMENT,
	`fome_zero` BOOLEAN NOT NULL,
	`seguranca_alim` BOOLEAN NOT NULL,
	`agric_sustentavel` BOOLEAN NOT NULL,
	PRIMARY KEY (`id_tema`)
);

CREATE TABLE `tb_postagem` (
	`id_post` INT(3) NOT NULL AUTO_INCREMENT,
	`imagem` BOOLEAN NOT NULL,
	`titulo` varchar(40) NOT NULL,
	`texto` varchar(600) NOT NULL,
	`data_hora` DATETIME(255) NOT NULL,
	`id_usuario` INT(3) NOT NULL,
	`id_tema` INT(3) NOT NULL,
	PRIMARY KEY (`id_post`)
);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuario`(`id_usuario`);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`id_tema`) REFERENCES `tb_tema`(`id_tema`);




