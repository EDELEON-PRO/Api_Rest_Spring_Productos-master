package com.api.productos.mypackages.repositories.interfaces;

import com.api.productos.mypackages.entities.Empleado;
import com.api.productos.mypackages.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
@Repository("I_EmpleadoRepository")
public interface I_EmpleadoRepository extends JpaRepository<Empleado, Serializable>, PagingAndSortingRepository<Empleado, Serializable> {
    public abstract Empleado findById(int id);
    //public abstract Page<Empleado> findAll(Pageable pageable);
    public abstract List<Empleado> findAll();
}
