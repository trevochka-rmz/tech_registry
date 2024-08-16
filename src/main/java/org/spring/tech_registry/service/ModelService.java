package org.spring.tech_registry.service;

import org.spring.tech_registry.repository.ModelRepository;
import org.spring.tech_registry.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    @Autowired
    private ModelRepository modelRepository;

    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }

    public Model addModel(Model model) {
        return modelRepository.save(model);
    }

    public List<Model> filterModels(String color, double minPrice, double maxPrice) {
        return modelRepository.findByColorAndPriceBetween(color, minPrice, maxPrice);
    }
}