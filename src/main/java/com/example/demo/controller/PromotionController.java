package com.example.demo.controller;


import org.openapitools.api.PetsApi;
import org.openapitools.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PromotionController implements PetsApi {

    @Override
    public ResponseEntity<Void> createPets() {
        return PetsApi.super.createPets();
    }

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit) {
        return PetsApi.super.listPets(limit);
    }

    @Override
    public ResponseEntity<Pet> showPetById(String petId) {
        return PetsApi.super.showPetById(petId);
    }
}
