package com.api.productos.mypackages.service;

import com.api.productos.mypackages.converters.CarroConverter;
import com.api.productos.mypackages.converters.ViajeConverter;
import com.api.productos.mypackages.models.CarroModel;
import com.api.productos.mypackages.models.ViajesModel;
import com.api.productos.mypackages.repositories.interfaces.I_CarroRepository;
import com.api.productos.mypackages.repositories.interfaces.I_ViajeRepository;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ViajeService")

public class ViajeService {
    @Autowired
    @Qualifier("I_ViajeRepository")
    private I_ViajeRepository iViajeRepository;
    @Autowired
    @Qualifier("ViajeConverter")
    private ViajeConverter viajeConverter;
    @Autowired
    @Qualifier("CarroConverter")
    private CarroConverter carroConverter;
    private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ViajeService.class);
    public List<CarroModel> listadoCarros(Pageable pageable) {
        return  carroConverter.convertirListaCarro( iViajeRepository.findCarrosDisponibles(pageable));
    }


}
