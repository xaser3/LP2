/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.lp2.freqtp1_2016d1;

import edu.ufp.inf.lp2.intro.Date;
import edu.ufp.inf.lp2.intro.Person;
import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Utilizador extends Person {
    private String uname;
    private String passwd;
    private ArrayList<Livro> livros = new ArrayList<>();

    public Utilizador(String idNumber, String name, String address, Date birthDate, String uname, String passwd) {
        super(idNumber, name, address, birthDate);
        this.uname = uname;
        this.passwd = passwd;
    }

    public void recebe(Livro l){
        getLivros().add(l);
        l.associateUser(this);
    }
    
    public Livro devolve(String t){
        Livro lr = new Livro();
        for(int i=0;i<getLivros().size();i++){
            if(getLivros().get(i).getTitulo().contentEquals(t)){
                lr = getLivros().get(i);
                getLivros().get(i).associateUser(null);
                getLivros().remove(i);           
            }
        }
        return lr;
    }
    
    public void empresta(Livro l, Utilizador u){
        for(int i=0;i<getLivros().size();i++){
            if(getLivros().get(i).equals(l)){
                getLivros().get(i).associateUser(u);
                getLivros().remove(i);
                u.getLivros().add(l);
            }
        }
    }
    
    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
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
