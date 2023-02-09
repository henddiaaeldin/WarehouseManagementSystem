package com.developer.warehousemanagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class LoadUnitStorageKey implements Serializable {
    @Column(name = "SKU ID")
    long SKUID;

    @Column(name = "Load Unit ID")
    long loadUnitID;

    public LoadUnitStorageKey() {
    }

    public LoadUnitStorageKey(long SKUID, long loadUnitID) {
        this.SKUID = SKUID;
        this.loadUnitID = loadUnitID;
    }

}
