package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer ID")
    private Customer customer;
    @ElementCollection
    @Embedded
    private List<OrderItem> products=new ArrayList<OrderItem>();
    @Column(name = "Total Quantity")
    private int totalQuantity;
    @Column(name = "Total Cost")
    private double totalCost;
    @Column(name = "Date of Order")
    private Date dateOfOrder;

    public Orders() {
    }

    public Orders(Long id, Customer customer, List<OrderItem> products, int totalQuantity, double totalCost, Date dateOfOrder) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.totalQuantity = totalQuantity;
        this.totalCost = totalCost;
        this.dateOfOrder = dateOfOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getProducts() {
        return products;
    }

    public void setProducts(List<OrderItem> products) {
        this.products = products;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
}
