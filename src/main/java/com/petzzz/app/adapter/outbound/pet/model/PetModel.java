package com.petzzz.app.adapter.outbound.pet.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "Pet")
public class PetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private Boolean removed = false;
    @Column(nullable = false)
    private LocalDateTime creationDate = LocalDateTime.now();
    @Column(nullable = false, length = 50)
    private String name;
    @Column()
    private LocalDateTime birthday;
    @Column(nullable = false)
    private Integer age;
    @Column()
    private Double weight;
    @Column(length = 50)
    private String color;
    @Column()
    private String mainImageUrl;
}
