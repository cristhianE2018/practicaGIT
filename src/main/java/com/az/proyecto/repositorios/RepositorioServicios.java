package com.az.proyecto.repositorios;

import com.az.ejemplobddos.entidades.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioServicios extends JpaRepository<Servicio,Integer> {
}
