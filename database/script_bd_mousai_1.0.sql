/*Script para crear la base de datos para la escuela de música mousai
 * @authors G2 SoftwareSolutions
*/

DROP DATABASE bd_mousai;

-- Creación de la base de datos
CREATE DATABASE IF NOT EXISTS bd_Mousai;
USE bd_Mousai;

-- Tabla Admins
CREATE TABLE IF NOT EXISTS Admins(
    Cedula_Admin VARCHAR(20) NOT NULL PRIMARY KEY,
    Nombres VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(100) NOT NULL,
    Correo VARCHAR(100) NOT NULL,
    esProfesor BOOLEAN NOT NULL DEFAULT 0 -- 1 si es profesor, 0 si no lo es
)ENGINE = InnoDB;

-- Tabla Estudiantes
CREATE TABLE IF NOT EXISTS Estudiantes (
    Cedula_Estudiante VARCHAR(20) NOT NULL PRIMARY KEY,
    Nombres VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(100) NOT NULL,
    Sexo CHAR(1),
    FechaNacimiento DATE,
    NombresRepresentante VARCHAR(100),
    ApellidosRepresentante VARCHAR(100),
    CorreoRepresentante VARCHAR(100) NOT NULL,
    TelefonoRepresentante VARCHAR(20)
)  ENGINE=INNODB;

-- Tabla Users
CREATE TABLE IF NOT EXISTS Users (
	Cedula VARCHAR(20) NOT NULL PRIMARY KEY,
    Nombre_Usuario VARCHAR(50) NOT NULL,
    Contrasena VARCHAR(255) NOT NULL,
    Rol VARCHAR(20) NOT NULL
)ENGINE = InnoDB;

 -- Tabla Clases
 CREATE TABLE IF NOT EXISTS Clases (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Codigo VARCHAR(10) UNIQUE NOT NULL,
    Horario VARCHAR(10) NOT NULL,
    Aula VARCHAR(4) NOT NULL,
    Materia VARCHAR(20) NOT NULL,
    Profesor_Cedula VARCHAR(20),
    Cupo_Alumnos INT DEFAULT 0,
    -- FOREIGN KEY (Profesor_Cedula) REFERENCES Profesores(Cedula_Profesor),
    Notificacion_Profesor BOOLEAN NOT NULL DEFAULT 0,
    Notificacion_Estudiantes BOOLEAN NOT NULL DEFAULT 0
) ENGINE = InnoDB;

 -- Tabla Pagos
 CREATE TABLE IF NOT EXISTS Pagos (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Numero_Cedula VARCHAR(20) NOT NULL,
    Metodo_Pago ENUM('Tarjeta de Crédito', 'Tarjeta de Débito', 'Transferencia Bancaria') NOT NULL,
    Monto DECIMAL(10, 2) NOT NULL,
    Fecha_Pago DATE NOT NULL,
    Factura_Generada BOOLEAN NOT NULL DEFAULT 0,
    Anticipo BOOLEAN NOT NULL DEFAULT 0,
    Administrador VARCHAR(20) NOT NULL
    -- FOREIGN KEY (Administrador) REFERENCES Admins(Cedula_Admin)
) ENGINE = InnoDB;

-- Tabla Libros
CREATE TABLE IF NOT EXISTS Libros (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Codigo VARCHAR(10) UNIQUE NOT NULL,
    Nombre VARCHAR(50) NOT NULL,
    Categoria VARCHAR(30) NOT NULL,
    Autor VARCHAR(50) NOT NULL,
    EstadoAlquiler ENUM('Alquilado', 'No Alquilado') NOT NULL,
    Condicion TEXT,
    Administrador VARCHAR(20) NOT NULL,
    FOREIGN KEY (Administrador) REFERENCES Admins(Cedula_Admin)
) ENGINE = InnoDB;

-- Tabla instrumentos
CREATE TABLE IF NOT EXISTS Instrumentos (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Codigo VARCHAR(10) UNIQUE NOT NULL,
    Nombre VARCHAR(50) NOT NULL,
    Categoria VARCHAR(30) NOT NULL,
    Fabricante VARCHAR(50) NOT NULL,
    EstadoAlquiler ENUM('Alquilado', 'No Alquilado') NOT NULL,
    Condicion TEXT,
    Administrador VARCHAR(20) NOT NULL,
    FOREIGN KEY (Administrador) REFERENCES Admins(Cedula_Admin)
) ENGINE = InnoDB;

-- Tabla Usuarios inactivos
CREATE TABLE IF NOT EXISTS Usuarios_Inactivos (
    Cedula VARCHAR(20) NOT NULL PRIMARY KEY,
    Nombres VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(100) NOT NULL,
    Correo VARCHAR(100) NOT NULL,
    Rol VARCHAR(20) NOT NULL
)ENGINE = InnoDB;

-- TRIGGERS DE LA BASE DE DATOS
DELIMITER //

-- Trigger para pasar estado de adminstradores de activo a inactivo
CREATE TRIGGER tr_Activo_Inactivo_Users
BEFORE DELETE ON Admins
FOR EACH ROW
BEGIN
    DELETE FROM Users WHERE Cedula = OLD.Cedula_Admin LIMIT 1;
    INSERT INTO Usuarios_Inactivos (Cedula, Nombres, Apellidos, Correo, Rol)
    VALUES (OLD.Cedula_Admin, OLD.Nombres, OLD.Apellidos, OLD.Correo, 'administrativo');
END;
//

-- Trigger para pasar estado de estudiantes de activo a inactivo
CREATE TRIGGER tr_Activo_Inactivo_Estudiantes
AFTER DELETE ON Estudiantes
FOR EACH ROW
BEGIN
    DELETE FROM Users WHERE Cedula = OLD.Cedula_Estudiante LIMIT 1;
    INSERT INTO Usuarios_Inactivos (Cedula, Nombres, Apellidos, Correo, Rol)
    VALUES (OLD.Cedula_Estudiante, OLD.Nombres, OLD.Apellidos, OLD.CorreoRepresentante, 'estudiante');
END;
//

-- Trigger que pasa el estado del usuario de inactivo a activo
CREATE TRIGGER tr_Active_Users
BEFORE DELETE ON Usuarios_Inactivos
FOR EACH ROW
BEGIN
    -- Obtener el rol y cedula del usuario eliminado
    SET @rolUsuario = OLD.Rol;
    
    -- Insertar en la tabla correspondiente según el rol
	IF @rolUsuario = 'administrativo' THEN
		INSERT INTO Admins (Cedula_Admin, Nombres, Apellidos, Correo)
		VALUES (OLD.Cedula, OLD.Nombres, OLD.Apellidos, OLD.Correo);
	ELSEIF @rolUsuario = 'estudiante' THEN
		INSERT INTO Estudiantes (Cedula_Estudiante, Nombres, Apellidos, CorreoRepresentante)
		VALUES (OLD.Cedula, OLD.Nombres, OLD.Apellidos, OLD.Correo);
	END IF;
END;
//

-- Trigger para registro para insertar un registro en Users despues de Admins
CREATE TRIGGER tr_Users_Insert_Admins
AFTER INSERT ON Admins
FOR EACH ROW
BEGIN
	SET @characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    SET @randomPassword = '';
    
    -- Generar una cadena aleatoria de 10 caracteres alfanuméricos
    REPEAT
        SET @randomIndex = FLOOR(RAND() * 62);
        SET @randomCharacter = SUBSTRING(@characters, @randomIndex + 1, 1);
        SET @randomPassword = CONCAT(@randomPassword, @randomCharacter);
    UNTIL LENGTH(@randomPassword) = 10 END REPEAT;
    
    SET @namePart = LEFT(NEW.Nombres, 4);
    SET @surnamePart = LEFT(NEW.Apellidos, 3);
    SET @cedulaPart = RIGHT(NEW.Cedula_Admin, 2);
    SET @Nombre_Usuario = CONCAT(@namePart, @surnamePart, @cedulaPart);
    
    INSERT INTO Users (Rol, Cedula, Nombre_Usuario, Contrasena)
    VALUES ('administrativo', NEW.Cedula_Admin, @Nombre_Usuario, @randomPassword);
END;
//

-- Trigger para registro en tabla Users al insertar registro en Estudiantes
CREATE TRIGGER tr_Users_Insert_Estudiantes
AFTER INSERT ON Estudiantes
FOR EACH ROW
BEGIN
	SET @characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    SET @randomPassword = '';
    
    -- Generar una cadena aleatoria de 10 caracteres alfanuméricos
    REPEAT
        SET @randomIndex = FLOOR(RAND() * 62);
        SET @randomCharacter = SUBSTRING(@characters, @randomIndex + 1, 1);
        SET @randomPassword = CONCAT(@randomPassword, @randomCharacter);
    UNTIL LENGTH(@randomPassword) = 10 END REPEAT;
    
    SET @namePart = LEFT(NEW.Nombres, 4);
    SET @surnamePart = LEFT(NEW.Apellidos, 3);
    SET @cedulaPart = RIGHT(NEW.Cedula_Estudiante, 2);
    SET @Nombre_Usuario = CONCAT(@namePart, @surnamePart, @cedulaPart);
    
    INSERT INTO Users (Rol, Cedula, Nombre_Usuario, Contrasena)
    VALUES ('estudiante', NEW.Cedula_Estudiante, @Nombre_Usuario, @randomPassword);
END;
//
DELIMITER ;

-- Pruebas
INSERT INTO Admins (Cedula_Admin, Nombres, Apellidos, Correo)
VALUES ('0000000000', 'Admin', 'Admin', 'soportetecnicomousai@gmail.com');

INSERT INTO Admins (Cedula_Admin, Nombres, Apellidos, Correo)
VALUES ('1234567826', 'Jeremy', 'Arias', 'jeremyismael20009@gmail.com');

INSERT INTO Admins (Cedula_Admin, Nombres, Apellidos, Correo)
VALUES ('2345678901', 'María', 'López', 'maria@example.com');

INSERT INTO Admins (Cedula_Admin, Nombres, Apellidos, Correo)
VALUES ('3456789012', 'Pedro', 'Rodríguez', 'pedro@example.com');

INSERT INTO Admins (Cedula_Admin, Nombres, Apellidos, Correo)
VALUES ('4567890123', 'Luisa', 'Martínez', 'luisa@example.com');

INSERT INTO Estudiantes (Cedula_Estudiante, Nombres, Apellidos, Sexo, FechaNacimiento, NombresRepresentante, ApellidosRepresentante, CorreoRepresentante, TelefonoRepresentante)
VALUES ('1234567890', 'Juan', 'Pérez', 'M', '2000-05-15', 'Ana', 'Gómez', 'ana@example.com', '123456789');

INSERT INTO Estudiantes (Cedula_Estudiante, Nombres, Apellidos, Sexo, FechaNacimiento, NombresRepresentante, ApellidosRepresentante, CorreoRepresentante, TelefonoRepresentante)
VALUES ('5678901234', 'Ana', 'García', 'F', '2005-03-15', 'Carlos', 'García', 'carlos@example.com', '987654321');

INSERT INTO Estudiantes (Cedula_Estudiante, Nombres, Apellidos, Sexo, FechaNacimiento, NombresRepresentante, ApellidosRepresentante, CorreoRepresentante, TelefonoRepresentante)
VALUES ('6789012345', 'Daniel', 'Martínez', 'M', '2004-08-10', 'Laura', 'Martínez', 'laura@example.com', '876543210');

INSERT INTO Estudiantes (Cedula_Estudiante, Nombres, Apellidos, Sexo, FechaNacimiento, NombresRepresentante, ApellidosRepresentante, CorreoRepresentante, TelefonoRepresentante)
VALUES ('7890123456', 'Sofía', 'López', 'F', '2006-11-25', 'Javier', 'López', 'javier@example.com', '765432109');

INSERT INTO Estudiantes (Cedula_Estudiante, Nombres, Apellidos, Sexo, FechaNacimiento, NombresRepresentante, ApellidosRepresentante, CorreoRepresentante, TelefonoRepresentante)
VALUES ('8901234567', 'Elena', 'Ramírez', 'F', '2003-05-20', 'Andrés', 'Ramírez', 'andres@example.com', '654321098');

-- insert into Clases 

INSERT INTO Clases (Codigo, Horario, Aula, Materia, Profesor_Cedula, Cupo_Alumnos, Notificacion_Profesor, Notificacion_Estudiantes)
VALUES ('01', '10/08/2023', 'A1', 'Matemáticas', '1234567890', 8, 1, 1);

INSERT INTO Clases (Codigo, Horario, Aula, Materia, Profesor_Cedula, Cupo_Alumnos, Notificacion_Profesor, Notificacion_Estudiantes)
VALUES ('02', '15/08/2023', 'B3', 'Historia', '2345678901', 10, 0, 1);

INSERT INTO Clases (Codigo, Horario, Aula, Materia, Profesor_Cedula, Cupo_Alumnos, Notificacion_Profesor, Notificacion_Estudiantes)
VALUES ('03', '12/08/2023', 'A2', 'Inglés', '3456789012', 9, 1, 0);

INSERT INTO Clases (Codigo, Horario, Aula, Materia, Profesor_Cedula, Cupo_Alumnos, Notificacion_Profesor, Notificacion_Estudiantes)
VALUES ('04', '14/08/2023', 'C1', 'Artes Plásticas', NULL, 5, 0, 1);

-- insert into Pagos 

INSERT INTO Pagos (Numero_Cedula, Metodo_Pago, Monto, Fecha_Pago, Factura_Generada, Anticipo, Administrador)
VALUES ('1234567890', 'Tarjeta de Crédito', 150.00, '2023-08-01', 1, 0, '0000000000');

INSERT INTO Pagos (Numero_Cedula, Metodo_Pago, Monto, Fecha_Pago, Factura_Generada, Anticipo, Administrador)
VALUES ('5678901234', 'Tarjeta de Débito', 200.00, '2023-08-02', 1, 0, '1234567826');

INSERT INTO Pagos (Numero_Cedula, Metodo_Pago, Monto, Fecha_Pago, Factura_Generada, Anticipo, Administrador)
VALUES ('6789012345', 'Transferencia Bancaria', 180.00, '2023-08-03', 1, 0, '2345678901');

INSERT INTO Pagos (Numero_Cedula, Metodo_Pago, Monto, Fecha_Pago, Factura_Generada, Anticipo, Administrador)
VALUES ('7890123456', 'Tarjeta de Crédito', 250.00, '2023-08-04', 1, 0, '3456789012');

INSERT INTO Pagos (Numero_Cedula, Metodo_Pago, Monto, Fecha_Pago, Factura_Generada, Anticipo, Administrador)
VALUES ('8901234567', 'Tarjeta de Crédito', 190.00, '2023-08-05', 1, 0, '4567890123');

-- insert into inventario en dos partes

DELETE FROM Admins WHERE Cedula_Admin = '1234567826' LIMIT 1;
DELETE FROM Admins WHERE Cedula_Admin = '2345678901' LIMIT 1;
DELETE FROM Admins WHERE Cedula_Admin = '3456789012' LIMIT 1;
DELETE FROM Admins WHERE Cedula_Admin = '4567890123' LIMIT 1;
DELETE FROM Estudiantes WHERE Cedula_Estudiante = '5678901234' LIMIT 1;
DELETE FROM Estudiantes WHERE Cedula_Estudiante = '6789012345' LIMIT 1;
DELETE FROM Estudiantes WHERE Cedula_Estudiante = '7890123456' LIMIT 1;
DELETE FROM Estudiantes WHERE Cedula_Estudiante = '8901234567' LIMIT 1;
DELETE FROM Usuarios_Inactivos WHERE Cedula = '1234567826' LIMIT 1;
DELETE FROM Usuarios_Inactivos WHERE Cedula = '8901234567' LIMIT 1;

SELECT * FROM Admins;
SELECT * FROM Estudiantes;
SELECT * FROM Users;
SELECT * FROM Usuarios_Inactivos;
