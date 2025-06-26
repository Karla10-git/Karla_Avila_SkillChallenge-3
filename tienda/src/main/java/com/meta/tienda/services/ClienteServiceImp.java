package com.meta.tienda.services;

import com.meta.tienda.entidades.Cliente;
import com.meta.tienda.repositories.ClienteRepository;
import org.hibernate.ResourceClosedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;
@Service
public class ClienteServiceImp implements ClienteService{
    @Autowired
    ClienteRepository clienteRepository;
    @Override
    public List<Cliente> getClientes() {

        return clienteRepository.findAll();
    }
    @Override
    public Cliente agregarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    @Override
    public Cliente actualizarCliente(int id, Cliente actualizarCliente ){

            Cliente cliente = clienteRepository.findById(id).orElseThrow(
                    () -> new ResourceClosedException("Cliente no encontrado " )
            );
            cliente.setNombre(actualizarCliente.getNombre());
            cliente.setDireccion(actualizarCliente.getDireccion());

            return clienteRepository.save(cliente);
    }
    @Override
    public void eliminarCliente(int id) {
        clienteRepository.deleteById(id);
    }

}
