package edu.ufp.inf.lp2.bt;

import edu.ufp.inf.lp2.intro.Date;

public class MultaGrave extends Multa {

    public MultaGrave(Condutor condutor, Date data, String local, Veiculo veiculo, String razao) {
        super(condutor, data, local, veiculo, razao);
    }

    @Override
    public float valor() {
        return VALOR_MIN*2;
    }

    @Override
    public int castigo() {
        return 15;
    }
}