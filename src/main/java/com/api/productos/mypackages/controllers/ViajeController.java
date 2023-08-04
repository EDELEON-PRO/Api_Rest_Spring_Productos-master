package com.api.productos.mypackages.controllers;

import com.api.productos.mypackages.models.CarroModel;
import com.api.productos.mypackages.service.CarroService;
import com.api.productos.mypackages.service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ViajeController {
    @Autowired
    @Qualifier("ViajeService")
    ViajeService viajeService;
    @Qualifier("CarroService")
    CarroService carroService;
    @GetMapping("/retirados")
    public List<CarroModel> listadoCarros(Pageable pageable) {
        return viajeService.listadoCarros(pageable);
    }

}
