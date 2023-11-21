package hn.unah.lenguajes.examen2.servicios;


import java.util.List;

import hn.unah.lenguajes.examen2.modelos.Vehiculo;

public interface VehiculoService {

    public Vehiculo crearVehiculo(Vehiculo vehiculo);
    public List<Vehiculo> ObtenerTodosVehiculos();
    public Vehiculo ObtenerVehiculoId(Integer id);
    
}
