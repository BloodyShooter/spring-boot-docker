package org.gvozdetscky.springbootdocker.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.gvozdetscky.springbootdocker.entity.Cat;
import org.gvozdetscky.springbootdocker.model.CatModel;
import org.gvozdetscky.springbootdocker.repository.CatRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Egor Gvozdetscky
 */
@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public Cat save(CatModel catModel) {
        Cat cat = new Cat()
                .setId(UUID.randomUUID().toString())
                .setName(catModel.getName())
                .setBirthDay(catModel.getBirthDay())
                .setSysCreateTime(LocalDateTime.now());

        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }

}
