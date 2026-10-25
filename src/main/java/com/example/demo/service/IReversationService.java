package com.example.demo.service;

import com.example.demo.entities.Reservation;

import java.util.List;

public interface IReversationService {

    List<Reservation> retrieveAllReservations();

    Reservation retrieveReservation(String reservationId);

    Reservation addReservation(Reservation reservation);

    void removeReservation(String reservationId);

    Reservation modifyReservation(Reservation reservation);
}
