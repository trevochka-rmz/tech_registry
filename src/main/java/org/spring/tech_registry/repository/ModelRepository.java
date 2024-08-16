package org.spring.tech_registry.repository;
import org.spring.tech_registry.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> findByColorAndPriceBetween(String color, double minPrice, double maxPrice);
    List<Model> findByEquipmentTypeAndColorAndPriceBetween(String equipmentType, String color, double minPrice, double maxPrice);
}
