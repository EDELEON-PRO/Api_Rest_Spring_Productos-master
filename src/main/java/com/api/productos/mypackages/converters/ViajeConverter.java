package com.api.productos.mypackages.converters;

import com.api.productos.mypackages.entities.Carro;
import com.api.productos.mypackages.entities.Viaje;
import com.api.productos.mypackages.models.CarroModel;
import com.api.productos.mypackages.models.ViajesModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("ViajeConverter")
public class ViajeConverter {
    public List<ViajesModel> convertirListaViaje(List<Viaje> list){

        List<ViajesModel> listaModeloViajes = new ArrayList<>();

        list.forEach(objetoCarro -> listaModeloViajes.add(new ViajesModel(objetoCarro)));

        return listaModeloViajes;

    }
}
