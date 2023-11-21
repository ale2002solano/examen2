package hn.unah.lenguajes.examen2.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.modelos.TipoCliente;
import hn.unah.lenguajes.examen2.repositorios.TipoClienteRepositorio;
import hn.unah.lenguajes.examen2.servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{
    @Autowired
    private TipoClienteRepositorio tipoClienteRepositorio;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente nuevoTipoCliente = new TipoCliente();
        nuevoTipoCliente.setDescripcion(descripcion);
       return tipoClienteRepositorio.save(nuevoTipoCliente);
    }
    
}
