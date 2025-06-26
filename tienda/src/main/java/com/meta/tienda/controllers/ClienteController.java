package com.meta.tienda.controllers;

import com.meta.tienda.entidades.Cliente;
import com.meta.tienda.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tienda")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }

    @PostMapping("/clientes")
    public Cliente agregarCliente(@RequestBody Cliente cliente){
        return clienteService.agregarCliente(cliente);
    }

    @PutMapping("/clientes/{id}/")
    public ResponseEntity<Cliente> actualizarCliente(@PathVariable ("id") int id, @RequestBody Cliente actualizarCliente){
        Cliente cliente = clienteService.actualizarCliente(id, actualizarCliente);
        return ResponseEntity.ok(cliente);
    }


    @DeleteMapping("/clientes/{id}/")
    public void eliminarCliente(@PathVariable int id){
        clienteService.eliminarCliente(id);

    }
}
