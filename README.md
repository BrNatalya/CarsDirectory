The web application was developed using Java EE tools for working with a database in the PostgreSQL database management system.

Implemented displaying the list of objects, adding, deleting and changing objects.

Java EE, Javaserver Faces framework, GlassFish4 application server and NetBeans 12 development environment were used to develop the server part of the program. Deployment is supposed to be on Linux Fedora OS.

To create a database, enter "createdb carsApp -U postgres -E utf8" in the terminal

SQL queries to populate the database with data:

CREATE TABLE car_models (id_model serial NOT NULL PRIMARY KEY, name_model VARCHAR(30) NOT NULL);

INSERT INTO car_models (name_model) VALUES ('Audi'), ('BMW'), ('Ford'), ('Jeep'), ('Reno'), ('Toyota'), ('Peugeot'), ('Mitsubishi');

CREATE TABLE countries (id_country serial NOT NULL PRIMARY KEY, name_country VARCHAR(30) NOT NULL);

INSERT INTO countries (name_country) VALUES ('Germany'), ('Japan'), ('Korea'), ('USA'), ('Russia'), ('France'), ('China');

CREATE TABLE colors (id_color serial NOT NULL PRIMARY KEY, name_color VARCHAR(30) NOT NULL);

INSERT INTO colors (name_color) VALUES ('Yellow'), ('Black'), ('White'), ('Silver'), ('Gold'), ('Green'), ('Gray');

CREATE TABLE cars (id_cars serial NOT NULL PRIMARY KEY, model_id INT, color_id INT, country_id INT, registr_number VARCHAR(8), year_manufact VARCHAR(4), FOREIGN KEY(model_id) REFERENCES car_models(id_model), FOREIGN KEY(color_id)  REFERENCES colors(id_color), FOREIGN KEY(country_id) REFERENCES countries(id_country));

INSERT INTO cars (model_id, color_id, country_id, registr_number, year_manufact) VALUES (1, 2, 3, 'АА563О96', '2020'), (2, 3, 5, 'АВ236Д96', '2009'), (5, 4, 1, 'ИР234Р66', '1998'), (4, 1, 2, 'ПИ531Л96', '2010'), (1, 2, 3, 'АУ503Л96', '2000'), (2, 3, 5, 'АВ246Ф96', '2019'), (5, 4, 1, 'ПЕ244Ш66', '1998'), (4, 1, 2, 'КИ489Д96', '2019'), (3, 5, 4, 'ЛП378Д96', '2020');
