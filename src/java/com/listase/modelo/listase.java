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
public class listase {

    private nodo cabeza;
//construtctor

    public listase() {
    }

//get set
    public nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(nodo cabeza) {
        this.cabeza = cabeza;
    }

    public void adicionarNodoAlFinal(infante Infante) {
        if (cabeza == null) {
            cabeza = new nodo(Infante);
        } else {
            //llamoa temp
            nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(new nodo(Infante));

        }
    }

    public void adicionarNodoAlInicio(infante Infante) {
        if (cabeza == null) {
            cabeza = new nodo(Infante);
        } else {
            nodo temp = new nodo(Infante);
            temp.setSiguiente(cabeza);
            cabeza = temp;
        }
    }

    public short contarNodos() {
        if (cabeza == null) {
            return 0;
        } else {
            nodo temp = cabeza;
            short cont = 1;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
                cont++;
            }
            return cont;
        }
    }

}
