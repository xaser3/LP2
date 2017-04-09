package edu.ufp.inf.lp2.projecto;

import java.util.ArrayList;

public class Aviao {

  private int id;
  private String modelo;
  private String nome;
  private int vel_cruzeiro;
  private int alt_cruzeiro;
  private int dist_max;
  private String cod_aeroporto;
  private int cap_passageiros;
  private int cap_deposito;
  private String companhiaAerea;
  private ArrayList <Voo> voosA = new ArrayList<>();

    public Aviao() {
    }

    public Aviao(int id, String modelo, String nome, int vel_cruzeiro, int alt_cruzeiro, int dist_max, String cod_aeroporto, int cap_passageiros, int cap_deposito) {        
        this.id = id;
        this.modelo = modelo;
        this.nome = nome;
        this.vel_cruzeiro = vel_cruzeiro;
        this.alt_cruzeiro = alt_cruzeiro;
        this.dist_max = dist_max;
        this.cod_aeroporto = cod_aeroporto;
        this.cap_passageiros = cap_passageiros;
        this.cap_deposito = cap_deposito;
    }

  @Override
    public String toString(){
        return (this.id+" "+this.modelo+" "+this.nome+" "+this.vel_cruzeiro+" "+this.alt_cruzeiro+" "+this.dist_max+" "+this.cod_aeroporto+" "+this.cap_passageiros+" "+this.cap_deposito);
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
     * @return the vel_cruzeiro
     */
    public int getVel_cruzeiro() {
        return vel_cruzeiro;
    }

    /**
     * @param vel_cruzeiro the vel_cruzeiro to set
     */
    public void setVel_cruzeiro(int vel_cruzeiro) {
        this.vel_cruzeiro = vel_cruzeiro;
    }

    /**
     * @return the alt_cruzeiro
     */
    public int getAlt_cruzeiro() {
        return alt_cruzeiro;
    }

    /**
     * @param alt_cruzeiro the alt_cruzeiro to set
     */
    public void setAlt_cruzeiro(int alt_cruzeiro) {
        this.alt_cruzeiro = alt_cruzeiro;
    }

    /**
     * @return the dist_max
     */
    public int getDist_max() {
        return dist_max;
    }

    /**
     * @param dist_max the dist_max to set
     */
    public void setDist_max(int dist_max) {
        this.dist_max = dist_max;
    }

    /**
     * @return the cod_aeroporto
     */
    public String getCod_aeroporto() {
        return cod_aeroporto;
    }

    /**
     * @param cod_aeroporto the cod_aeroporto to set
     */
    public void setCod_aeroporto(String cod_aeroporto) {
        this.cod_aeroporto = cod_aeroporto;
    }

    /**
     * @return the cap_passageiros
     */
    public int getCap_passageiros() {
        return cap_passageiros;
    }

    /**
     * @param cap_passageiros the cap_passageiros to set
     */
    public void setCap_passageiros(int cap_passageiros) {
        this.cap_passageiros = cap_passageiros;
    }

    /**
     * @return the cap_deposito
     */
    public int getCap_deposito() {
        return cap_deposito;
    }

    /**
     * @param cap_deposito the cap_deposito to set
     */
    public void setCap_deposito(int cap_deposito) {
        this.cap_deposito = cap_deposito;
    }

    /**
     * @return the companhiaAerea
     */
    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    /**
     * @param companhiaAerea the companhiaAerea to set
     */
    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
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