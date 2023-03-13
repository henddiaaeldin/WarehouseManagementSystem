package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stock")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stock extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "sku_id")
    private SKU sku;
    @Column(name = "item_quantity")
    private int quantity;


}
