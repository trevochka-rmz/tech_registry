package org.spring.tech_registry.repository;

import org.spring.tech_registry.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    List<Equipment> findByNameContainingIgnoreCase(String name);
}