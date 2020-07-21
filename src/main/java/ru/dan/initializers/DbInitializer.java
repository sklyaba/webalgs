package ru.dan.initializers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dan.entities.Flat;
import ru.dan.services.FlatService;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class DbInitializer {

    private final FlatService flatService;

    @Autowired
    public DbInitializer(FlatService flatService) {
        this.flatService = flatService;
    }

    @PostConstruct
    public void initialize() {
        log.info("Started flat finalizing...");

        Flat flat1 = new Flat();
        flat1.setAddress("Moscow, 1");
        flat1.setNumber(1);
        flat1.setSquare(33);
        flatService.addNewFlat(flat1);

        Flat flat2 = new Flat();
        flat2.setAddress("Kazan, 1");
        flat2.setNumber(2);
        flat2.setSquare(44);
        flatService.addNewFlat(flat2);

        Flat flat3 = new Flat();
        flat3.setAddress("Ekaterinburg, 3");
        flat3.setNumber(3);
        flat3.setSquare(64);
        flatService.addNewFlat(flat3);

        Flat flat4 = new Flat();
        flat4.setAddress("St. Petersburg, 4");
        flat4.setNumber(4);
        flat4.setSquare(53);
        flatService.addNewFlat(flat4);

    }
}
