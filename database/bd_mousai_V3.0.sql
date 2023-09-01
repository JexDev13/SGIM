/*Script para crear la base de datos para la escuela de música mousai
 * @authors G2 SoftwareSolutions
*/

-- DROP DATABASE bd_mousai;

-- Creación de la base de datos
CREATE DATABASE IF NOT EXISTS bd_Mousai;
USE bd_Mousai;

-- Tabla variables del "Sistema"
CREATE TABLE IF NOT EXISTS variables_del_sistema (
    id INT AUTO_INCREMENT PRIMARY KEY,
    valor_pension DECIMAL(10, 2),
    cupos  INT
) ENGINE = InnoDB;

-- Tabla relacional "Personas"
CREATE TABLE IF NOT EXISTS Personas (
    Cedula VARCHAR(20) NOT NULL,
    Nombres VARCHAR(50) NOT NULL,
    Apellidos VARCHAR(50) NOT NULL,
    Correo VARCHAR(100) NOT NULL,
    Rol ENUM('Administrativo', 'Profesor', 'Estudiante') NOT NULL,
    PRIMARY KEY (Cedula, Rol)
)ENGINE = InnoDB;

-- Tabla "Administradores"
CREATE TABLE IF NOT EXISTS Admins (
    Cedula_Admin VARCHAR(20) NOT NULL PRIMARY KEY,
    EsProfesor BOOLEAN NOT NULL DEFAULT 0, -- 1 si es profesor, 0 si no lo es
    FOREIGN KEY (Cedula_Admin) REFERENCES Personas(Cedula)
)ENGINE = InnoDB;

-- Tabla "Profesores"
CREATE TABLE IF NOT EXISTS Profesores (
    Cedula_Profesor VARCHAR(20) NOT NULL PRIMARY KEY,
    NivelAcademico VARCHAR(50),
    Direccion VARCHAR(100),
    Telefono VARCHAR(15),
    Especializacion VARCHAR(50),
    SueldoBase DECIMAL(10, 2),
    FOREIGN KEY (Cedula_Profesor) REFERENCES Personas(Cedula)
)ENGINE = InnoDB;

-- Tabla "Estudiantes"
CREATE TABLE IF NOT EXISTS Estudiantes (
    Cedula_Estudiante VARCHAR(20) NOT NULL PRIMARY KEY,
    Sexo CHAR(1),
    FechaNacimiento DATE,
    NombresRepresentante VARCHAR(50),
    ApellidosRepresentante VARCHAR(50),
    TelefonoRepresentante VARCHAR(20),
    FOREIGN KEY (Cedula_Estudiante) REFERENCES Personas(Cedula)
)ENGINE = InnoDB;

-- Tabla "users" con clave primaria compuesta
CREATE TABLE IF NOT EXISTS Users (
    Cedula VARCHAR(20) NOT NULL,
    Nombre_Usuario VARCHAR(50),
    Contrasena VARCHAR(100),
    Rol ENUM('Administrativo', 'Profesor', 'Estudiante') NOT NULL,
    bloqueo BOOLEAN NOT NULL DEFAULT 0, -- 1 si esta bloqueado, 0 si no lo esta
    PRIMARY KEY (Cedula, Rol),
    FOREIGN KEY (Cedula) REFERENCES Personas(Cedula)
)ENGINE = InnoDB;

-- Tabla "Usuarios_Inactivos"
CREATE TABLE IF NOT EXISTS Usuarios_Inactivos (
    Cedula VARCHAR(20) NOT NULL,
    Rol ENUM('Administrativo', 'Profesor', 'Estudiante') NOT NULL,
    PRIMARY KEY (Cedula, Rol),
    FOREIGN KEY (Cedula) REFERENCES Personas(Cedula)
)ENGINE = InnoDB;

-- Tabla "Clases"
CREATE TABLE IF NOT EXISTS Clases (
    Codigo_Clase INT AUTO_INCREMENT PRIMARY KEY,
    Aula VARCHAR(20),
    Materia VARCHAR(50),
    Cedula_profesor VARCHAR(20),
    FOREIGN KEY (Cedula_profesor) REFERENCES Profesores(Cedula_Profesor)
)ENGINE = InnoDB;

-- Tabla "Horarios"
CREATE TABLE IF NOT EXISTS Horarios (
	Codigo_Horario INT AUTO_INCREMENT PRIMARY KEY,
    Codigo_Clase INT,
    DiaSemana ENUM('Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado') NOT NULL,
    Hora TIME,
    Cupos_disponibles INT NOT NULL DEFAULT 10,
    Cupos_ocupados INT NOT NULL DEFAULT 0,
    FOREIGN KEY (Codigo_Clase) REFERENCES Clases(Codigo_Clase)
) ENGINE = InnoDB;

-- Tabla "Asignacion de cupos"
CREATE TABLE IF NOT EXISTS Asignacion_cupos (
    Codigo_Clase INT,
    Cedula_estudiante VARCHAR(20),
    asistencia BOOLEAN NOT NULL DEFAULT 0, -- 1 si no asistio, 0 si asistio
    Codigo_Horario INT,
    FOREIGN KEY (Codigo_Clase) REFERENCES Clases(Codigo_Clase),
    FOREIGN KEY (Cedula_estudiante) REFERENCES Estudiantes(Cedula_Estudiante),
    FOREIGN KEY (Codigo_Horario) REFERENCES Horarios(Codigo_Horario)
)ENGINE = InnoDB;

 -- Tabla "Pagos"
CREATE TABLE IF NOT EXISTS Pagos (
    Codigo_pago INT AUTO_INCREMENT PRIMARY KEY,
    Cedula_estudiante VARCHAR(20) NOT NULL,
    Metodo_pago ENUM('Tarjeta de Crédito', 'Tarjeta de Débito', 'Transferencia Bancaria', 'Efectivo') NOT NULL,
    Monto DECIMAL(10, 2),
    Fecha_Pago DATE,
    Mes_pagado VARCHAR(20),
    Abono BOOLEAN NOT NULL DEFAULT 0, -- 1 si es abono, 0 si no lo es
    FOREIGN KEY (Cedula_estudiante) REFERENCES Estudiantes(Cedula_Estudiante)
)ENGINE = InnoDB;

-- Tabla "Estudiantes_Pagados"
CREATE TABLE Estudiantes_Pagados (
	Codigo_pension INT AUTO_INCREMENT PRIMARY KEY,
    Cedula_estudiante VARCHAR(20) NOT NULL,
    Pagado_Total BOOLEAN NOT NULL DEFAULT 0, -- 1 si es pago todo, 0 si no es total
    Mes VARCHAR(20),
    Total_cancelado DECIMAL(10, 2),
    FOREIGN KEY (Cedula_estudiante) REFERENCES Estudiantes(Cedula_Estudiante)
)ENGINE = InnoDB;

-- Tabla "Usuarios_Bloqueados"
CREATE TABLE IF NOT EXISTS Usuarios_Bloqueados (
    Cedula_estudiante VARCHAR(20) NOT NULL PRIMARY KEY,
    FOREIGN KEY (Cedula_estudiante) REFERENCES Estudiantes(Cedula_Estudiante)
)ENGINE = InnoDB;

-- Tabla "Libros"
CREATE TABLE IF NOT EXISTS Libros (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Codigo VARCHAR(9) UNIQUE NOT NULL,
    Nombre VARCHAR(50) NOT NULL,
    Categoria VARCHAR(30) NOT NULL,
    Autor VARCHAR(50) NOT NULL,
    EstadoAlquiler ENUM('Alquilado', 'No Alquilado') NOT NULL,
    Condicion TEXT
) ENGINE = InnoDB;

-- Tabla instrumentos
CREATE TABLE IF NOT EXISTS Instrumentos (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Codigo VARCHAR(10) UNIQUE NOT NULL,
    Nombre VARCHAR(50) NOT NULL,
    Fabricante VARCHAR(50) NOT NULL,
    Categoria VARCHAR(30) NOT NULL,
    EstadoAlquiler ENUM('Alquilado', 'No Alquilado') NOT NULL,
    Condicion TEXT
) ENGINE = InnoDB;

-- Creacion de la tabla para prestamos de instrumentos
CREATE TABLE IF NOT EXISTS prestamos_Instrumentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Cedula_estudiante VARCHAR(20) NOT NULL,
    Codigo_instrumento VARCHAR(10) NOT NULL,
    Fecha DATE,
    FOREIGN KEY (Cedula_estudiante) REFERENCES Estudiantes(Cedula_Estudiante),
    FOREIGN KEY (Codigo_instrumento) REFERENCES Instrumentos(Codigo)
) ENGINE = InnoDB;

-- Creacion de la tabla para prestamos de libros
CREATE TABLE IF NOT EXISTS prestamos_Libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Cedula_estudiante VARCHAR(20) NOT NULL,
    Codigo_libro VARCHAR(9) NOT NULL,
    Fecha DATE,
    FOREIGN KEY (Cedula_estudiante) REFERENCES Estudiantes(Cedula_Estudiante),
    FOREIGN KEY (Codigo_libro) REFERENCES Libros(Codigo)
) ENGINE = InnoDB;


-- TRIGGERS DE LA BASE DE DATOS
DELIMITER //

-- Trigger para insertar en tabla correspondiente 
CREATE TRIGGER tr_InsertPerson
AFTER INSERT ON Personas
FOR EACH ROW
BEGIN
	DECLARE admin_count INT;
    IF NEW.Rol = 'Estudiante' THEN
        INSERT INTO Estudiantes (Cedula_Estudiante) VALUES (NEW.Cedula);
    ELSEIF NEW.Rol = 'Administrativo' THEN
			INSERT INTO Admins (Cedula_Admin, EsProfesor) VALUES (NEW.Cedula, 0);
    ELSEIF NEW.Rol = 'Profesor' THEN
        SELECT COUNT(*) INTO admin_count FROM Admins WHERE Cedula_Admin = NEW.Cedula;
        IF admin_count > 0 THEN
            UPDATE Admins SET EsProfesor = 1 WHERE Cedula_Admin = NEW.Cedula;
            INSERT INTO Profesores (Cedula_Profesor) VALUES (NEW.Cedula);
        ELSE
            INSERT INTO Profesores (Cedula_Profesor) VALUES (NEW.Cedula);
        END IF;
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
    
    SET @namePart = LEFT((Select Nombres from Personas Where Cedula = NEW.Cedula_Admin), 4);
    SET @surnamePart = LEFT((Select Apellidos from Personas Where Cedula = NEW.Cedula_Admin), 3);
    SET @cedulaPart = RIGHT(NEW.Cedula_Admin, 2);
    SET @Nombre_Usuario = CONCAT(@namePart, @surnamePart, @cedulaPart);
    
    INSERT INTO Users(Cedula, Nombre_Usuario, Contrasena, Rol)
    VALUES (NEW.Cedula_Admin, @Nombre_Usuario, @randomPassword, 'Administrativo');
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
    
    SET @namePart = LEFT((Select Nombres from Personas Where Cedula = NEW.Cedula_Estudiante), 4);
    SET @surnamePart = LEFT((Select Apellidos from Personas Where Cedula = NEW.Cedula_Estudiante), 3);
    SET @cedulaPart = RIGHT(NEW.Cedula_Estudiante, 2);
    SET @Nombre_Usuario = CONCAT(@namePart, @surnamePart, @cedulaPart);
    
    INSERT INTO Users(Cedula, Nombre_Usuario, Contrasena, Rol)
    VALUES (NEW.Cedula_Estudiante, @Nombre_Usuario, @randomPassword, 'Estudiante');
END;
//

-- Trigger para registrar profesores en la tabla Users
CREATE TRIGGER tr_Users_Insert_Profesores
AFTER INSERT ON Profesores
FOR EACH ROW
BEGIN
    DECLARE admin_count INT;
    DECLARE admin_username VARCHAR(50);
    DECLARE admin_password VARCHAR(100);
    
    -- Verificar si el profesor también es un administrador
    SELECT COUNT(*) INTO admin_count FROM Admins WHERE Cedula_Admin = NEW.Cedula_Profesor;
    
    IF admin_count > 0 THEN
        -- Obtener el nombre de usuario y contraseña del administrador
        SELECT Nombre_Usuario, Contrasena INTO admin_username, admin_password FROM Users 
        WHERE Cedula = NEW.Cedula_Profesor AND Rol = 'Administrativo' LIMIT 1;
        
        -- Insertar en la tabla Users con los mismos datos del administrador
        INSERT INTO Users (Cedula, Nombre_Usuario, Contrasena, Rol)
        VALUES (NEW.Cedula_Profesor, admin_username, admin_password, 'Profesor');
    ELSE
        -- Generar una nueva contraseña y nombre de usuario para el profesor
        SET @characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
        SET @randomPassword = '';
        
        REPEAT
            SET @randomIndex = FLOOR(RAND() * 62);
            SET @randomCharacter = SUBSTRING(@characters, @randomIndex + 1, 1);
            SET @randomPassword = CONCAT(@randomPassword, @randomCharacter);
        UNTIL LENGTH(@randomPassword) = 10 END REPEAT;
        
        SET @namePart = LEFT((SELECT Nombres FROM Personas WHERE Cedula = NEW.Cedula_Profesor), 4);
        SET @surnamePart = LEFT((SELECT Apellidos FROM Personas WHERE Cedula = NEW.Cedula_Profesor), 3);
        SET @cedulaPart = RIGHT(NEW.Cedula_Profesor, 2);
        SET @Nombre_Usuario = CONCAT(@namePart, @surnamePart, @cedulaPart);
        
        INSERT INTO Users (Cedula, Nombre_Usuario, Contrasena, Rol)
        VALUES (NEW.Cedula_Profesor, @Nombre_Usuario, @randomPassword, 'Profesor');
    END IF;
END;
//

-- Trigger para pasar estado de estudiantes de activo a inactivo
CREATE TRIGGER tr_Activo_Inactivo_Estudiantes
BEFORE DELETE ON Estudiantes
FOR EACH ROW
BEGIN
    DELETE FROM Users WHERE Cedula = OLD.Cedula_Estudiante LIMIT 2;
    INSERT INTO Usuarios_Inactivos (Cedula, Rol) VALUES (OLD.Cedula_Estudiante, 'Estudiante');
END;
//

-- Trigger para pasar estado de administradores de activo a inactivo
CREATE TRIGGER tr_Activo_Inactivo_Admins
BEFORE DELETE ON Admins
FOR EACH ROW
BEGIN
    DELETE FROM Users WHERE Cedula = OLD.Cedula_Admin LIMIT 2;
    INSERT INTO Usuarios_Inactivos (Cedula, Rol) VALUES (OLD.Cedula_Admin, 'Administrativo');
END;
//

-- Trigger para pasar estado de profesores de activo a inactivo
CREATE TRIGGER tr_Activo_Inactivo_Profesores
BEFORE DELETE ON Profesores
FOR EACH ROW
BEGIN
    DECLARE cedula_count INT;
    SELECT COUNT(*) INTO cedula_count FROM Usuarios_Inactivos WHERE Cedula = OLD.Cedula_Profesor;
    
    IF cedula_count = 0 THEN
        DELETE FROM Users WHERE Cedula = OLD.Cedula_Profesor LIMIT 1;
        INSERT INTO Usuarios_Inactivos (Cedula, Rol) VALUES (OLD.Cedula_Profesor, 'Profesor');
	ELSE
		UPDATE Admins SET EsProfesor = 0 WHERE Cedula_Admin = OLD.Cedula_Profesor;
        UPDATE Users SET Rol = 'Administrativo' WHERE Cedula = OLD.Cedula_Profesor;
    END IF;
END;
//

CREATE TRIGGER tr_Active_Users
BEFORE DELETE ON Usuarios_Inactivos
FOR EACH ROW
BEGIN
	DECLARE profesorCount INT;
	DECLARE adminCount INT;
    -- Obtener el rol
    SET @rolUsuario = OLD.Rol;
    -- Verificar si la cédula pertenece a un admin
    SELECT COUNT(*) INTO adminCount FROM Usuarios_Inactivos WHERE Cedula = OLD.Cedula AND @rolUsuario = 'Administrativo'; 
    -- Verificar si la cédula pertenece a un profesor
    SELECT COUNT(*) INTO profesorCount FROM Usuarios_Inactivos WHERE Cedula = OLD.Cedula AND @rolUsuario = 'Profesor'; 
    
    -- Insertar en las tablas correspondientes según el rol y pertenencia a admin/profesor
    IF @rolUsuario = 'Administrativo' AND adminCount != 0 THEN
        INSERT INTO Admins (Cedula_Admin) VALUES (OLD.Cedula);
    ELSEIF @rolUsuario = 'Estudiante' THEN
        INSERT INTO Estudiantes (Cedula_Estudiante) VALUES (OLD.Cedula);
    ELSEIF @rolUsuario = 'Profesor' AND profesorCount != 0 THEN
        INSERT INTO Profesores (Cedula_Profesor) VALUES (OLD.Cedula);
    END IF;
END;
//

-- Trigger que va reduciendo cupos
CREATE TRIGGER tr_Update_Cupos_Ocupados
AFTER INSERT ON Asignacion_cupos
FOR EACH ROW
BEGIN
    UPDATE Horarios SET Cupos_ocupados = Cupos_ocupados + 1 WHERE Codigo_Horario = NEW.Codigo_Horario;
    UPDATE Horarios SET Cupos_disponibles = Cupos_disponibles - 1 WHERE Codigo_Horario = NEW.Codigo_Horario;
END;
//

-- Trigger que va aumentando cupos
CREATE TRIGGER tr_DecreaseCupos
AFTER DELETE ON Asignacion_cupos
FOR EACH ROW
BEGIN
    UPDATE Horarios SET Cupos_disponibles = Cupos_disponibles + 1, Cupos_ocupados = Cupos_ocupados - 1 WHERE Codigo_Horario = OLD.Codigo_Horario;
END;
//

-- Trigger que elimina horarios
CREATE TRIGGER tr_DeleteHorarios
BEFORE DELETE ON Clases
FOR EACH ROW
BEGIN
	DELETE FROM Asignacion_cupos WHERE Codigo_Clase = OLD.Codigo_Clase;
    DELETE FROM Horarios WHERE Codigo_Clase = OLD.Codigo_Clase;
END;
//

-- Trigger que verifica pago de estudiantes
CREATE TRIGGER tr_Insert_Update_Pagos_EstudiantesPagados
AFTER INSERT ON Pagos
FOR EACH ROW
BEGIN
    DECLARE student_count INT;
    DECLARE existing_month INT;
    DECLARE pension_value DECIMAL(10, 2);
    
    -- Obtener el valor de la pensión almacenado en la tabla variables_del_sistema
    SELECT valor_pension INTO pension_value FROM variables_del_sistema WHERE id = 1; -- Suponiendo que el valor de pension está en la fila con id = 1
    
    -- Verificar si ya existe un registro para el estudiante en Estudiantes_Pagados
    SELECT COUNT(*) INTO student_count FROM Estudiantes_Pagados WHERE Cedula_estudiante = NEW.Cedula_estudiante;
    
    -- Si no existe, insertar un nuevo registro en Estudiantes_Pagados
    IF student_count = 0 THEN
        INSERT INTO Estudiantes_Pagados (Cedula_estudiante, Pagado_Total, Mes, Total_cancelado)
        VALUES (NEW.Cedula_estudiante, IF(NEW.Monto >= pension_value, 1, 0), NEW.Mes_pagado, NEW.Monto);
    ELSE
        -- Si ya existe, verificar si hay un registro con la misma cédula y mes
        SELECT COUNT(*) INTO existing_month FROM Estudiantes_Pagados
        WHERE Cedula_estudiante = NEW.Cedula_estudiante AND Mes = NEW.Mes_pagado;
        
        -- Si hay un registro existente con la misma cédula y mes, actualizarlo
        IF existing_month > 0 THEN
            UPDATE Estudiantes_Pagados
            SET Pagado_Total = IF(Total_cancelado + NEW.Monto >= pension_value, 1, 0),
                Total_cancelado = Total_cancelado + NEW.Monto
            WHERE Cedula_estudiante = NEW.Cedula_estudiante AND Mes = NEW.Mes_pagado;
        ELSE
            -- Si no hay un registro existente con la misma cédula y mes, insertar uno nuevo
            INSERT INTO Estudiantes_Pagados (Cedula_estudiante, Pagado_Total, Mes, Total_cancelado)
            VALUES (NEW.Cedula_estudiante, IF(NEW.Monto >= pension_value, 1, 0), NEW.Mes_pagado, NEW.Monto);
        END IF;
    END IF;
END;
//

-- Trigger para bloquear usuarios
CREATE TRIGGER tr_Bloquear_Estudiantes
AFTER INSERT ON Usuarios_Bloqueados
FOR EACH ROW
BEGIN
    UPDATE Users SET bloqueo = 1 WHERE Cedula = NEW.Cedula_Estudiante;
END;
//

-- Trigger para desbloquear usuarios
CREATE TRIGGER tr_Desbloquear_Estudiantes
AFTER DELETE ON Usuarios_Bloqueados
FOR EACH ROW
BEGIN
        UPDATE Users SET bloqueo = 0 WHERE Cedula = OLD.Cedula_Estudiante;
END;
//
DELIMITER ;

-- INSERTS Y DATOS DEFAULT NO BORRAR NI MODIFICAR
-- Variables del sistema
INSERT INTO variables_del_sistema (valor_pension, cupos) VALUES (100.00, 10);
-- Admin general
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol) 
VALUES ('0000000000', 'Admin', 'Admin', 'soportetecnicomousai@gmail.com', 'Administrativo');
UPDATE Users SET Nombre_Usuario = 'admin' WHERE Cedula = '0000000000';
UPDATE Users SET Contrasena = 'admin' WHERE Cedula = '0000000000';
-- Profesor para pruebas
INSERT INTO Personas (Cedula, Nombres, Apellidos, Correo, Rol)
VALUES ('1706172648', 'Juan', 'Pérez', 'juan@example.com', 'Profesor');