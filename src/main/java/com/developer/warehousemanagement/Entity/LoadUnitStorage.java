package com.developer.warehousemanagement.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter @NoArgsConstructor
@AllArgsConstructor
@Table(name = "loadunitstorage")
public class LoadUnitStorage extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "sku_id")
    private SKU sku;
    @OneToOne
    @JoinColumn(name = "loadunit_id")
    private LoadUnit loadUnit;
    @Column(name = "max_quantity")
    private int maxQuantity;
    @Column(name = "orientation")
    private String orientation;


}
