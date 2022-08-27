package com.example.pagina.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 60)
    private String nombre;
    @Column(nullable = false, length = 60)
    private String marca;
    @Column(nullable = false, length = 60)
    private String Hechoen;
    @Column(nullable = false)
    private float precio;

    public Producto(Long id, String nombre, String marca, String Hechoen, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.Hechoen = Hechoen;
        this.precio = precio;
    }

    public Producto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHechoen() {
        return Hechoen;
    }

    public void setHechoen(String Hechoen) {
        this.Hechoen = Hechoen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
