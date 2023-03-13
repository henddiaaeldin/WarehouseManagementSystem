package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "loadunits")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoadUnit extends BaseEntity {

    @Column(name = "status")
    private boolean status;
    @Column(name = "location")
    private String location;
    @Column(name = "capacity")
    private int Capacity;
    @Column(name = "length")
    private float length;
    @Column(name = "width")
    private float width;
    @Column(name = "height")
    private float height;
    @Enumerated(EnumType.ORDINAL)
    private LoadUnitType type;
    @OneToMany
    @JoinColumn(name = "sku_id")
    private List<SKU> products=new ArrayList<SKU>();

}
