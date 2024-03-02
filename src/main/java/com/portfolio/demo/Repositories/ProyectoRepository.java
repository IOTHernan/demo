package com.portfolio.demo.Repositories;

import com.portfolio.demo.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
}
