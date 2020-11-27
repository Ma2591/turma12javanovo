create database db_pizzaria_mariana;

use db_pizzaria_mariana;


create table tb_categoria(
id_categoria bigint(5) auto_increment,
categoria varchar (20) not null,
primary  key (id_categoria)
);


insert into tb_categoria(categoria) values 
("vegana"),
("frutos do mar"),
("salgada"),
("doce"),
("Peculiares");



create table tb_pizza(
idpizza bigint(5)auto_increment primary key,
sabor varchar(40) not null,
tamanho enum('grande', 'broto') not null,
preco double(4,2) not null,
borda enum('sim', 'nao'),
id_categoria bigint(5) not null,

constraint fk_categoria 
foreign key (id_categoria) references tb_categoria(id_categoria));


insert into tb_pizza(id_categoria, sabor,tamanho,preco,borda) values 
(1,"Brócolis", 'grande', 49.00,'sim'),
(3,"Frango", 'broto', 15.00,'sim'),
(3,"Mussarela", 'grande', 30.00,'nao'),
(5,"Aliche", 'grande', 65.00,'sim'),
(3,"Peperoni", 'grande', 50.00,'nao'),
(3,"Carne desfiada", 'broto', 45.00,'sim'),
(4,"Chocolate branco", 'broto', 20.00,'nao'),
(4,"Chocolate ao leite", 'grande', 48.00,'sim');

select * from tb_pizza
inner join tb_categoria
where tb_categoria.id_categoria = tb_pizza.id_categoria;

truncate tb_pizza;

select * from tb_pizza where  preco > 45.00;
select * from tb_pizza where  id_categoria  = 3;
