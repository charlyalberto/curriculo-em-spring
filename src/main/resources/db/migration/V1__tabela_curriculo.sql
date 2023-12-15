CREATE TABLE resume (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    idade INT,
    email VARCHAR(255) NOT NULL,
    numTelefone INT,
    cargoAtual VARCHAR(255),
    anosExp INT,
    formacaoAcademica VARCHAR(255),
    habilidades VARCHAR(255)
);