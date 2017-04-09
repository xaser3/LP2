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
public class GestaoAcesso {
        private BD bd;

    public GestaoAcesso(BD bd) {
        this.bd = bd;
    }
    
        public boolean registo(Utilizador u){
            if(!bd.existe(u)){
                bd.regista(u);
                return true;
            }
            return false;
        }
        
        public Sessao login(Utilizador u) throws UtilizadorInexistenteException{
            Sessao s = null;
            if(!bd.existe(u)){
                throw new UtilizadorInexistenteException("Utilizador inexistente");
            }else{
                for(int i=0;i<bd.getUtilizadores().size();i++){
                    try{
                        if(bd.getUtilizadores().get(i).equals(u)){
                            s = new Sessao(bd);
                        }
                    }catch(Exception e){ System.out.println(e.toString());}
                }
            }
            return s;
        }
}
