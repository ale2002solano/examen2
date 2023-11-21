package hn.unah.lenguajes.examen2.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.modelos.TipoVehiculo;
import hn.unah.lenguajes.examen2.repositorios.TipoVehiculoRepositorio;
import hn.unah.lenguajes.examen2.servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{
    @Autowired
    private TipoVehiculoRepositorio tipoVehiculoRepositorio;
    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
       return tipoVehiculoRepositorio.save(tipoVehiculo);
    }
    
}
