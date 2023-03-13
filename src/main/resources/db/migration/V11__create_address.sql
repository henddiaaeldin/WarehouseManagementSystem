CREATE TABLE addresses (
   id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY NOT NULL,
   building_number INT NOT NULL,
   street_name VARCHAR(50) NOT NULL,
   district VARCHAR(50) NOT NULL,
   city VARCHAR(50) NOT NULL,
   country VARCHAR(50) NOT NULL,
   supplier_id INT,
      CONSTRAINT fk_supplier
            FOREIGN KEY(supplier_id)
      	  REFERENCES suppliers(id),
      	  customer_id INT,
                CONSTRAINT fk_customer
                      FOREIGN KEY(customer_id)
                	  REFERENCES customers(id)
);