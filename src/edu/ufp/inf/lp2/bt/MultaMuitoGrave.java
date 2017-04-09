package edu.ufp.inf.lp2.bt;

import edu.ufp.inf.lp2.intro.Date;

public class MultaMuitoGrave extends Multa {

    public MultaMuitoGrave(Condutor condutor, Date data, String local, Veiculo veiculo, String razao) {
        super(condutor, data, local, veiculo, razao);
    }

    @Override
    public float valor() {
        return this.getCondutor().getNumInfracoes()*20 +(VALOR_MIN*2);
    }

    @Override
    public int castigo() {
        return 30;
    }
}