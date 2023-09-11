-- Inserts para Profesores
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1706172648', 'Juan', 'Pérez', 'juan48@mousai.edu.ec', 'Profesor');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1704997012', 'María', 'González', 'mariag12@mousai.edu.ec', 'Profesor');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1714818299', 'Carlos', 'López', 'carlosl99@mousai.edu.ec', 'Profesor');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1713627071', 'Ana', 'Martínez', 'anam71@mousai.edu.ec', 'Profesor');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1709262933', 'Luis', 'Hernández', 'luish33@mousai.edu.ec', 'Profesor');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1708706302', 'Laura', 'Rodríguez', 'laurar02@mousai.edu.ec', 'Profesor');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1711453470', 'Pedro', 'Sánchez', 'pedros70@mousai.edu.ec', 'Profesor');

-- Updates para Profesores
UPDATE Profesores SET NivelAcademico = 'Maestría en Educación Musical', Direccion = 'Av. La Gasca E14-45 y Av. de Los Granados', Telefono = '0992345678', Especializacion = 'Piano', SueldoBase = 2200.00 WHERE Cedula_Profesor = '1706172648';
UPDATE Profesores SET NivelAcademico = 'Maestría en Educación Musical', Direccion = 'Av. La Tola E7-23 y Calle Guayaquil', Telefono = '0993456789', Especializacion = 'Guitarra', SueldoBase = 1800.00 WHERE Cedula_Profesor = '1704997012';
UPDATE Profesores SET NivelAcademico = 'Doctorado en Música', Direccion = 'Calle San Roque E9-45 y Av. Amazonas', Telefono = '0994567890', Especializacion = 'Violín', SueldoBase = 2000.00 WHERE Cedula_Profesor = '1714818299';
UPDATE Profesores SET NivelAcademico = 'Licenciatura en Pedagogía Musical', Direccion = 'Av. 6 de Diciembre N26-77 y Calle Juan León Mera', Telefono = '0995678901', Especializacion = 'Flauta', SueldoBase = 1700.00 WHERE Cedula_Profesor = '1713627071';
UPDATE Profesores SET NivelAcademico = 'Maestría en Música Orquestal', Direccion = 'Calle Julio Zaldumbide E9-45 y Av. 12 de Octubre', Telefono = '0996789012', Especializacion = 'Violonchelo', SueldoBase = 1900.00 WHERE Cedula_Profesor = '1709262933';
UPDATE Profesores SET NivelAcademico = 'Doctorado en Educación Artística', Direccion = 'Av. 12 de Octubre N26-77 y Calle Veintimilla', Telefono = '0997890123', Especializacion = 'Canto', SueldoBase = 2100.00 WHERE Cedula_Profesor = '1708706302';
UPDATE Profesores SET NivelAcademico = 'Licenciatura en Composición Musical', Direccion = 'Calle La Pradera E14-45 y Av. de Los Shyris', Telefono = '0998901234', Especializacion = 'Trompeta', SueldoBase = 1600.00 WHERE Cedula_Profesor = '1711453470';

-- Inserts para Estudiantes
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1711402980', 'Miguel', 'Torres', 'miguelt80@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1715664643', 'Diana', 'Ramírez', 'dianar43@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1709520231', 'Andrés', 'Fernández', 'andresf31@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1710481225', 'Isabel', 'Pérez', 'isabelp25@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1712452729', 'Santiago', 'García', 'santiagog29@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1711113975', 'Valentina', 'López', 'valentinal75@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1707664841', 'Mateo', 'Hernández', 'mateoh41@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1710743715', 'Camila', 'Martínez', 'camilam15@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1709338089', 'Sebastián', 'Sánchez', 'sebastians89@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1707649438', 'Valeria', 'González', 'valeriag38@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1705918918', 'Daniel', 'Fernández', 'danielf18@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1704568433', 'Lucía', 'Ramírez', 'luciar33@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1707717375', 'Benjamín', 'Torres', 'benjamint75@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1708473747', 'Emma', 'Hernández', 'emmah47@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1708970205', 'Matías', 'García', 'matiasg05@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1708994288', 'Juana', 'Martínez', 'juanam88@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1700591702', 'Nicolás', 'Sánchez', 'nicolass02@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1707008437', 'Catalina', 'López', 'catalinal37@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1707634729', 'Felipe', 'Pérez', 'felipep29@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1705599429', 'Isabella', 'González', 'isabellag29@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1710732288', 'Juan', 'García', 'juan.perez@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1710532670', 'Ana', 'López', 'ana.sanchez@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1703898567', 'Luis', 'Martínez', 'luis.rodriguez@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1717638694', 'María', 'Fernández', 'maria.gonzalez@gmail.com', 'Estudiante');
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) VALUES ('1713277158', 'Carlos', 'Pérez', 'carlos.lopez@gmail.com', 'Estudiante');

-- Updates para Estudiantes
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2002-01-01', NombresRepresentante = 'Alejandro', ApellidosRepresentante = 'Mendoza', TelefonoRepresentante = '0912345678' WHERE Cedula_Estudiante = '1707717375';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2003-02-15', NombresRepresentante = 'Carlos', ApellidosRepresentante = 'López', TelefonoRepresentante = '0923456789' WHERE Cedula_Estudiante = '1710743715';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2004-03-30', NombresRepresentante = 'Elena', ApellidosRepresentante = 'García', TelefonoRepresentante = '0934567890' WHERE Cedula_Estudiante = '1709338089';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2005-04-12', NombresRepresentante = 'Fernando', ApellidosRepresentante = 'Hernández', TelefonoRepresentante = '0945678901' WHERE Cedula_Estudiante = '1712452729';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2006-05-25', NombresRepresentante = 'Gabriela', ApellidosRepresentante = 'Pérez', TelefonoRepresentante = '0956789012' WHERE Cedula_Estudiante = '1711113975';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2007-06-07', NombresRepresentante = 'Hugo', ApellidosRepresentante = 'Gómez', TelefonoRepresentante = '0967890123' WHERE Cedula_Estudiante = '1709520231';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2008-07-20', NombresRepresentante = 'Iván', ApellidosRepresentante = 'Torres', TelefonoRepresentante = '0978901234' WHERE Cedula_Estudiante = '1707664841';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2009-08-03', NombresRepresentante = 'Julia', ApellidosRepresentante = 'Ramírez', TelefonoRepresentante = '0989012345' WHERE Cedula_Estudiante = '1715664643';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2010-09-16', NombresRepresentante = 'Luis', ApellidosRepresentante = 'Sánchez', TelefonoRepresentante = '0990123456' WHERE Cedula_Estudiante = '1711402980';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2011-10-29', NombresRepresentante = 'María', ApellidosRepresentante = 'González', TelefonoRepresentante = '0911234567' WHERE Cedula_Estudiante = '1708473747';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2012-11-11', NombresRepresentante = 'Natalia', ApellidosRepresentante = 'Jiménez', TelefonoRepresentante = '0922345678' WHERE Cedula_Estudiante = '1708970205';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2013-12-24', NombresRepresentante = 'Óscar', ApellidosRepresentante = 'Silva', TelefonoRepresentante = '0933456789' WHERE Cedula_Estudiante = '1708994288';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2003-01-05', NombresRepresentante = 'Patricia', ApellidosRepresentante = 'López', TelefonoRepresentante = '0944567890' WHERE Cedula_Estudiante = '1700591702';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2004-02-18', NombresRepresentante = 'Quito', ApellidosRepresentante = 'Martínez', TelefonoRepresentante = '0955678901' WHERE Cedula_Estudiante = '1707008437';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2005-03-03', NombresRepresentante = 'Rosa', ApellidosRepresentante = 'Fernández', TelefonoRepresentante = '0966789012' WHERE Cedula_Estudiante = '1707634729';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2006-04-16', NombresRepresentante = 'Santiago', ApellidosRepresentante = 'Gutiérrez', TelefonoRepresentante = '0977890123' WHERE Cedula_Estudiante = '1705599429';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2007-05-29', NombresRepresentante = 'Tatiana', ApellidosRepresentante = 'Rodríguez', TelefonoRepresentante = '0988901234' WHERE Cedula_Estudiante = '1707649438';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2008-06-11', NombresRepresentante = 'Ulises', ApellidosRepresentante = 'Paredes', TelefonoRepresentante = '0999012345' WHERE Cedula_Estudiante = '1705918918';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2009-07-24', NombresRepresentante = 'Valeria', ApellidosRepresentante = 'Vargas', TelefonoRepresentante = '0910123456' WHERE Cedula_Estudiante = '1704568433';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2010-08-06', NombresRepresentante = 'Xavier', ApellidosRepresentante = 'Larrea', TelefonoRepresentante = '0921234567' WHERE Cedula_Estudiante = '1707717375';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2000-10-07', NombresRepresentante = 'Ana', ApellidosRepresentante = 'Gómez', TelefonoRepresentante = '0991234567' WHERE Cedula_estudiante = '1710481225';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2000-01-01', NombresRepresentante = 'José', ApellidosRepresentante = 'Pérez', TelefonoRepresentante = '0912345678' WHERE Cedula_Estudiante = '1710732288';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2001-02-02', NombresRepresentante = 'Laura', ApellidosRepresentante = 'Sánchez', TelefonoRepresentante = '0923456789' WHERE Cedula_Estudiante = '1710532670';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2002-03-03', NombresRepresentante = 'Andrés', ApellidosRepresentante = 'Rodríguez', TelefonoRepresentante = '0934567890' WHERE Cedula_Estudiante = '1703898567';
UPDATE Estudiantes SET Sexo = 'F', FechaNacimiento = '2003-04-04', NombresRepresentante = 'Isabel', ApellidosRepresentante = 'González', TelefonoRepresentante = '0945678901' WHERE Cedula_Estudiante = '1717638694';
UPDATE Estudiantes SET Sexo = 'M', FechaNacimiento = '2004-05-05', NombresRepresentante = 'Ricardo', ApellidosRepresentante = 'López', TelefonoRepresentante = '0956789012' WHERE Cedula_Estudiante = '1713277158';

-- Inserts para Instrumentos
INSERT INTO Instrumentos (Codigo, Nombre, Fabricante, Categoria, Condicion) VALUES ('INSTR-0001', 'Piano', 'Yamaha', 'Teclado', 'Este piano está en excelente estado y suena maravillosamente.');
INSERT INTO Instrumentos (Codigo, Nombre, Fabricante, Categoria, Condicion) VALUES ('INSTR-0002', 'Guitarra', 'Fender', 'Cuerdas', 'Esta guitarra tiene un buen sonido y está en perfecto estado.');
INSERT INTO Instrumentos (Codigo, Nombre, Fabricante, Categoria, Condicion) VALUES ('INSTR-0003', 'Violín', 'Stradivarius', 'Cuerdas', 'Este violín es un instrumento clásico en condiciones regulares.');
INSERT INTO Instrumentos (Codigo, Nombre, Fabricante, Categoria, Condicion) VALUES ('INSTR-0004', 'Flauta', 'Yamaha', 'Viento', 'Esta flauta está en muy buen estado y produce un hermoso sonido.');
INSERT INTO Instrumentos (Codigo, Nombre, Fabricante, Categoria, Condicion) VALUES ('INSTR-0005', 'Trompeta', 'Bach', 'Viento', 'Esta trompeta está en buen estado y suena genial.');
INSERT INTO Instrumentos (Codigo, Nombre, Fabricante, Categoria, Condicion) VALUES ('INSTR-0006', 'Batería', 'Pearl', 'Percusión', 'Esta batería está en condiciones regulares y lista para tocar.');
INSERT INTO Instrumentos (Codigo, Nombre, Fabricante, Categoria, Condicion) VALUES ('INSTR-0007', 'Saxofón', 'Selmer', 'Viento', 'Este saxofón está en excelente estado y produce un sonido suave.');
INSERT INTO Instrumentos (Codigo, Nombre, Fabricante, Categoria, Condicion) VALUES ('INSTR-0008', 'Violonchelo', 'Stentor', 'Cuerdas', 'Este violonchelo está en buen estado y listo para tocar.');
INSERT INTO Instrumentos (Codigo, Nombre, Fabricante, Categoria, Condicion) VALUES ('INSTR-0009', 'Bajo', 'Ibanez', 'Cuerdas', 'Este bajo está en muy buen estado y produce un sonido potente.');
INSERT INTO Instrumentos (Codigo, Nombre, Fabricante, Categoria, Condicion) VALUES ('INSTR-0010', 'Trombón', 'King', 'Viento', 'Este trombón está en condiciones regulares y es ideal para principiantes.');

-- Inserts para Libros
INSERT INTO Libros (Codigo, Nombre, Categoria, Autor, Condicion) VALUES ('LIBR-0001', 'Introducción a la Teoría Musical', 'Educación Musical', 'Angel Perez', 'Este libro proporciona una introducción completa a la teoría musical con ejemplos prácticos. Buen estado.');
INSERT INTO Libros (Codigo, Nombre, Categoria, Autor, Condicion) VALUES ('LIBR-0002', 'Historia de la Música Clásica', 'Historia Musical', 'Maria Rodriguez', 'Este libro ofrece una visión detallada de la historia de la música clásica. Excelente estado.');
INSERT INTO Libros (Codigo, Nombre, Categoria, Autor, Condicion) VALUES ('LIBR-0003', 'Técnica Avanzada de Piano', 'Métodos Musicales', 'Juan González', 'Este libro aborda técnicas avanzadas para pianistas. Regular estado.');
INSERT INTO Libros (Codigo, Nombre, Categoria, Autor, Condicion) VALUES ('LIBR-0004', 'Composición y Arreglos Musicales', 'Composición Musical', 'Luisa Martinez', 'Este libro explora la composición y arreglos musicales. Buen estado.');
INSERT INTO Libros (Codigo, Nombre, Categoria, Autor, Condicion) VALUES ('LIBR-0005', 'Guía Práctica de Guitarra Acústica', 'Instrumentos Musicales', 'Carlos Sánchez', 'Esta guía práctica es esencial para guitarristas acústicos. Muy buen estado.');
INSERT INTO Libros (Codigo, Nombre, Categoria, Autor, Condicion) VALUES ('LIBR-0006', 'Diccionario de Términos Musicales', 'Referencias Musicales', 'Ana Garcia', 'Este diccionario proporciona definiciones de términos musicales. Regular estado.');
INSERT INTO Libros (Codigo, Nombre, Categoria, Autor, Condicion) VALUES ('LIBR-0007', 'Teoría de la Composición Electrónica', 'Música Electrónica', 'Pedro López', 'Este libro explora la teoría de la composición electrónica. Excelente estado.');
INSERT INTO Libros (Codigo, Nombre, Categoria, Autor, Condicion) VALUES ('LIBR-0008', 'Ejercicios de Técnica para Flauta', 'Instrumentos de Viento', 'Laura Rodriguez', 'Este libro contiene ejercicios de técnica para flautistas. Buen estado.');
INSERT INTO Libros (Codigo, Nombre, Categoria, Autor, Condicion) VALUES ('LIBR-0009', 'Canciones Populares para Piano', 'Repertorio Musical', 'Patricia González', 'Este libro presenta canciones populares para pianistas. Muy buen estado.');
INSERT INTO Libros (Codigo, Nombre, Categoria, Autor, Condicion) VALUES ('LIBR-0010', 'Improvisación en Jazz', 'Improvisación Musical', 'Santiago Fernandez', 'Este libro se centra en la improvisación en el jazz. Regular estado.');

-- Inserts para prestamos
INSERT INTO prestamos_libros (Cedula_estudiante, Codigo_Libro, Fecha) VALUES ('1711402980', 'LIBR-0001', '2023-09-10');
INSERT INTO prestamos_libros (Cedula_estudiante, Codigo_Libro, Fecha) VALUES ('1715664643', 'LIBR-0002', '2023-09-12');
INSERT INTO prestamos_libros (Cedula_estudiante, Codigo_Libro, Fecha) VALUES ('1709520231', 'LIBR-0003', '2023-09-15');
INSERT INTO prestamos_libros (Cedula_estudiante, Codigo_Libro, Fecha) VALUES ('1710481225', 'LIBR-0004', '2023-09-18');
INSERT INTO prestamos_libros (Cedula_estudiante, Codigo_Libro, Fecha) VALUES ('1712452729', 'LIBR-0005', '2023-09-20');

UPDATE Libros SET EstadoAlquiler = 'Alquilado' WHERE Codigo = 'LIBR-0001';
UPDATE Libros SET EstadoAlquiler = 'Alquilado' WHERE Codigo = 'LIBR-0002';
UPDATE Libros SET EstadoAlquiler = 'Alquilado' WHERE Codigo = 'LIBR-0003';
UPDATE Libros SET EstadoAlquiler = 'Alquilado' WHERE Codigo = 'LIBR-0004';
UPDATE Libros SET EstadoAlquiler = 'Alquilado' WHERE Codigo = 'LIBR-0005';

INSERT INTO prestamos_instrumentos (Cedula_estudiante, Codigo_Instrumento, Fecha) VALUES ('1709338089', 'INSTR-0001', '2023-09-11');
INSERT INTO prestamos_instrumentos (Cedula_estudiante, Codigo_Instrumento, Fecha) VALUES ('1707649438', 'INSTR-0003', '2023-09-14');
INSERT INTO prestamos_instrumentos (Cedula_estudiante, Codigo_Instrumento, Fecha) VALUES ('1705918918', 'INSTR-0006', '2023-09-17');

UPDATE Instrumentos SET EstadoAlquiler = 'Alquilado' WHERE Codigo = 'INSTR-0001';
UPDATE Instrumentos SET EstadoAlquiler = 'Alquilado' WHERE Codigo = 'INSTR-0003';
UPDATE Instrumentos SET EstadoAlquiler = 'Alquilado' WHERE Codigo = 'INSTR-0006';

-- Inserts para crear una clase para cada profesor
-- Insert para Clases de Teoría Musical
INSERT INTO Clases (Aula, Materia, Cedula_profesor) VALUES ('Matriz/P1/10', 'Teoría Musical', '1706172648');
INSERT INTO Clases (Aula, Materia, Cedula_profesor) VALUES ('Matriz/P2/12', 'Piano Avanzado', '1704997012');
INSERT INTO Clases (Aula, Materia, Cedula_profesor) VALUES ('Matriz/P1/02', 'Composición Musical', '1714818299');
INSERT INTO Clases (Aula, Materia, Cedula_profesor) VALUES ('Matriz/P1/01', 'Guitarra Eléctrica', '1713627071');
INSERT INTO Clases (Aula, Materia, Cedula_profesor) VALUES ('Matriz/P2/13', 'Canto Popular', '1709262933');
INSERT INTO Clases (Aula, Materia, Cedula_profesor)VALUES ('Col.Don Bosco/Aula música 02', 'Flauta Traversa', '1708706302');

-- Inserts con 2 horarios para cada clase
-- Horarios Teoría musical
-- Horario 1
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (1, 'Viernes', '11:00:00');
-- Horario 2
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (1, 'Sábado', '11:00:00');

-- Horarios Piano Avanzado
-- Horario 3
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (2, 'Lunes', '07:00:00');  
-- Horario 4
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (2, 'Miércoles', '09:00:00'); 

-- Horarios Composición Musical
-- Horario 5
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (3, 'Martes', '09:00:00'); 
-- Horario 6
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (3, 'Jueves', '11:00:00'); 

-- Horario Guitarra Eléctrica
-- Horario 7
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (4, 'Lunes', '11:00:00'); 
-- Horario 8
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (4, 'Miércoles', '13:00:00'); 

-- Horario Canto Popular
-- Horario 9
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (5, 'Martes', '14:00:00'); 
-- Horario 10
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (5, 'Jueves', '16:00:00'); 

-- Horario Flauta Traversa
-- Horario 11
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (6, 'Miércoles', '16:00:00');
-- Horario 12
INSERT INTO Horarios (Codigo_Clase, DiaSemana, Hora) VALUES (6, 'Viernes', '18:00:00'); 

-- Inserts aleatorios para asignar horarios a estudiantes
-- Teoría Musical
INSERT INTO Asignacion_cupos (Codigo_Clase, Cedula_estudiante, Codigo_Horario) VALUES (1, '1707717375', 1);
INSERT INTO Asignacion_cupos (Codigo_Clase, Cedula_estudiante, Codigo_Horario) VALUES (1, '1708473747', 1);

-- Piano Avanzado
INSERT INTO Asignacion_cupos (Codigo_Clase, Cedula_estudiante, Codigo_Horario) VALUES (2, '1708970205', 3);
INSERT INTO Asignacion_cupos (Codigo_Clase, Cedula_estudiante, Codigo_Horario) VALUES (2, '1708994288', 3);

-- Composición Musical
INSERT INTO Asignacion_cupos (Codigo_Clase, Cedula_estudiante, Codigo_Horario) VALUES (3, '1700591702', 6);
INSERT INTO Asignacion_cupos (Codigo_Clase, Cedula_estudiante, Codigo_Horario) VALUES (3, '1707008437', 6);

-- Flauta Traversa
INSERT INTO Asignacion_cupos (Codigo_Clase, Cedula_estudiante, Codigo_Horario) VALUES (6, '1707634729', 11);
INSERT INTO Asignacion_cupos (Codigo_Clase, Cedula_estudiante, Codigo_Horario) VALUES (6, '1705599429', 11);

-- Actualización de asistencia para estudiantes en horarios específicos
UPDATE Asignacion_cupos SET asistencia = 1 WHERE Codigo_Clase = 2 AND Cedula_estudiante = '1708970205' AND Codigo_Horario = 2;
UPDATE Asignacion_cupos SET asistencia = 1 WHERE Codigo_Clase = 6 AND Cedula_estudiante = '1707634729' AND Codigo_Horario = 6;

-- Inserts para pagos de estudiantes con ajuste para pagos de septiembre 
INSERT INTO Pagos (Cedula_estudiante, Metodo_pago, Monto, Fecha_Pago, Mes_pagado, Abono) VALUES ('1712452729', 'Tarjeta de Crédito', 100.00, '2023-08-30', 'Agosto', 0);
INSERT INTO Pagos (Cedula_estudiante, Metodo_pago, Monto, Fecha_Pago, Mes_pagado, Abono) VALUES ('1712452729', 'Efectivo', 100.00, '2023-09-05', 'Septiembre', 0);
INSERT INTO Pagos (Cedula_estudiante, Metodo_pago, Monto, Fecha_Pago, Mes_pagado, Abono) VALUES ('1711113975', 'Efectivo', 50.00, '2023-08-15', 'Agosto', 1);
INSERT INTO Pagos (Cedula_estudiante, Metodo_pago, Monto, Fecha_Pago, Mes_pagado, Abono) VALUES ('1711113975', 'Tarjeta de Crédito', 50.00, '2023-08-10', 'Agosto', 1);
INSERT INTO Pagos (Cedula_estudiante, Metodo_pago, Monto, Fecha_Pago, Mes_pagado, Abono) VALUES ('1711113975', 'Efectivo', 100.00, '2023-09-02', 'Septiembre', 0);
INSERT INTO Pagos (Cedula_estudiante, Metodo_pago, Monto, Fecha_Pago, Mes_pagado, Abono) VALUES ('1705918918', 'Efectivo', 25.00, '2023-08-30', 'Agosto', 1);
INSERT INTO Pagos (Cedula_estudiante, Metodo_pago, Monto, Fecha_Pago, Mes_pagado, Abono) VALUES ('1705918918', 'Transferencia Bancaria', 25.00, '2023-08-25', 'Agosto', 1);

-- Inserts para Usuarios Bloqueados
INSERT INTO usuarios_bloqueados (Cedula_estudiante) VALUES ('1707717375');
INSERT INTO usuarios_bloqueados (Cedula_estudiante) VALUES ('1707649438');
INSERT INTO usuarios_bloqueados (Cedula_estudiante) VALUES ('1705918918');
INSERT INTO usuarios_bloqueados (Cedula_estudiante) VALUES ('1704568433');
INSERT INTO usuarios_bloqueados (Cedula_estudiante) VALUES ('1700591702');

-- Usuarios inactivos
DELETE FROM Estudiantes WHERE Cedula_Estudiante = '1710732288';
DELETE FROM Estudiantes WHERE Cedula_Estudiante = '1710532670';
DELETE FROM Estudiantes WHERE Cedula_Estudiante = '1703898567';
DELETE FROM Estudiantes WHERE Cedula_Estudiante = '1717638694';
DELETE FROM Estudiantes WHERE Cedula_Estudiante = '1713277158';
