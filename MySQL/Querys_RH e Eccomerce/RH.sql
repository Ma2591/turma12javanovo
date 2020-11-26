create database RHempresa1;
use RHempresa1;

CREATE TABLE tb_func (
	id1 int not null auto_increment primary key,
    nome1 varchar (30) NOT NULL,
	nascimento1 date,
	sexo1 enum('M', 'F', 'Outro'),
	salario1 decimal(7,2),
    nacionalidade1 varchar (20) DEFAULT 'Brasil'
    );
    
  Insert into tb_func (id1,nome1, nascimento1, sexo1, salario1, nacionalidade1) values
(DEFAULT,'Joaquim', NULL,'M','10000',DEFAULT),
(DEFAULT,'Luiza', NULL,'F','70000',DEFAULT),
(DEFAULT,'Fatima', NULL,'F','90000',DEFAULT),
(DEFAULT,'Bruno', NULL,'M','2000',DEFAULT),
(DEFAULT,'Iuri', NULL,'M','1000',DEFAULT);

select * from tb_func where salario1>=2000; 

update tb_func Set salario1 = 1500.00 where id1 = '4';
select * from tb_func;