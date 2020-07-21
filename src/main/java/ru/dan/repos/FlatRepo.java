package ru.dan.repos;

import org.springframework.data.repository.CrudRepository;
import ru.dan.entities.Flat;

public interface FlatRepo extends CrudRepository<Flat, Long> {
    Flat findByNumber(int number);
    Flat findBySquare(int square);

}
