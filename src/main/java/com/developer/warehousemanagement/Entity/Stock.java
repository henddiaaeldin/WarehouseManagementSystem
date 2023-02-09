package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;

@Embeddable
@Table(name = "Stock")
public class Stock {
    @ManyToOne
    @JoinColumn(name = "SKU Id")
    private SKU sku;
    @Column(name = "Item Quantity")
    private int quantity;

    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }

    public Stock() {
    }

    public Stock(SKU sku, int quantity) {
        this.sku = sku;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
