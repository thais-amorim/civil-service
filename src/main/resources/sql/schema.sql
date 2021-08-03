DROP TABLE resumes IF EXISTS;

CREATE TABLE IF NOT EXISTS resumes (
  id                            int(3)           unsigned auto_increment,
  name                          VARCHAR(60)      NOT NULL,
  birth_date                     VARCHAR(60)      NOT NULL,
  political_party                VARCHAR(60)      NOT NULL,
  birth_city                    VARCHAR(60)      NOT NULL,
  state                         VARCHAR(60)      NOT NULL,
  address                       VARCHAR(60)      NOT NULL,
  telephone                     VARCHAR(60)      NOT NULL,
  email                         VARCHAR(100)     NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO resumes (name,birth_date,political_party,birth_city,state,address,telephone,email) VALUES
('Cid Gomes','27/04/1963','PDT','Sobral - CE','CE','Senado Federal Anexo 1 10º Pavimento','(61) 3303-6460 / 6399','sen.cidgomes@senado.leg.br'),
('Eduardo Girão','25/09/1972','Podemos','Fortaleza - CE','CE','Senado Federal Anexo 2 Ala Teotônio Vilela Gabinete 21','(61) 3303-6677 / 6678 / 6679','sen.eduardogirao@senado.leg.br'),
('Tasso Jereissati','15/12/1948','PSDB','Fortaleza - CE','CE','Senado Federal Anexo 1 14º Pavimento','(61) 3303-4502 / 4503 / 4573','sen.tassojereissati@senado.leg.br');