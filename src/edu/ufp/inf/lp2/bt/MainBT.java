/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.bt;

import edu.ufp.inf.lp2.intro.Date;
import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class MainBT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AlreadyRegisteredMultaException {
        BT bt = new BT();
        Condutor c1 = new Condutor("Miguel","1234",0,false);
        Condutor c2 = new Condutor("Jorge","5678",0,false);
        Veiculo v1 = new Veiculo("12-34-AB","Renault","Clio",2000);
        Veiculo v2 = new Veiculo("56-78-CD","Opel","Vectra",2000);
        Multa m1 = new MultaMuitoGrave(c1,new Date(1,4,2016),"Porto",v1,"Excesso de velocidade");
        Multa m2 = new MultaGrave(c2,new Date(2,5,2015),"Porto",v2,"Excesso de Alcool");
        Multa m3 = new MultaGrave(c1,new Date(2,3,2017),"Porto",v1,"Excesso de nada");
        Multa m4 = new MultaGrave(c2,new Date(3,1,2015),"Porto",v2,"Estava a circular");
        bt.addMulta(m1);
        bt.addMulta(m2);
        bt.addMulta(m3);
        bt.addMulta(m4);
        
        ArrayList<Multa> multasC = new ArrayList<>();
        //multasC = bt.lookupMultas(new Date(1,1,2016), new Date(7,3,2017), c1);
        multasC = bt.lookupMultas(new Date(1,1,2014), new Date(7,3,2017));
        for(Multa m : multasC){
            System.out.println(m.getCondutor().getNome()+" "+m.getVeiculo().getMatricula()+" "+m.getData()+" "+m.getLocal()+" "+m.getRazao());
            
        }
        
        System.out.println(m1.valor());

        bt.removeMulta(m2);

        System.out.println(bt.contaMultas(c2));
        multasC = bt.lookupMultas(new Date(1,1,2014), new Date(7,3,2017));
        for(Multa m : multasC){
            System.out.println(m.getCondutor().getNome()+" "+m.getVeiculo().getMatricula()+" "+m.getData()+" "+m.getLocal()+" "+m.getRazao());
            
        }
    }
    
}
