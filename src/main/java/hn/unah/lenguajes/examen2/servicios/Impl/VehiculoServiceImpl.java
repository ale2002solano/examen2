package hn.unah.lenguajes.examen2.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.modelos.Vehiculo;
import hn.unah.lenguajes.examen2.repositorios.VehiculoRepositorio;
import hn.unah.lenguajes.examen2.servicios.VehiculoService;
@Service
public class VehiculoServiceImpl implements VehiculoService{
    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;
    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
       return vehiculoRepositorio.save(vehiculo);
    }

    @Override
    public List<Vehiculo> ObtenerTodosVehiculos() {
        return vehiculoRepositorio.findAll();
    }

    @Override
    public Vehiculo ObtenerVehiculoId(Integer id) {
        return vehiculoRepositorio.findById(id).get();
    }
    
}
