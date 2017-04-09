/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.lp2.freqtp1_2016d1;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class BD implements GestaoLivros, GestaoUtilizadores{

    private ArrayList<Utilizador> utilizadores = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();

    public BD() {
    }
    
    @Override
    public void add(Livro l) {
        this.getLivros().add(l);
    }

    @Override
    public Livro procuraLivro(String t) {
        for(int i=0;i<getLivros().size();i++){
            if(getLivros().get(i).getTitulo().contentEquals(t)){
                return getLivros().get(i);
            }
        }
        return null;
    }

    @Override
    public Livro[] procuraLivros(String t, String a) {
        Livro l[] = new Livro[20];
        int tam = 0;
        for(int i=0;i<getLivros().size();i++){
            if(getLivros().get(i).getTitulo().contentEquals(t)){
                for(int j=0;j<getLivros().get(i).getAutores().size();j++){
                    if(getLivros().get(i).getAutores().get(j).contentEquals(a)){
                        l[tam] = getLivros().get(i);
                        tam++;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void regista(Utilizador u) {
        this.getUtilizadores().add(u);
    }

    @Override
    public boolean existe(Utilizador u) {
        for(int i=0;i<getUtilizadores().size();i++){
            if (getUtilizadores().get(i).equals(u)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the utilizadores
     */
    public ArrayList<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    /**
     * @param utilizadores the utilizadores to set
     */
    public void setUtilizadores(ArrayList<Utilizador> utilizadores) {
        this.utilizadores = utilizadores;
    }

    /**
     * @return the livros
     */
    public ArrayList<Livro> getLivros() {
        return livros;
    }

    /**
     * @param livros the livros to set
     */
    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    
}
