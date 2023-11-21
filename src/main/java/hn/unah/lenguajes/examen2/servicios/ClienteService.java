package hn.unah.lenguajes.examen2.servicios;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);
    public Cliente ObtenerTodosCliente();
    public Cliente ObtenerClienteId(Integer id);
}
