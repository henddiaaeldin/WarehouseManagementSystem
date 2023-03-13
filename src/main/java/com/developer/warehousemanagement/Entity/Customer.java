package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter @NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "number")
    private int number;

    @OneToMany
    @JoinColumn(name = "address_id")
    private List<Address> addresses=new ArrayList<Address>();

}
