
CREATE TYPE type AS ENUM ('pen', 'tissue');
CREATE TYPE package AS ENUM ('single', 'packet', 'cartoon');
CREATE TABLE skus (
   id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY NOT NULL,
   type type NOT NULL,
   expiration_date DATE NOT NULL,
   package package NOT NULL,
   price DECIMAL(3) NOT NULL,
   length DECIMAL(3) NOT NULL,
   width DECIMAL(3) NOT NULL,
   height DECIMAL(3) NOT NULL,
   loadunit_id INT,
   admittance_id INT,
   CONSTRAINT fk_loadunit
         FOREIGN KEY(loadunit_id)
   	  REFERENCES loadunits(id),
   CONSTRAINT fk_admittance
         FOREIGN KEY(admittance_id)
      REFERENCES admittances(id)
    );