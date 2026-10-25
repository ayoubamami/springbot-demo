package com.example.demo.service;

import com.example.demo.entities.Bloc;

import java.util.List;

public interface IBlocService {

    List<Bloc> retrieveAllBlocs();

    Bloc retrieveBloc(Long blocId);

    Bloc addBloc(Bloc bloc);

    void removeBloc(Long blocId);

    Bloc modifyBloc(Bloc bloc);
}
