/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listase.modelo;

/**
 *
 * @author sebas
 */
public class infante {
    private short codigo;
    private String nombre;
    private byte edad;

    public infante(short codigo, String nombre, byte edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    

    @Override
    public String toString() {
        return "infante{" + "codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
