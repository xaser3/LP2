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
public class Sessao {
    
    private BD bd;

    public Sessao(BD bd) {
        this.bd = bd;
    }
    
    public void adicionaLivro(Livro b){
        bd.add(b);
    }
    
    public Livro[] procuraLivros(String t, String a) {
        Livro l[] = new Livro[20];
        int tam = 0;
        for(int i=0;i<bd.getLivros().size();i++){
            if(bd.getLivros().get(i).getTitulo().contentEquals(t)){
                for(int j=0;j<bd.getLivros().get(i).getAutores().size();j++){
                    if(bd.getLivros().get(i).getAutores().get(j).contentEquals(a)){
                        l[tam] = bd.getLivros().get(i);
                        tam++;
                    }
                }
            }
        }
        return l;
    }
    
    public void requisitaLivro(Livro l, String u){
        for(int i=0;i<bd.getUtilizadores().size();i++){
            if(bd.getUtilizadores().get(i).getUname().contentEquals(u)){
                bd.getUtilizadores().get(i).recebe(l);
                l.associateUser(bd.getUtilizadores().get(i));
            }
        }
        
    }
    
    public void emprestaLivro(Livro l, String u1, String u2){
        for(int i=0;i<bd.getLivros().size();i++){
            
        }
        
    }

    /**
     * @return the bd
     */
    public BD getBd() {
        return bd;
    }

    /**
     * @param bd the bd to set
     */
    public void setBd(BD bd) {
        this.bd = bd;
    }
}
