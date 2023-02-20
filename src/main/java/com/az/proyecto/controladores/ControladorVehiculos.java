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
    ServicioVehiculos servVehiculos;

    public ControladorVehiculos(RepositorioVehiculos repoVehiculos,
                                ServicioVehiculos servVehiculos) {
        this.repoVehiculos = repoVehiculos;
        this.servVehiculos = servVehiculos;
    }

    @GetMapping("vehiculos")
    public List<Vehiculo> getTodos() {
        return this.repoVehiculos.findAll();
    }

    @GetMapping("vehiculos/{placas}")
    public ResponseEntity<Vehiculo> getPorPlacas(
            @PathVariable("placas") String p
    ) {
        LOGGER.debug("GET vehiculos placas:{}", p);
        Optional<Vehiculo> opv = this.repoVehiculos.findById(p);
        if (opv.isPresent()) {
            return ResponseEntity.ok(opv.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
