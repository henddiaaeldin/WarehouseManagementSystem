CREATE TABLE orders (
   id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY NOT NULL,
   order_date DATE NOT NULL,
   total_quantity INT NOT NULL,
   total_cost NUMERIC (5, 2),
   customer_id INT,
   CONSTRAINT fk_customer
         FOREIGN KEY(customer_id)
   	  REFERENCES customers(id)
);