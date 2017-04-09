package edu.ufp.inf.lp2.bt;

public class Condutor {

    private String nome;
    private String numCarta;
    private int numInfracoes;
    private boolean cartaApreendida;

    public Condutor(String nome, String numCarta, int numInfracoes, boolean cartaApreendida) {
        this.nome = nome;
        this.numCarta = numCarta;
        this.numInfracoes = numInfracoes;
        this.cartaApreendida = cartaApreendida;
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
     * @return the numCarta
     */
    public String getNumCarta() {
        return numCarta;
    }

    /**
     * @param numCarta the numCarta to set
     */
    public void setNumCarta(String numCarta) {
        this.numCarta = numCarta;
    }

    /**
     * @return the numInfracoes
     */
    public int getNumInfracoes() {
        return numInfracoes;
    }

    /**
     * @param numInfracoes the numInfracoes to set
     */
    public void setNumInfracoes(int numInfracoes) {
        this.numInfracoes = numInfracoes;
    }

    /**
     * @return the cartaApreendida
     */
    public boolean isCartaApreendida() {
        return cartaApreendida;
    }

    /**
     * @param cartaApreendida the cartaApreendida to set
     */
    public void setCartaApreendida(boolean cartaApreendida) {
        this.cartaApreendida = cartaApreendida;
    }

}