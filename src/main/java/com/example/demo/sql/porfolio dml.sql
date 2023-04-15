INSERT INTO `porfolio`.`personas` (`dni`, `nombre`, `apellido`, `contacto`, `mail`, `profesion`, `acercademi`) VALUES ('44884779', 'Lucas', 'Ramirez', '1131702086', 'LucasAlejandro4@outlook.com', 'Programador java full stack - Junior', 'Soy programador!');

INSERT INTO `porfolio`.`cursos` (`nombre`, `carga_horaria`, `centro`, `dni_persona`) VALUES ('Diseño grafico nivel I y II', '150', 'CFP N°406 | Isabel Pallamay', '44884779');
INSERT INTO `porfolio`.`cursos` (`nombre`, `carga_horaria`, `centro`, `dni_persona`) VALUES ('Tecnicas de Programación', '120', 'CFP N°8 | SMATA', '44884779');
INSERT INTO `porfolio`.`cursos` (`nombre`, `carga_horaria`, `centro`, `dni_persona`) VALUES ('Programación Orientada a objetos', '150', 'CFP N°8 | SMATA', '44884779');
INSERT INTO `porfolio`.`cursos` (`nombre`, `carga_horaria`, `centro`, `dni_persona`) VALUES ('Base de datos', '70', 'CFP N°8 | SMATA', '44884779');
INSERT INTO `porfolio`.`cursos` (`nombre`, `carga_horaria`, `centro`, `dni_persona`) VALUES ('Aplicación Web', '60', 'CFP N°8 | SMATA', '44884779');
INSERT INTO `porfolio`.`cursos` (`nombre`, `carga_horaria`, `centro`, `dni_persona`) VALUES ('Interface Grafica Web', '60', 'CFP N°8 | SMATA', '44884779');
INSERT INTO `porfolio`.`cursos` (`nombre`, `carga_horaria`, `centro`, `dni_persona`) VALUES ('Gestion de Base de datos', '60', 'CFP N°8 | SMATA', '44884779');
INSERT INTO `porfolio`.`cursos` (`nombre`, `carga_horaria`, `centro`, `dni_persona`) VALUES ('Tecnología Salesforce', '150', 'GLOBANT', '44884779');

INSERT INTO `porfolio`.`domicilio` (`pais`, `provincia`, `localidad`, `dni_persona`) VALUES ('Argentina', 'Buenos Aires', 'Florencio Varela', '44884779');

INSERT INTO `porfolio`.`educacion` (`titulo`, `ingreso`, `egreso`, `dni_persona`) VALUES ('Bachillerato en ciencias sociales orientado a entidades intermedias', 2016, 2019, '44884779');

INSERT INTO `porfolio`.`experiencia_laboral` (`trabajo`, `puesto`, `cargo`, `herramientas`, `referencia`, `dni_persona`) VALUES ('Ministerio de educacion', 'Docente', 'BDA', 'MYSQL', 'CFP', '44884779');

INSERT INTO `porfolio`.`habilidades` (`nombre`, `porcentaje`, `dni_persona`) VALUES ('Liderazgo', '75', '44884779');
INSERT INTO `porfolio`.`habilidades` (`nombre`, `porcentaje`, `dni_persona`) VALUES ('Empatia', '72', '44884779');
INSERT INTO `porfolio`.`habilidades` (`nombre`, `porcentaje`, `dni_persona`) VALUES ('Trabajo en equipo', '71', '44884779');

INSERT INTO `porfolio`.`proyectos` (`nombre`, `project_inicio`, `project_fin`, `descripcion`, `dni_persona`) VALUES ('App Task', '2022-11-15', '2023-03-30', 'Agenda de tareas y recordatorios', '44884779');

INSERT INTO `porfolio`.`usuarios` (`nombre`,`nombreUsuario`,`email`,`password`) VALUES ('Lucas','Ralu','Lucas4Alejandro4@gmail.com','admin');