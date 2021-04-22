package org.gvozdetscky.springbootdocker.repository;

import org.gvozdetscky.springbootdocker.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * репозиторий для котиков {@link Cat}
 *
 * @author Egor Gvozdetscky
 */
public interface CatRepository extends JpaRepository<Cat, String> {

}
