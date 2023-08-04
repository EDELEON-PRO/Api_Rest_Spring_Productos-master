package com.api.productos.mypackages.converters;
import com.api.productos.mypackages.entities.Empleado;
import  com.api.productos.mypackages.models.EmpleadoModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("EmpleadoConverter")
public class EmpleadoConverter {
    public List<EmpleadoModel> convertirListaEmpleado(List<Empleado> list){

        List<EmpleadoModel> listaModeloEmpleados = new ArrayList<>();

        list.forEach(objetoEmpleado -> listaModeloEmpleados.add(new EmpleadoModel(objetoEmpleado)));

        return listaModeloEmpleados;

    }
}
