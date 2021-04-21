CREATE TABLE IF NOT EXISTS meals (
    id                     bigserial CONSTRAINT meals_pk PRIMARY KEY,
    productname            VARCHAR(255) NOT NULL,
    calories               int4 NOT NULL,
    quantity               int4 NOT NULL
);