insert into cliente (id, nome) values (1, 'Daniel Dela Justina');
insert into cliente (id, nome) values (2, 'Aline R. Dos Santos');


insert into produto (id, nome, valor) values (1, 'Notebook', 2900.5);
insert into produto (id, nome, valor) values (2, 'Celular Vibe K5', 1500.3);
insert into produto (id, nome, valor) values (3, 'Tablet', 500);

insert into venda (id, cliente_id, frete, total, cadastro) values(1,1, 15, 2965.5, sysdate);

insert into item (id, venda_id, produto_id, quantidade) values(1, 1, 1, 1);