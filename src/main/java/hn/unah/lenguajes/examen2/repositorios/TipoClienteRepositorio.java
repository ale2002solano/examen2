package hn.unah.lenguajes.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.examen2.modelos.TipoCliente;

public interface TipoClienteRepositorio extends JpaRepository<TipoCliente,Integer>{
    
}
