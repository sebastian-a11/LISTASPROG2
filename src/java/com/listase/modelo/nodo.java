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
public class nodo  {
    private infante dato;
    private nodo siguiente;

    public nodo(infante dato) {
        this.dato = dato;
    }
    
    

    public infante getDato() {
        return dato;
    }

    public void setDato(infante dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
