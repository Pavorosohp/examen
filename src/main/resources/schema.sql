CREATE TABLE persona
(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50),
    rfc VARCHAR(13) NOT NULL,
    curp VARCHAR(23) NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    nacionalidad VARCHAR(20)
);
