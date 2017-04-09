package edu.ufp.inf.lp2.projecto;

import edu.ufp.inf.lp2.intro.Date;

public class Voo {

  private Date data;
  private int tempo;
  private Aeroporto aeroportoOrigem;
  private Aeroporto aeroportoDestino;
  private Aviao av;
  private int distancia;
  private int vel_vento;
  private int altitude;
  private int numPassageiros;
  private int velocidade;

    public Voo(Date data, Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino, Aviao av, int distancia, int vel_vento, int altitude, int np, int velocidade) {
        this.data = data;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.av = av;
        if(distancia<av.getDist_max()){
            this.distancia = distancia;
        }else{
            System.out.println("Erro: Distância da viagem superior ao alcançe do avião");
        }
        this.vel_vento = vel_vento;
        this.altitude = altitude;
        if(this.numPassageiros<=av.getCap_passageiros()){
            this.numPassageiros=np;
        }else{
            System.out.println("Erro: Excesso de passageiros");
        }
        this.velocidade = velocidade;
        this.tempo = (distancia/velocidade)*60;
    }

    public Voo() {
    }

  @Override
    public String toString(){
        return (this.data+" "+this.tempo+"min "+this.aeroportoOrigem.getCodigo()+"-"+this.aeroportoDestino.getCodigo()+" Avião nº"+this.av.getId()+" "+this.distancia+"Kms "+this.vel_vento+"km/h "+this.altitude+"m "+this.getNumPassageiros()+" passageiros");
    }

    public Aviao getAv() {
        return av;
    }

    public void setAv(Aviao av) {
        this.av = av;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public Aeroporto getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    public Aeroporto getAeroportoDestino() {
        return aeroportoDestino;
    }

    public void setAeroportoDestino(Aeroporto aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
    }

    /**
     * @return the distancia
     */
    public int getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the vel_vento
     */
    public int getVel_vento() {
        return vel_vento;
    }

    /**
     * @param vel_vento the vel_vento to set
     */
    public void setVel_vento(int vel_vento) {
        this.vel_vento = vel_vento;
    }

    /**
     * @return the altitude
     */
    public int getAltitude() {
        return altitude;
    }

    /**
     * @param altitude the altitude to set
     */
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    /**
     * @return the numPassageiros
     */
    public int getNumPassageiros() {
        return numPassageiros;
    }

    /**
     * @param numPassageiros the numPassageiros to set
     */
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

}