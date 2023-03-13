package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "skus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class SKU extends BaseEntity {
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type")
    private Type type;
    @Column(name = "expiration_date")
    private Date expirationDate;
    @Enumerated
    @Column(name = "package")
    private Package skuPackage;
    @Column(name = "price")
    private float price;
    @Column(name = "length")
    private float len;
    @Column(name = "width")
    private float width;
    @Column(name = "height")
    private float height;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loadunit_id")
    private LoadUnit l;

}