CREATE TABLE stock (
   id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY NOT NULL,
   quantity INT NOT NULL,
   sku_id INT,
   CONSTRAINT fk_sku
         FOREIGN KEY(sku_id)
   	  REFERENCES skus(id)
);