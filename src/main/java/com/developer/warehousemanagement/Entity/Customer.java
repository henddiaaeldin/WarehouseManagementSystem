package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer ID")
    private Long id;
    @Column(name = "Customer Name")
    private String name;
    @Column(name = "Customer Number")
    private int number;
    @Column(name = "Customer Address")
    private String address;

    public Customer() {
    }

    public Customer(Long id, String name, int number, String address) {
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
