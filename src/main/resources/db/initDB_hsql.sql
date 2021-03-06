DROP TABLE phones IF EXISTS;
DROP TABLE clients IF EXISTS;
DROP SEQUENCE global_seq IF EXISTS;
CREATE SEQUENCE global_seq AS INTEGER START WITH 1000;

CREATE TABLE clients
(
  id               INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
  first_name       VARCHAR(255) NOT NULL,
  middle_name      VARCHAR(255) NOT NULL,
  last_name        VARCHAR(255) NOT NULL
);


CREATE TABLE phones
(
  id             INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
  number         VARCHAR(255) NOT NULL,
  description    VARCHAR(255) NOT NULL,
  comments       VARCHAR(255),
  client_id      INTEGER      NOT NULL,
  FOREIGN KEY ( client_id ) REFERENCES clients (id) ON DELETE CASCADE
);
CREATE UNIQUE INDEX phones_unique_client_number_idx ON phones (client_id, number)