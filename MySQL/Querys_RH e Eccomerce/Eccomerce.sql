create database Eccomerce;
use Eccomerce;

create table tb_produtos (
	idproduto bigint(6) auto_increment,
    nome varchar(20) not null,
    setor varchar(20),
    codigobarras bigint(5),
    valor double,
    primary key(idproduto)
);


Insert into tb_produtos (nome, setor, codigobarras, valor) values 
	("Iphone", "Fones","11111",6000.00),
    ("Motorola", "Fones","22222",2000.00),
	("LG", "Fones","33333",1500.00),
	("Máquina de Lavar", "Eletro","44444",800.00),
	("TV", "Eletro","55555",1500.00),
	("Aspirador de pó", "Eletro","66666",300.00),
	("Mesa", "Móveis","77777",450.00),
	("Cadeira", "Móveis","88888",150.00);

select * from tb_produtos;
select * from tb_produtos where valor>500;
select * from tb_produtos where valor<500;



