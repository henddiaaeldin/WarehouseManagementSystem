CREATE TABLE inventory (
   id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY NOT NULL,
   admittance_date DATE NOT NULL,
   sku_id INT,
   CONSTRAINT fk_sku
         FOREIGN KEY(sku_id)
   	  REFERENCES skus(id)
);