CREATE TYPE LoadUnitType AS ENUM ('shelf', 'box', 'unit');
CREATE TABLE loadunits (
   id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY NOT NULL,
   status BOOLEAN NOT NULL,
   location VARCHAR(50) NOT NULL,
   capacity INT NOT NULL,
   length DECIMAL(3) NOT NULL,
   width DECIMAL(3) NOT NULL,
   height DECIMAL(3) NOT NULL
);