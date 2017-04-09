package edu.ufp.inf.lp2.bt;

import edu.ufp.inf.lp2.intro.Date;
import java.util.ArrayList;

public class BT {

  private ArrayList<Multa> multas = new ArrayList<>();

  public void addMulta(Multa m) throws AlreadyRegisteredMultaException {
      for(Multa multa : this.multas){
          if(multa.compareTo(m)==0){
              throw new AlreadyRegisteredMultaException("Multa já registada");
          }
      }
      this.multas.add(m);
      m.getCondutor().setNumInfracoes(m.getCondutor().getNumInfracoes()+1);
      this.apreenderCarta(m.getCondutor());
  }

  public Multa removeMulta(Multa m) {
      boolean found = false;
      for(Multa multa : this.multas){
          if(multa.getCondutor()==m.getCondutor() && multa.getData()==m.getData() && multa.getLocal().compareTo(m.getLocal())==0 && multa.getRazao().compareTo(m.getRazao())==0){
              found = true;
          }
      }
      this.multas.remove(m);
      m.getCondutor().setNumInfracoes(m.getCondutor().getNumInfracoes()-1);
      return m;
  }

  public ArrayList<Multa> lookupMultas(Date d1, Date d2) {
      ArrayList<Multa> multasC = new ArrayList<>();
      for(Multa multa : this.multas){
            if(multa.getData().afterDate(d1) && multa.getData().beforeDate(d2)){
                multasC.add(multa);
            }
      }
      return multasC;
  }

  public void apreenderCarta(Condutor c) {
      Date today = new Date();
      Date d = new Date(today.getDay(),today.getMonth(),today.getYear()-4);
      ArrayList<Multa> multasC = lookupMultas(d,today,c);
      if(multasC.size()>3){
          c.setCartaApreendida(true);
      }
  }

  public ArrayList<Multa> lookupMultas(Date d1, Date d2, Condutor c) {
      ArrayList<Multa> multasC = new ArrayList<>();
      for(Multa multa : this.multas){
          if(multa.getCondutor().getNumCarta().compareTo(c.getNumCarta())==0){
              if(multa.getData().afterDate(d1) && multa.getData().beforeDate(d2)){
                  multasC.add(multa);
              }
          }
      }
      return multasC;
  }

  public ArrayList<Multa> lookupMulta(String r) {
      ArrayList<Multa> multasR = new ArrayList<>();
      for(Multa multa : this.multas){
          if(multa.getRazao().compareTo(r)==0){
              multasR.add(multa);
          }
      }
      return multasR;
  }

  public int contaMultas(Condutor c) {
      int m = 0;
      for(Multa multa : this.multas){
          if(multa.getCondutor().getNumCarta().compareTo(c.getNumCarta())==0){
              m++;
          }
      }
      return m;
    }
}