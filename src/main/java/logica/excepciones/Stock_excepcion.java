/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.excepciones;

/**
 *
 * @author alumno
 */
public class Stock_excepcion extends Exception {

    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public Stock_excepcion() {
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public Stock_excepcion(String msg) {
        
        super(msg);
    }
}
