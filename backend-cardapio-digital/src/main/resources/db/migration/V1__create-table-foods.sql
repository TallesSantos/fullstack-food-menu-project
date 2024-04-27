CREATE TABLE foods(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    price INTEGER NOT NULL,
    image TEXT
);

insert into foods(title, price, image) values('cachorro-quente',12, 'https://www.designi.com.br/images/preview/10078156.jpg');
insert into foods(title, price, image) values('pizza',39, 'https://t3.ftcdn.net/jpg/06/11/01/26/240_F_611012694_YztSwcyDjHflPhlil3LfeSDXMtew2Scy.jpg');