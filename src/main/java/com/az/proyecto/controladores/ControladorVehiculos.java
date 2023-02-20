package com.az.proyecto.controladores;

import com.az.proyecto.entidades.Vehiculo;
import com.az.proyecto.repositorios.RepositorioVehiculos;
import com.az.proyecto.servicios.ServicioVehiculos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
public class ControladorVehiculos {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControladorVehiculos.class);
    RepositorioVehiculos repoVehiculos;

    public ControladorVehiculos(RepositorioVehiculos repoVehiculos) {
        this.repoVehiculos = repoVehiculos;
    }

    @GetMapping("vehiculos")
    public List<Vehiculo> getTodos() {
        LOGGER.debug("GET vehiculos");
        return this.repoVehiculos.findAll();
    }

    @GetMapping(value="vehiculos", params={"k1","k2"})
    public List<Vehiculo> getPorRangoKilometraje(
            @RequestParam("k1") Double k1,
            @RequestParam("k2") Double k2
    ) {
        LOGGER.debug("GET porKilometraje: {}, {}", k1, k2);
        return this.repoVehiculos.buscarPorKilometraje(k1,k2);
    }
}
