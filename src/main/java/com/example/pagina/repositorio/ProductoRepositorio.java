package com.example.pagina.repositorio;

import com.example.pagina.entidades.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepositorio extends JpaRepository<Producto, Long>{
    
    @Query("SELECT p FROM Producto p WHERE"
            + " CONCAT(p.id, p.nombre, p.marca, p.hechoEn, p.precio)"
            + " LIKE %?1%")
    public List<Producto> findAll(String palabraClave);
    
    
    
}
