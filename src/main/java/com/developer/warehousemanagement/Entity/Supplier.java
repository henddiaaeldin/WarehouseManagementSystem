package com.developer.warehousemanagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Supplier")
public class Supplier {
    @Id
    @Column(name = "Supplier ID")
    private Long id;
    @Column(name = "Supplier Name")
    private String name;
    @Column(name = "Supplier Number")
    private int number;
    @Column(name = "Supplier address")
    private String address;

    public Supplier() {
    }

    public Supplier(Long id, String name, int number, String address) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
