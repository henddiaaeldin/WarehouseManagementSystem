package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;

@Entity
public class LoadUnitStorage {
    @EmbeddedId
    LoadUnitStorageKey id;


    @OneToOne
    @MapsId("SKUID")
    @JoinColumn(name = "SKU ID")
    SKU sku;

    @OneToOne
    @MapsId("loadUnitID")
    @JoinColumn(name = "Load Unit ID")
    LoadUnit loadunit;

    @Column(name = "Load Unit Max Quantity")
    private int maxQuantity;
    @Column(name = "Load Unit Orientation")
    private String orientation;

    public LoadUnitStorage() {
    }

    public LoadUnitStorage(LoadUnitStorageKey id, SKU sku, LoadUnit loadunit, int maxQuantity, String orientation) {
        this.id = id;
        this.sku = sku;
        this.loadunit = loadunit;
        this.maxQuantity = maxQuantity;
        this.orientation = orientation;
    }


    public LoadUnitStorageKey getId() {
        return id;
    }

    public void setId(LoadUnitStorageKey id) {
        this.id = id;
    }


    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }

    public LoadUnit getLoadunit() {
        return loadunit;
    }

    public void setLoadunit(LoadUnit loadunit) {
        this.loadunit = loadunit;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}
