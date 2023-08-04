package com.api.productos.mypackages.repositories.interfaces;

import com.api.productos.mypackages.entities.Carro;
import com.api.productos.mypackages.models.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import javax.persistence.Entity;

import java.io.Serializable;
import java.util.List;
@Repository("I_CarroRepository")
public interface I_CarroRepository extends JpaRepository<Carro, Serializable>, PagingAndSortingRepository<Carro, Serializable> {
    public abstract Carro findById(int id);
    //public abstract Page<Carro> findAll(Pageable pageable);
    public abstract List<Carro> findAll();
    //@Query("SELECT c FROM public.carro c,public.viaje v  WHERE v.carroid=c.id AND v.dataentrega IS NULL")


}
