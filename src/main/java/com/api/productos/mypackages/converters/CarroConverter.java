package com.api.productos.mypackages.converters;

import com.api.productos.mypackages.entities.Carro;
import com.api.productos.mypackages.entities.Empleado;
import com.api.productos.mypackages.models.CarroModel;
import com.api.productos.mypackages.models.EmpleadoModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("CarroConverter")
public class CarroConverter {
    public List<CarroModel> convertirListaCarro(List<Carro> list){

        List<CarroModel> listaModeloCarros = new ArrayList<>();

        list.forEach(objetoCarro -> listaModeloCarros.add(new CarroModel(objetoCarro)));

        return listaModeloCarros;

    }
}
