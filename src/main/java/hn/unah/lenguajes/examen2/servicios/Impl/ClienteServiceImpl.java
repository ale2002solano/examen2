package hn.unah.lenguajes.examen2.servicios.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.modelos.Clientes;
import hn.unah.lenguajes.examen2.repositorios.ClienteRepositorio;
import hn.unah.lenguajes.examen2.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepositorio clienteRepository;

    @Override
    public Clientes crearCliente(Clientes cliente) {
        return clienteRepository.save(cliente);

    }

    @Override
    public List<Clientes> ObtenerTodosCliente() {
        return clienteRepository.findAll();   
    }

    @Override
    public Clientes ObtenerClienteId(Integer id) {
        
        return clienteRepository.findById(id).get();
    }
    
}
