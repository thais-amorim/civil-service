DROP TABLE resumes IF EXISTS;

CREATE TABLE IF NOT EXISTS resumes (
  id                            int(3)           unsigned auto_increment,
  name                          VARCHAR(60)      NOT NULL,
  birth_date                     VARCHAR(60)      NOT NULL,
  political_party                VARCHAR(60)      NOT NULL,
  local_birth                    VARCHAR(60)      NOT NULL,
  address                       VARCHAR(60)      NOT NULL,
  telephone                     VARCHAR(60)      NOT NULL,
  email                         VARCHAR(100)     NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO resumes (name,birth_date,political_party,local_birth,address,telephone,email) VALUES
('Cid Gomes','27/04/1963','PDT','Sobral - CE','Senado Federal Anexo 1 10º Pavimento',' (61) 3303-6460 / 6399','sen.cidgomes@senado.leg.br');
--('Eduardo Girão','Podemos'),
--('Tasso Jereissati','PSDB');