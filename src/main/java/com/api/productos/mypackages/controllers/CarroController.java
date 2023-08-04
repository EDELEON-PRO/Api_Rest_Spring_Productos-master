package com.api.productos.mypackages.controllers;

import com.api.productos.mypackages.entities.Carro;
import com.api.productos.mypackages.entities.Empleado;
import com.api.productos.mypackages.models.CarroModel;
import com.api.productos.mypackages.models.EmpleadoModel;
import com.api.productos.mypackages.service.CarroService;
import com.api.productos.mypackages.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CarroController {
    @Autowired
    @Qualifier("CarroService")
    CarroService carroService;

    //localhost:8080/api/carros – Método POST— Agrega un carro
    @PreAuthorize("hasRole('ADMINISTRADOR')")
    @PostMapping("/carros")
    public boolean agregarCarro(@RequestBody @Validated Carro carro) {
        return carroService.agregarCarro(carro);
    }
    //localhost:8080/api/carros/{idCarro} – Método DELETE — borra un carro
    @PreAuthorize("hasRole('ADMINISTRADOR')")
    @DeleteMapping("/carros/{idCarro}")
    public boolean eliminarCarro(@PathVariable("idCarro") int idCarro) {
        return carroService.eliminarCarro(idCarro);
    }

    //localhost:8080/api/carros– Método GET — Lista de todos los carros
    @GetMapping("/carros")
    public List<CarroModel> listadoCarros(Pageable pageable) {
        return carroService.listadoCarros(pageable);
    }
    //localhost:8080/api/carros/retirados – Método GET — Lista de carros que están en uso

    /*@GetMapping("/retirados")
    public List<CarroModel> retiradosCarros() {
        return carroService.retiradosCarros();
    }*/
}
