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
public interface GestaoLivros {
    public void add(Livro l);
    public Livro procuraLivro(String t);
    public Livro[] procuraLivros(String t, String a);
}
