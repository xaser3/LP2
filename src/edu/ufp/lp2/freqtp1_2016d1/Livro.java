/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.lp2.freqtp1_2016d1;

import edu.ufp.inf.lp2.intro.Date;
import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Livro {
    private String titulo;
    private ArrayList<String> autores = new ArrayList<>();
    private Date publicacao;
    private Utilizador user;

    public Livro(String titulo, Date publicacao) {
        this.titulo = titulo;
        this.publicacao = publicacao;
    }

    public Livro(){
        
    }
    
    public boolean requisitado(){
        if(this.user==null){
            return false;
        }
        return true;
    }
    
    public void associateUser(Utilizador u){
        this.setUser(u);
    }
    
    public void deassociateUser(){
        this.setUser(null);
    }
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the publicacao
     */
    public Date getPublicacao() {
        return publicacao;
    }

    /**
     * @param publicacao the publicacao to set
     */
    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }

    /**
     * @return the user
     */
    public Utilizador getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Utilizador user) {
        this.user = user;
    }

    /**
     * @return the autores
     */
    public ArrayList<String> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }
  
}
