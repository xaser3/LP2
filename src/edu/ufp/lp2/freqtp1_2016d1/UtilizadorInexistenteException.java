/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.lp2.freqtp1_2016d1;

/**
 *
 * @author migue
 */
public class UtilizadorInexistenteException extends Exception {

    /**
     * Creates a new instance of <code>UtilizadorInexistenteException</code>
     * without detail message.
     */
    public UtilizadorInexistenteException() {
    }

    /**
     * Constructs an instance of <code>UtilizadorInexistenteException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public UtilizadorInexistenteException(String msg) {
        super(msg);
    }
}
