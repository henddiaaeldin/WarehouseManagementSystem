package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "admittance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Advice extends BaseEntity {

    @Column(name = "admittance_date")
    private Date date;
    @OneToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @OneToMany
    @JoinColumn(name = "sku_id")
    private List<SKU> products=new ArrayList<SKU>();

    @Column(name = "quantity")
    private int quantity;

}
