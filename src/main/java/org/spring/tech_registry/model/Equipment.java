package org.spring.tech_registry.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String countryOfOrigin;
    private String manufacturer;
    private boolean onlineOrderAvailable;
    private boolean installmentAvailable;

    @OneToMany(mappedBy = "equipment", cascade = CascadeType.ALL)
    private List<Model> models;

    // Getters and Setters
}
