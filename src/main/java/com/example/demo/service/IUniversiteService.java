package com.example.demo.service;

import com.example.demo.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    List<Universite> retrieveAllUniversites();

    Universite retrieveUniversite(Long universiteId);

    Universite addUniversite(Universite universite);

    void removeUniversite(Long universiteId);

    Universite modifyUniversite(Universite universite);
}
