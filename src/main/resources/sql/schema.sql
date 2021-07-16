CREATE TABLE IF NOT EXISTS resumes (
  id                            int(3)           unsigned auto_increment,
  name                          VARCHAR(60)      NOT NULL,
  birthdate                     VARCHAR(60)      NOT NULL,
  politicalParty                VARCHAR(60)      NOT NULL,
  localBirth                    VARCHAR(60)      NOT NULL,
  address                       VARCHAR(60)      NOT NULL,
  telephone                     VARCHAR(60)      NOT NULL,
  email                         VARCHAR(100)     NOT NULL,
  PRIMARY KEY (id)
);

--INSERT INTO resumes (name) VALUES
--('Cid Gomes'),
--('Eduardo Girão'),
--('Tasso Jereissati');