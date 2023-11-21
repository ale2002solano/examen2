package hn.unah.lenguajes.examen2.servicios;

import java.util.List;

import hn.unah.lenguajes.examen2.modelos.Clientes;

public interface ClienteService {

    public Clientes crearCliente(Clientes cliente);
    public List<Clientes> ObtenerTodosCliente();
    public Clientes ObtenerClienteId(Integer id);
}
