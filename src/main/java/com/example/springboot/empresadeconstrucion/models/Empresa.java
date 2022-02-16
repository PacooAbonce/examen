package com.example.springboot.empresadeconstrucion.models;

import javax.persistence.*;

@Entity
@Table(name="Materiales")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)

    private Long id;
    private String nombre;
    private String descripcion;
    private Long precio;
    private Long cantidad;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public Long getPrecio(){
        return precio;
    }
    public void setPrecio(Long precio){
        this.precio = precio;
    }
    public Long getCantidad(){
        return cantidad;
    }
    public void setCantidad(Long cantidad){
        this.cantidad = cantidad;
    }
}
