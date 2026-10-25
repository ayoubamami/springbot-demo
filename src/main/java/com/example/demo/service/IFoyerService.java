package com.example.demo.service;

import com.example.demo.entities.Foyer;

import java.util.List;

public interface IFoyerService {

    List<Foyer> retrieveAllFoyers();

    Foyer retrieveFoyer(Long foyerId);

    Foyer addFoyer(Foyer foyer);

    void removeFoyer(Long foyerId);

    Foyer modifyFoyer(Foyer foyer);
}
