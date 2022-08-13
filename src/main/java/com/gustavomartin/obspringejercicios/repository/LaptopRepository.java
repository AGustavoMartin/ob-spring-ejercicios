package com.gustavomartin.obspringejercicios.repository;

import com.gustavomartin.obspringejercicios.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
