package com.developer.warehousemanagement.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    @PrePersist
    public void prePersist() {
        this.createdOn = LocalDateTime.now();
        this.updatedOn = LocalDateTime.now();
        System.out.println("created on" + LocalDateTime.now());
    }
    @PreUpdate
    public void preUpdate() {
        this.updatedOn = LocalDateTime.now();
        System.out.println("updated on" + LocalDateTime.now());
    }

}
