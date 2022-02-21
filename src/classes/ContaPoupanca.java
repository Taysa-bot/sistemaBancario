package classes;

import classesAbstratas.Conta;
import interfaces.Rentabilidadeable;

public class ContaPoupanca extends Conta implements Rentabilidadeable {

    public ContaPoupanca(int numero, int codAg, int codBa, String nomeBanco, String nome, double saldo) {
        super(numero, codAg, codBa, nomeBanco, nome, saldo);
    }

    @Override
    public void depositar(double val) {
        super.depositar(saldo += pagarRentabilidade(val));

    }

    @Override
    public double pagarRentabilidade(double saldo) {
        return saldo * 0.005;
    }

}
