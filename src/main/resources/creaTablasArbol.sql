-- Eliminar la base de datos si existe
DROP DATABASE IF EXISTS practica;

-- Eliminar el usuario si existe
DROP USER IF EXISTS 'usuario_practica'@'%';

-- Crear la base de datos "practica"
CREATE DATABASE practica;

-- Usar la base de datos "practica"
USE practica;

-- Crear el usuario "usuario_practica" con la clave "la_Clave"
CREATE USER 'usuario_practica'@'%' IDENTIFIED BY 'la_Clave';

-- Dar acceso al usuario "usuario_practica" a todos los objetos de la base de datos "practica"
GRANT ALL PRIVILEGES ON practica.* TO 'usuario_practica'@'%';

-- Actualizar los privilegios
FLUSH PRIVILEGES;

-- Crear la tabla "arbol"
CREATE TABLE arbol (
  id INT AUTO_INCREMENT PRIMARY KEY,
  ruta_imagen VARCHAR(1024),
  nombre_comun VARCHAR(30) NOT NULL,
  tipo_flor VARCHAR(30) NOT NULL,
  dureza_madera VARCHAR(30) NOT NULL,
  campo_numerico INT,
  campo_texto VARCHAR(30)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

