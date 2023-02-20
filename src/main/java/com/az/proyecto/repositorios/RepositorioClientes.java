package com.az.proyecto.repositorios;

import com.az.proyecto.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositorioClientes extends JpaRepository<Cliente,Integer> {
    List<Cliente> findByNombreContaining(String cadena);
    List<Cliente> findByNombreStartingWithIgnoreCase(String cadena);
}
