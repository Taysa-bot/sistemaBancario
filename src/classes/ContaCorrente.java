package classes;

import classesAbstratas.Conta;
import interfaces.Impostoable;

public class ContaCorrente extends Conta implements Impostoable {

    public ContaCorrente(int numero, int codAg, int codBa, String nomeBanco, String nome, double saldo) {
        super(numero, codAg, codBa, nomeBanco, nome, saldo);
    }

    @Override
    public double calcularImposto() {
        return super.saldo * 0.05;
    }

}
