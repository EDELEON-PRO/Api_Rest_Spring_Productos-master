package com.api.productos.mypackages.service;

import com.api.productos.mypackages.converters.CarroConverter;
import com.api.productos.mypackages.converters.EmpleadoConverter;
import com.api.productos.mypackages.entities.Carro;
import com.api.productos.mypackages.entities.Empleado;
import com.api.productos.mypackages.models.CarroModel;
import com.api.productos.mypackages.models.EmpleadoModel;
import com.api.productos.mypackages.repositories.interfaces.I_CarroRepository;
import com.api.productos.mypackages.repositories.interfaces.I_EmpleadoRepository;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CarroService")
public class CarroService {
    @Autowired
    @Qualifier("I_CarroRepository")
    private I_CarroRepository iCarroRepository;
    @Autowired
    @Qualifier("CarroConverter")
    private CarroConverter carroConverter;
    //LOGS DE ERROR
    private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(CarroService.class);
    public boolean agregarCarro(Carro carro) {

        try {
            if (carro == null) {
                logger.error("ERROR AGREGAR_CARRO: EL CARRO ES NULO!");
                return false;
            }

            else {
                iCarroRepository.save(carro);
                return true;

            }
        }catch(Exception e) {
            logger.error("ERROR AGREGAR_CARRO: EL CARRO NO SE HA GUARDADO!");
            return false;
        }
    }

    public boolean eliminarCarro(int id) {
        try {
            if ((id == 0)) {
                logger.error("ERROR ELIMINAR_CARRO: EL ID DEL CARRO ES 0!");
                return false;
            }

            else {

                Carro carro = iCarroRepository.findById(id);

                iCarroRepository.delete(carro);

                return true;
            }


        }catch(Exception e) {
            logger.error("ERROR ELIMINAR_CARRO: EL CARRO NO SE HA ELIMINADO!");
            return false;

        }
    }

    public List<CarroModel> listadoCarros(Pageable pageable) {
        return  carroConverter.convertirListaCarro( iCarroRepository.findAll(pageable).getContent());
    }
    /*public List<CarroModel> retiradosCarros(Pageable pageable) {
        return  carroConverter.convertirListaCarro( iCarroRepository.retiradosCarros());
    }*/


}
