CREATE TABLE loadunitstorage (
   id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY NOT NULL,
   max_quantity INT NOT NULL,
   orientation VARCHAR(50) NOT NULL,
   loadunit_id INT,
   sku_id INT,
   CONSTRAINT fk_loadunit
         FOREIGN KEY(loadunit_id)
   	  REFERENCES loadunits(id),
   CONSTRAINT fk_sku
         FOREIGN KEY(sku_id)
      REFERENCES skus(id)
    );