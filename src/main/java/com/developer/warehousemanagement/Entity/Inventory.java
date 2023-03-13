package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "inventory")
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
public class Inventory extends BaseEntity {

    @Column(name = "admittance_date")
    private Date date;

    @ElementCollection
    private List<SKU> expiredSku=new ArrayList<SKU>();

    @ElementCollection
    @Embedded
    private List<Stock> products=new ArrayList<Stock>();



}
