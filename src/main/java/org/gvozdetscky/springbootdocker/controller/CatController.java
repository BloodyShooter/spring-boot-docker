package org.gvozdetscky.springbootdocker.controller;

import lombok.RequiredArgsConstructor;
import org.gvozdetscky.springbootdocker.entity.Cat;
import org.gvozdetscky.springbootdocker.model.CatModel;
import org.gvozdetscky.springbootdocker.service.CatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Egor Gvozdetscky
 */
@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @PostMapping
    public Cat save(@RequestBody CatModel cat) {
        return catService.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }
}
