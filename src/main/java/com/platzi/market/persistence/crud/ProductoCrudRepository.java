package com.platzi.market.persistence.crud;


import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // Se pueden hacer de manera nativa
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    // Ó usar los Query Methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}



