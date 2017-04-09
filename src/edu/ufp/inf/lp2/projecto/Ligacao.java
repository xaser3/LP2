package edu.ufp.inf.lp2.projecto;

public class Ligacao {

    private Aeroporto aeroporto_ini;
    private Aeroporto aeroporto_fin;
    private int distancia;
    private int vel_vento;
    private int altitude;
  
    /**
     * @return the aeroporto_ini
     */
    public Aeroporto getAeroporto_ini() {
        return aeroporto_ini;
    }

    /**
     * @param aeroporto_ini the aeroporto_ini to set
     */
    public void setAeroporto_ini(Aeroporto aeroporto_ini) {
        this.aeroporto_ini = aeroporto_ini;
    }

    /**
     * @return the aeroporto_fin
     */
    public Aeroporto getAeroporto_fin() {
        return aeroporto_fin;
    }

    /**
     * @param aeroporto_fin the aeroporto_fin to set
     */
    public void setAeroporto_fin(Aeroporto aeroporto_fin) {
        this.aeroporto_fin = aeroporto_fin;
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

}