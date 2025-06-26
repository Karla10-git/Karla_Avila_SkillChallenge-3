package com.meta.tienda.entidades;

import jakarta.persistence.*;

@Entity //@Entity: Marks this class as a JPA entity, meaning it will be mapped to a table in the database.
@Table(name = "clientes")
public class Cliente {
    @Id //@Id: Specifies the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue: Defines the strategy for generating primary key values automatically.
    private Integer id;
    private String nombre;
    private String direccion;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
