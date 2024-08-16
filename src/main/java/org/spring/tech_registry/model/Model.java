package org.spring.tech_registry.model;

import jakarta.persistence.*;

@Entity
@Table(name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String serialNumber;
    private String color;
    private String size;
    private double price;
    private boolean available;

    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;
    private String category;
    private String technology;
    private double dustBagVolume;
    private int modes;
    private int doors;
    private String compressorType;
    private int memory;
    private int cameras;
    private String processorType;


}