/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica3.a;

import ec.edu.ups.practica3.a.modelo.Contacto;
import ec.edu.ups.practica3.a.modelo.controlador.ArbolControlador;

/**
 *
 * @author Usuario
 */
public class Practica3A {

    public static void main(String[] args) {
        ArbolControlador arbolControlador = new ArbolControlador();
        
        Contacto c1 = new Contacto("Juan", "12345");
        Contacto c2 = new Contacto("Maria", "12346");
        Contacto c3 = new Contacto("Pedro", "12347");
        Contacto c4 = new Contacto("Pablo", "12348");
        
        arbolControlador.insert(c1);
        arbolControlador.insert(c2);
        arbolControlador.insert(c3);
        arbolControlador.insert(c4);
        arbolControlador.insert(new Contacto("Juliana", "5"));
        arbolControlador.insert(new Contacto("Jhon", "6"));
        
    }
}
