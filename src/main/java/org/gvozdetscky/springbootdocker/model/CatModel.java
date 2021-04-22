package org.gvozdetscky.springbootdocker.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * REST модель котика
 *
 * @author Egor Gvozdetscky
 */
@Data
public class CatModel {

    private String name;

    private LocalDate birthDay;
}
