package org.spring.tech_registry.service;

import org.spring.tech_registry.model.Equipment;
import org.spring.tech_registry.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    @Autowired
    private EquipmentRepository equipmentRepository;

    public List<Equipment> getAllEquipment() {
        return equipmentRepository.findAll();
    }

    public Equipment addEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public List<Equipment> searchByName(String name) {
        return equipmentRepository.findByNameContainingIgnoreCase(name);
    }
}