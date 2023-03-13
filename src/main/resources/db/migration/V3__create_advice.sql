CREATE TABLE admittances (
   id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY NOT NULL,
   admittance_date DATE NOT NULL,
   quantity INT NOT NULL,
   supplier_id INT,
   CONSTRAINT fk_supplier
         FOREIGN KEY(supplier_id)
   	  REFERENCES suppliers(id)
);