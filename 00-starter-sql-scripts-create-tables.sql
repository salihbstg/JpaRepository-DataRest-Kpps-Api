create table mathematics(
id serial PRIMARY KEY,
question varchar(50),
options1 varchar(10),
options2 varchar(10),
options3 varchar(10),
options4 varchar(10),
answer varchar(10)
);

create table turkish(
id serial PRIMARY KEY,
question varchar(150),
options1 varchar(50),
options2 varchar(50),
options3 varchar(50),
options4 varchar(50),
answer varchar(50)
);

create table geography(
id serial PRIMARY KEY,
question varchar(150),
options1 varchar(50),
options2 varchar(50),
options3 varchar(50),
options4 varchar(50),
answer varchar(50)
);

create table general_knowledge(
id serial PRIMARY KEY,
question varchar(150),
options1 varchar(50),
options2 varchar(50),
options3 varchar(50),
options4 varchar(50),
answer varchar(50)
);

create table history(
id serial PRIMARY KEY,
question varchar(150),
options1 varchar(50),
options2 varchar(50),
options3 varchar(50),
options4 varchar(50),
answer varchar(50)
);