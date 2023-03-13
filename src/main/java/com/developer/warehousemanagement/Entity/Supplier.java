package com.developer.warehousemanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Supplier extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "number")
    private int number;
    @OneToMany
    @JoinColumn(name = "address_id")
    private List<Address> addresses=new ArrayList<Address>();


}
