package com.example.demo.service;

import com.example.demo.entities.Chambre;

public interface IChambreService {

    public List<Chambre> retrieveAllChambres();

    public Chambre retrieveChambre(Long chambreId);

    public Chambre addChambre(Chambre c);

    public void removeChambre(Long chambreId);

    public Chambre modifyChambre(Chambre chambre);

}
