create schema Atividade4;
use Atividade4;

create table clientes(
id integer not null auto_increment primary key,
nome varchar(255),
cpf varchar(11),
email varchar(255),
);

insert into clientes(nome, email, cpf) values 
("JUlia paiva", "julia@gmail.com", "23823923828");


create table produtos(
id integer not null auto_increment primary key,
nome varchar(255),
quantidade int,
preco integer,
descricao varchar(555),
atributo varchar(255)
);

create table compra(
id integer not null auto_increment primary key,
clientes_id int,
produtos_id int,

foreign key(produtos_id) references produtos(id),
foreign key(clientes_id) references clientes(id)
);

select * from clientes;


-- drop database Atividade4;