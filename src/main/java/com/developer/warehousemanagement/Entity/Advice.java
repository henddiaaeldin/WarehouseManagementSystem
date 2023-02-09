package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Admittance")
public class Advice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Admittance Id")
    private Long id;
    @Column(name = "Admittance Date")
    private Date date;
    @OneToOne
    @JoinColumn(name = "Customer ID")
    private Supplier supplier;
    @ElementCollection
    @CollectionTable(
            name="Products",
            joinColumns=@JoinColumn(name="SKU ID")
    )
    private List<SKU> products=new ArrayList<SKU>();

    @Column(name = "Admittance Quantity")
    private int quantity;

    public Advice() {
    }

    public Advice(Long id, Date date, Supplier supplier, List<SKU> products, int quantity) {
        this.id = id;
        this.date = date;
        this.supplier = supplier;
        this.products = products;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<SKU> getProducts() {
        return products;
    }

    public void setProducts(List<SKU> products) {
        this.products = products;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
