package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Inventory ID")
    private Long id;
    @ElementCollection
    private List<SKU> expiredSku=new ArrayList<SKU>();
    @Column(name = "Inventory Date")
private Date date;
    @ElementCollection
    @Embedded
    private List<Stock> products=new ArrayList<Stock>();

    public Inventory() {
    }

    public Inventory(Long id, List<SKU> expiredSku, Date date, List<Stock> products) {
        this.id = id;
        this.expiredSku = expiredSku;
        this.date = date;
        this.products = products;
    }

    public List<Stock> getProducts() {
        return products;
    }

    public void setProducts(List<Stock> products) {
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SKU> getExpiredSku() {
        return expiredSku;
    }

    public void setExpiredSku(List<SKU> expiredSku) {
        this.expiredSku = expiredSku;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
