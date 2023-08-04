package com.api.productos.mypackages.service;

import com.api.productos.mypackages.converters.EmpleadoConverter;
import com.api.productos.mypackages.converters.ProductoConverter;
import com.api.productos.mypackages.entities.Empleado;
import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.EmpleadoModel;
import com.api.productos.mypackages.repositories.interfaces.I_EmpleadoRepository;
import com.api.productos.mypackages.repositories.interfaces.I_ProductoRepository;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EmpleadoService")
public class EmpleadoService {
    @Autowired
    @Qualifier("I_EmpleadoRepository")
    private I_EmpleadoRepository iEmpleadoRepository;
    @Autowired
    @Qualifier("EmpleadoConverter")
    private EmpleadoConverter empleadoConvertidor;
    //LOGS DE ERROR
    private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(EmpleadoService.class);
    public boolean agregarEmpleado(Empleado empleado) {

        try {
            if (empleado == null) {
                logger.error("ERROR AGREGAR_PRODUCTO: EL PRODUCTO ES NULO!");
                return false;
            }

            else {
                iEmpleadoRepository.save(empleado);
                return true;

            }
        }catch(Exception e) {
            logger.error("ERROR AGREGAR_EMPLEADO: EL EMPLEADO NO SE HA GUARDADO!");
            return false;
        }
    }

    public boolean eliminarEmpleado(int id) {
            try {
                if ((id == 0)) {
                    logger.error("ERROR ELIMINAR_EMPLEADO: EL ID DEL EMPLEADO ES 0!");
                    return false;
                }

                else {

                    Empleado idempleado = iEmpleadoRepository.findById(id);

                    iEmpleadoRepository.delete(idempleado);

                    return true;
                }


            }catch(Exception e) {
                logger.error("ERROR ELIMINAR_PRODUCTO: EL PRODUCTO NO SE HA ELIMINADO!");
                return false;

            }
        }

    public List<EmpleadoModel> listadoEmpleados(Pageable pageable) {
        return  empleadoConvertidor.convertirListaEmpleado( iEmpleadoRepository.findAll(pageable).getContent());
    }
}
