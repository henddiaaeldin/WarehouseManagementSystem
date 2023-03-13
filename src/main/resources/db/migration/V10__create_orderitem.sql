CREATE TABLE order_items (
   id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY NOT NULL,
   item_quantity INT NOT NULL,
   sku_id INT,
   CONSTRAINT fk_sku
         FOREIGN KEY(sku_id)
   	  REFERENCES skus(id)
);