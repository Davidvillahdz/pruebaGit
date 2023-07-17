/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.a.modelo.controlador;

import ec.edu.ups.practica3.a.modelo.Contacto;
import ec.edu.ups.practica3.a.modelo.Node;

/**
 *
 * @author Usuario
 */
public class ArbolControlador {

    private Node raiz;

    public ArbolControlador() {
        this.raiz = null;
    }

    public void insert(Contacto contacto) {
        if (raiz == null) {
            raiz = new Node(contacto);

        } else {
            insertRecursivo(raiz, contacto);
        }
    }

    public void insertRecursivo(Node node, Contacto contacto) {

        if (contacto.getNombre().compareTo(node.getContacto().getNombre()) < 0) {
            if (node.getLeft() == null) {
                node.setLeft(node);
            } else {
                insertRecursivo(node.getLeft(), contacto);
            }

        } else if (contacto.getNombre().compareTo(node.getContacto().getNombre()) > 0) {
            if (node.getRight() == null) {
                node.setRight(node);
            } else {
                insertRecursivo(node.getRight(), contacto);
            }
        } else {

        }

    }

    public boolean setEquilibrio() {

        return verificarBalance(raiz);
    }

    public boolean verificarBalance(Node node) {

        if (node == null) {
            return true;
        }

        int alturaIzq = obtenerAltura(node.getLeft());
        int alturaDer = obtenerAltura(node.getRight());
        int diferencia = Math.abs(alturaIzq - alturaDer);
        if (diferencia > 1) {
            return false;
        }
       
        return  verificarBalance(node.getLeft())&& verificarBalance(node.getRight()) ;
    }

    private int obtenerAltura(Node node) {
        if (node == null) {
            return 0;
        }
        int alturaIzq = obtenerAltura(node.getLeft());
        int alturaDer = obtenerAltura(node.getRight());

        return Math.max(alturaIzq, alturaDer) + 1;
    }

}
