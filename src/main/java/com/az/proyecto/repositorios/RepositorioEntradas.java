package com.az.proyecto.repositorios;

import com.az.proyecto.entidades.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface RepositorioEntradas extends JpaRepository<Entrada,Integer> {
}
