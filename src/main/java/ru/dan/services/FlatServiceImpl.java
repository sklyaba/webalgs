package ru.dan.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dan.entities.Flat;
import ru.dan.repos.FlatRepo;

import java.util.List;

@Service("flatService")
@Slf4j
@Transactional
public class FlatServiceImpl implements FlatService {

    private final FlatRepo flatRepo;

    @Autowired
    public FlatServiceImpl(FlatRepo flatRepo) {
        this.flatRepo = flatRepo;
        log.info("Repo initialized on FlatService");
    }


    @Override
    public Flat addNewFlat(Flat flat) {
        return flatRepo.save(flat);
    }

    @Override
    public void deleteFlat(Flat flat) {
        flatRepo.delete(flat);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Flat> findAll() {
        return (List<Flat>) flatRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Flat findByNumber(int number) {
        return flatRepo.findByNumber(number);
    }

    @Override
    @Transactional(readOnly = true)
    public Flat findById(Long id) {
        return flatRepo.findById(id).get();
    }

    @Override
    @Transactional(readOnly = true)
    public Flat findBySquare(int square) {
        return flatRepo.findBySquare(square);
    }
}
