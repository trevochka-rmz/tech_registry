package org.spring.tech_registry.controller;

import org.spring.tech_registry.service.ModelService;
import org.spring.tech_registry.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class ModelController {
    @Autowired
    private ModelService modelService;

    @GetMapping
    public List<Model> getAllModels() {
        return modelService.getAllModels();
    }

    @PostMapping
    public Model addModel(@RequestBody Model model) {
        return modelService.addModel(model);
    }

    @GetMapping("/filter")
    public List<Model> filterModels(@RequestParam String color, @RequestParam double minPrice, @RequestParam double maxPrice) {
        return modelService.filterModels(color, minPrice, maxPrice);
    }
}