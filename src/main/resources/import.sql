INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES('llem', 'llem', 1, 'Lorena', 'Espinosa', 'lorena.espinosa@algo.com');
INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES('zfe', 'zfe', 1, 'Zeus', 'Flores', 'zeus.flores@algo.com');

INSERT INTO roles(nombre) VALUES('ROLE_USER');
INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(1,1)
INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(2,2)
INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(2,1)