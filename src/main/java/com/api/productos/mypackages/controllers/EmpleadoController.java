package com.api.productos.mypackages.controllers;

import com.api.productos.mypackages.entities.Empleado;
import com.api.productos.mypackages.models.EmpleadoModel;
import com.api.productos.mypackages.models.ProductoModel;
import com.api.productos.mypackages.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/v1")
public class EmpleadoController {
    // ==========INYECCION DEL SERVICE==========
    @Autowired
    @Qualifier("EmpleadoService")
    EmpleadoService empleadoService;


    //Método POST— Agrega un empleado
    @PreAuthorize("hasRole('ADMINISTRADOR')")
    @PostMapping("/empleados")
    public boolean agregarEmpleado(@RequestBody @Validated Empleado empleado) {
        return empleadoService.agregarEmpleado(empleado);
    }
    // – Método DELETE — Excluir un empleado
    //localhost:8080/api/empleados/{idempleados}
    @PreAuthorize("hasRole('ADMINISTRADOR')")
    @DeleteMapping("/empleados/{idempleados}")
    public boolean eliminarEmpleado(@PathVariable("idempleados") int idempleados) {
        return empleadoService.eliminarEmpleado(idempleados);
    }
    //localhost:8080/api/empleados – Método GET — Lista de todos los empleado
    @GetMapping("/empleados")
    public List<EmpleadoModel> listadoEmpleados(Pageable pageable) {
        return empleadoService.listadoEmpleados(pageable);
    }
}
