package com.az.proyecto.repositorios;

import com.az.proyecto.entidades.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositorioVehiculos extends JpaRepository<Vehiculo,String> {
}
