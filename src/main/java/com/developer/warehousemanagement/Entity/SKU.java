package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "SKU")
public abstract class SKU {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SKU ID")
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    private Type t;
    @Column(name = "SKU Expiration Date")
    private Date expirationDate;
    @Enumerated
    private Package p;
    @Column(name = "SKU Price")
    private float price;
    @Column(name = "SKU Length")
    private int length;
    @Column(name = "SKU Width")
    private int width;
    @Column(name = "SKU Height")
    private int height;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Load Unit ID")
     private LoadUnit l;

    protected SKU() {
    }

    public SKU(Long id, Type t, Date expirationDate, Package p, float price, int length, int width, int height, LoadUnit l) {
        this.id = id;
        this.t = t;
        this.expirationDate = expirationDate;
        this.p = p;
        this.price = price;
        this.length = length;
        this.width = width;
        this.height = height;
        this.l = l;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getT() {
        return t;
    }

    public void setT(Type t) {
        this.t = t;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Package getP() {
        return p;
    }

    public void setP(Package p) {
        this.p = p;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public LoadUnit getL() {
        return l;
    }

    public void setL(LoadUnit l) {
        this.l = l;
    }
}