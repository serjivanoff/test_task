DELETE FROM phones;
DELETE FROM clients;
ALTER SEQUENCE global_seq RESTART WITH 1000;

INSERT INTO clients (FIRST_NAME, MIDDLE_NAME, LAST_NAME)VALUES
  ('Федор', 'Владимирович', 'Емельяненко'),
  ('Хабиб','Абдулманапович','Нурмагомедов')
;
INSERT INTO phones (number, description,comments, client_id) VALUES
  ('1-234-567-8900','Домашний','шутка)',1000),
  ('0-012-345-6789','Мобильный','шутка)', 1001);
