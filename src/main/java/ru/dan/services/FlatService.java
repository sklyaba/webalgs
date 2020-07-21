package ru.dan.services;

import ru.dan.entities.Flat;

import java.util.List;

public interface FlatService {
    Flat addNewFlat(Flat flat);
    void deleteFlat(Flat flat);
    List<Flat> findAll();
    Flat findByNumber(int number);
    Flat findById(Long id);
    Flat findBySquare(int square);

}
