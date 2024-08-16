package org.spring.tech_registry.controller;

import org.spring.tech_registry.model.Equipment;
import org.spring.tech_registry.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping
    public List<Equipment> getAllEquipment() {
        return equipmentService.getAllEquipment();
    }

    @PostMapping
    public Equipment addEquipment(@RequestBody Equipment equipment) {
        return equipmentService.addEquipment(equipment);
    }

    @GetMapping("/search")
    public List<Equipment> searchByName(@RequestParam String name) {
        return equipmentService.searchByName(name);
    }
}