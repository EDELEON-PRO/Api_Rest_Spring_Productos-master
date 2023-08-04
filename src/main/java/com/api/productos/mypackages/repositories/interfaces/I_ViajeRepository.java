package com.api.productos.mypackages.repositories.interfaces;

import com.api.productos.mypackages.entities.Carro;
import com.api.productos.mypackages.entities.Viaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

import java.util.List;
import org.springframework.data.domain.Pageable;

import javax.persistence.*;

@Repository("I_ViajeRepository")
public interface I_ViajeRepository extends JpaRepository<Viaje, Serializable>, PagingAndSortingRepository<Viaje, Serializable> {
    public abstract Viaje findById(int id);
    public abstract List<Viaje> findAll();
    //EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("JPA_DEMO");//
    //EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
    //@Transactional(readOnly = true)
    @Query(value = "SELECT c FROM carro c,viaje v WHERE v.carroid=c.id and v.dataentrega IS NULL",nativeQuery = true)
    List<Carro> findCarrosDisponibles(Pageable pageable);

    /*public default List<Carro> findCarrosDisponibles(Pageable pageable) {
        TypedQuery<Carro> consulta= em.createQuery("select p from carro p",Carro.class);
        return consulta.getResultList();
    }*/

}

