-- drop database if exists porfolio; -- borramos la base de datos si es que existe
-- create database porfolio; -- creamos la base de datos
-- use porfolio; -- usamos la base de datos
show databases;

use b4eadurwdsysrxybiqud;

-- show databases; -- mostramos las bases de datos existenes
-- show tables; -- vemos las tablas contenidas en la base de datos

create table if not exists personas(
	dni int primary key,
    nombre varchar(25),
    apellido varchar(25),
    contacto varchar(20),
    mail varchar (40),
    profesion varchar(255),
    acercademi char(255)
);

create table if not exists experiencia_laboral(
	id int auto_increment primary key,
    trabajo varchar(25),
    puesto varchar(25),
    cargo varchar(20),
    herramientas varchar (40),
    referencia varchar (25),
    dni_persona int
);

create table if not exists domicilio(
	id int auto_increment primary key,
    pais varchar(25),
    provincia varchar(25),
    localidad varchar(20),
    dni_persona int
);

create table if not exists educacion(
	id int auto_increment primary key,
    titulo varchar(50),
    ingreso year,
    egreso year,
    dni_persona int
);

create table if not exists habilidades(
	id int auto_increment primary key,
    nombre varchar(25),
    porcentaje int(10),
	foto varchar (200),
    dni_persona int
);

create table if not exists cursos(
	id int auto_increment primary key,
    nombre char(150),
    carga_horaria int(3),
    centro char(100),
    dni_persona int
);

create table if not exists proyectos(
	id int auto_increment primary key,
    nombre varchar(25),
    project_inicio date,
    project_fin date,
    descripcion text,
    dni_persona int
);

create table if not exists usuarios(
    id int primary key auto_increment,
	nombre varchar(30),
    nombreUsuario varchar(30),
	email varchar(50),
    password varchar(15)
);

ALTER TABLE experiencia_laboral
ADD FOREIGN KEY (dni_persona) REFERENCES personas(dni);

ALTER TABLE domicilio
ADD FOREIGN KEY (dni_persona) REFERENCES personas(dni);

ALTER TABLE educacion
ADD FOREIGN KEY (dni_persona) REFERENCES personas(dni);

ALTER TABLE habilidades
ADD FOREIGN KEY (dni_persona) REFERENCES personas(dni);

ALTER TABLE cursos
ADD FOREIGN KEY (dni_persona) REFERENCES personas(dni);

ALTER TABLE proyectos
ADD FOREIGN KEY (dni_persona) REFERENCES personas(dni);