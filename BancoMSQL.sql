create schema Atividade4;
use Atividade4;

create table clientes(
id integer not null auto_increment primary key,
nome varchar(255),
cpf varchar(11),
email varchar(255),
);

insert into clientes(nome, email, cpf) values 
("Julia", "julia@gmail.com", "123");
("Loira", "loira@gmail.com", "234");
("Larissa", "larissa@gmail.com", "345");
("Igor", "igor@gmail.com", "456");
("Calsolari", "calsolari@gmail.com", "567");
("Pedro", "pedro@gmail.com", "678");
("Kaique", "kaique@gmail.com", "789");


create table produtos(
id integer not null auto_increment primary key,
nome varchar(255),
quantidade int,
preco integer,
descricao varchar(555),
atributo varchar(255),
fornecedor varchar(255)
);
insert into clientes(nome, descricao, atributo, fornecedor, quantidade, preco) values
("mouse", "Geek", "sem fio", "CCXS", 12, 48)
("teclado", "rgb", "com fio", "CCXS", 12, 97)
("monitor", "hd", "led", "FPg", 22, 128)
("notebook", "Pequeno portatil", "hd", "RRXS", 2, 2098)
("pendrive", "perifericos", "wireless", "RRXS", 672, 68)
("fonte", "Carregador notebook GP6", "de fio", "EletornicS", 451, 128)

create table compra(
id integer not null auto_increment primary key,
clientes_id int,
produtos_id int,

foreign key(produtos_id) references produtos(id),
foreign key(clientes_id) references clientes(id)
);

select * from clientes;


-- drop database Atividade4;