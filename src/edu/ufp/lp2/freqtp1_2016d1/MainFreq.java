/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.lp2.freqtp1_2016d1;

import edu.ufp.inf.lp2.intro.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author migue
 */
public class MainFreq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BD baseDeDados = new BD();
        GestaoAcesso ga = new GestaoAcesso(baseDeDados);
        Utilizador u1 = new Utilizador("1","José","Rua direita",new Date(10,10,1990), "user1", "1234");
        Utilizador u2 = new Utilizador("1","Maria","Rua esquerda",new Date(5,5,1985), "user2", "1234");
        ga.registo(u1);
        ga.registo(u2);
        Sessao s1 = new Sessao(baseDeDados);
        try {
            ga.login(u1);
        } catch (UtilizadorInexistenteException ex) {
            Logger.getLogger(MainFreq.class.getName()).log(Level.SEVERE, null, ex);
        }
        Livro l1 = new Livro("titulo1",new Date(5,7,2017));
        Livro l2 = new Livro("titulo2",new Date(6,4,2014));
        Livro l3 = new Livro("titulo3",new Date(2,1,2013));
        s1.adicionaLivro(l1);
        s1.adicionaLivro(l2);
        s1.adicionaLivro(l3);
        
        for(int i=0;i<s1.getBd().getLivros().size();i++){
            System.out.println(s1.getBd().getLivros().get(i).getTitulo());
        }
        for(int i=0;i<s1.getBd().getUtilizadores().size();i++){
            System.out.println(s1.getBd().getUtilizadores().get(i).getName()+" "+s1.getBd().getUtilizadores().get(i).getUname());
        }
        
        s1.requisitaLivro(l3, u1.getUname());
        s1.emprestaLivro(l3, u1.getUname(), u2.getUname());
        
        System.out.println(l3.getUser().getUname());
        
        Livro ar[] = new Livro[20];      
        ar = s1.procuraLivros("titulo2", "autorX");
        
        
        
    }
    
}
