package ru.dan.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.dan.entities.Flat;
import ru.dan.entities.Flats;
import ru.dan.services.FlatService;

import java.util.List;

@Controller
@RequestMapping(value = "/Flat")
@Slf4j
public class FlatController {

    private final FlatService flatService;

    public FlatController(FlatService flatService) {
        this.flatService = flatService;
    }

    @RequestMapping(value = "/flats",method = RequestMethod.GET)
    @ResponseBody
    public Flats list() {
        Flats flats = new Flats();
        flats.setFlats(flatService.findAll());

        return flats;
    }

    @RequestMapping(value = "/flats/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Flat getFlatById(@PathVariable Long id) {
        return flatService.findById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Flat addNewFlat(@RequestBody Flat flat) {
        flatService.addNewFlat(flat);
        return flat;
    }

    @RequestMapping(value = "/flats/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Flat updateFlat(@PathVariable Long id, @RequestBody Flat flat){
        flatService.addNewFlat(flat);
        log.info("Flat #" + flat.getNumber()+ "and with id:" +flat.getId()+ "was updated!");
        return flat;
    }

    @RequestMapping(value = "/flats/{id}", method = RequestMethod.DELETE)
    public void deleteFlat(@PathVariable Long id) {
        Flat flat = flatService.findById(id);
        log.info("Deleting flat with id: " + id);
        flatService.deleteFlat(flat);

    }
}
