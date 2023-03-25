drop database if exists porfolio; -- borramos la base de datos si es que existe
create database porfolio; -- creamos la base de datos
use porfolio; -- usamos la base de datos

show databases; -- mostramos las bases de datos existenes
show tables; -- vemos las tablas contenidas en la base de datos

create table personas(
	dni int primary key,
    nombre varchar(25),
    apellido varchar(25),
    contacto varchar(20),
    mail varchar (40),
    profesion varchar(255),
    acercademi char(255)
);

create table experiencia_laboral(
	id int auto_increment primary key,
    trabajo varchar(25),
    puesto varchar(25),
    cargo varchar(20),
    herramientas varchar (40),
    referencia varchar (25),
    dni_persona int
);

create table domicilio(
	id int auto_increment primary key,
    pais varchar(25),
    provincia varchar(25),
    localidad varchar(20),
    dni_persona int
);

create table educacion(
	id int auto_increment primary key,
    titulo varchar(50),
    ingreso year,
    egreso year,
    dni_persona int
);

create table habilidades(
	id int auto_increment primary key,
    nombre varchar(25),
    porcentaje int(10),
	foto varchar (200),
    dni_persona int
);

create table cursos(
	id int auto_increment primary key,
    nombre char(150),
    carga_horaria int(3),
    centro char(100),
    dni_persona int
);

create table proyectos(
	id int auto_increment primary key,
    nombre varchar(25),
    project_inicio date,
    project_fin date,
    descripcion text,
    dni_persona int
);

create table usuarios(
	dni int primary key,
    usuario varchar(30),
    email varchar(50),
    paswoord varchar(15)
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

ALTER TABLE usuarios
ADD FOREIGN KEY (dni) REFERENCES personas(dni);