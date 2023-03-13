package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address extends BaseEntity {
    @Column(name = "building_number")
    private int buildingNumber;
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "district")
    private String district;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;

    @Transient
    private String fullAddress;

    @PostLoad
    public void postLoad() {
       fullAddress = buildingNumber + streetName + district + city + country;
    }


}
