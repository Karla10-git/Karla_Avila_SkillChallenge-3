package com.meta.tienda.services;

import com.meta.tienda.entidades.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> getClientes();
    Cliente agregarCliente(Cliente cliente);

    Cliente actualizarCliente(int id, Cliente cliente);

    void eliminarCliente(int id);
}




