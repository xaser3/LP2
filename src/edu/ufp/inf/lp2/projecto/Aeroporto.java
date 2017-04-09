package edu.ufp.inf.lp2.projecto;

import java.util.ArrayList;

public class Aeroporto {

  private String nome;
  private String codigo;
  private String cidade;
  private String pais;
  private String continente;
  private float classificacao;
  private ArrayList <Aviao> Avioes = new ArrayList<>();
  private int nvoos;
  private ArrayList <Voo> voosA = new ArrayList<>();

    public Aeroporto(String nome, String codigo, String cidade, String pais, String continente, float classificacao) {
        this.nome = nome;
        this.codigo = codigo;
        this.cidade = cidade;
        this.pais = pais;
        this.continente = continente;
        this.classificacao = classificacao;
    }

    public Aeroporto(){        
    }
    
    public void addAviao(Aviao a) {
        this.getAvioes().add(a);
    }
    
  @Override
    public String toString(){
        return (this.codigo + " " + this.nome + " " + this.cidade + " " + this.pais + " " + this.continente + " " + this.classificacao);
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the continente
     */
    public String getContinente() {
        return continente;
    }

    /**
     * @param continente the continente to set
     */
    public void setContinente(String continente) {
        this.continente = continente;
    }

    /**
     * @return the classificacao
     */
    public float getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(float classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @return the nvoos
     */
    public int getNvoos() {
        return nvoos;
    }

    /**
     * @param nvoos the nvoos to set
     */
    public void setNvoos(int nvoos) {
        this.nvoos = nvoos;
    }

    public void incrementVoos(){
        this.nvoos++;
    }
    
    public void decrementVoos(){
        this.nvoos--;
    }

    /**
     * @return the Avioes
     */
    public ArrayList <Aviao> getAvioes() {
        return Avioes;
    }

    /**
     * @param Avioes the Avioes to set
     */
    public void setAvioes(ArrayList <Aviao> Avioes) {
        this.Avioes = Avioes;
    }

    /**
     * @return the voosA
     */
    public ArrayList <Voo> getVoosA() {
        return voosA;
    }

    /**
     * @param voos the voosA to set
     */
    public void setVoosA(ArrayList <Voo> voos) {
        this.voosA = voos;
    }
    
}