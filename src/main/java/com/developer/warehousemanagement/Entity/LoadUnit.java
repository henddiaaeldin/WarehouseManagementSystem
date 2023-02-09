package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Load Unit")
public class LoadUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Load Unit ID")
    private Long Id;
    @Column(name = "Load Unit Status")
    private boolean status;
    @Column(name = "Load Unit Location")
    private String location;
    @Column(name = "Load Unit Capacity")
    private int Capacity;
    @Column(name = "Load Unit Length")
    private float length;
    @Column(name = "Load Unit Width")
    private float width;
    @Column(name = "Load Unit Height")
    private float height;
    @Enumerated(EnumType.ORDINAL)
    private LoadUnitType type;
    @ElementCollection
    @CollectionTable(
            name="Products",
            joinColumns=@JoinColumn(name="SKU ID")
    )
    private List<SKU> products=new ArrayList<SKU>();

    public LoadUnit() {
    }

    public LoadUnit(Long id, boolean status, String location, int capacity, float length, float width, float height, LoadUnitType type, List<SKU> products) {
        Id = id;
        this.status = status;
        this.location = location;
        Capacity = capacity;
        this.length = length;
        this.width = width;
        this.height = height;
        this.type = type;
        this.products = products;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public LoadUnitType getType() {
        return type;
    }

    public void setType(LoadUnitType type) {
        this.type = type;
    }

    public List<SKU> getProducts() {
        return products;
    }

    public void setProducts(List<SKU> products) {
        this.products = products;
    }
}
