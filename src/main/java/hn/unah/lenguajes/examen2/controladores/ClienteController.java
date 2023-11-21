package hn.unah.lenguajes.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen2.modelos.Clientes;
import hn.unah.lenguajes.examen2.servicios.Impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;
    
    @PostMapping("/crear")
    public Clientes crearCliente(@RequestBody Clientes nuevoCliente){
        if(nuevoCliente.getTipoCliente() !=null){
            nuevoCliente.getTipoCliente().setTipoCliente(nuevoCliente);
        }
        return this.clienteServiceImpl.crearCliente(nuevoCliente);
    }

    @GetMapping("/ObtenerClientes")

}
