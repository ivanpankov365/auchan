# auchanBackendApp
Реализован базовый функционал для работы прототипа приложения для совершения совместных покупок.
Данное приложение позволяет для пользователю:
Добавлять друзей
Сохранять свои покупки
Отправлять оповещение о намерении идти в Ашан, а также о том, что пользователь уже находится в магазине.

Данные хранятся в базе PostgreSQL в трёх таблицах

CREATE TABLE actionflag(
   id serial,
   name varchar(80),
   flag boolean
);

CREATE TABLE auchanfriends(
   id serial,
   name varchar(80),
   phone varchar(80)
);

CREATE TABLE products(
   id serial,
   name varchar(80),
   position varchar(80)
);