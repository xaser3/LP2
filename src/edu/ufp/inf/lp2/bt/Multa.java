package edu.ufp.inf.lp2.bt;

import edu.ufp.inf.lp2.intro.Date;

public abstract class Multa implements Comparable<Multa> {

  public static final float VALOR_MIN = 20.0f;
  public static final int CASTIGO_MIN = 15;
    
  private Condutor condutor;
  private Date data;
  private String local;
  private Veiculo veiculo;
  private String razao;

  public abstract float valor();
  public abstract int castigo();
  
    public Multa(Condutor condutor, Date data, String local, Veiculo veiculo, String razao) {
        this.condutor = condutor;
        this.data = data;
        this.local = local;
        this.veiculo = veiculo;
        this.razao = razao;
    }
  
  @Override
    public int compareTo(Multa m){
        if(this.condutor.getNumCarta().compareTo(m.getCondutor().getNumCarta())==0 && (this.veiculo.getMatricula().compareTo(m.getVeiculo().getMatricula())==0) && (this.local.compareTo(m.local)==0) && (this.razao.compareTo(m.razao)==0) && (this.data.compareTo(m.data)==0)){
            return 0;
        }
        return this.data.beforeDate(m.data)?-1:1;
    }
  
    /**
     * @return the condutor
     */
    public Condutor getCondutor() {
        return condutor;
    }

    /**
     * @param condutor the condutor to set
     */
    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the veiculo
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the razao
     */
    public String getRazao() {
        return razao;
    }

    /**
     * @param razao the razao to set
     */
    public void setRazao(String razao) {
        this.razao = razao;
    }

}