package classes;

import interfaces.Impostoable;
import interfaces.Rentabilidadeable;

public class Investimento implements Rentabilidadeable, Impostoable {

    private String nomeProprietario;
    private double saldo;

    public Investimento(String nomeProprietario, double saldo) {
        this.nomeProprietario = nomeProprietario;
        this.saldo = saldo;
    }

    public void investir(double ap) {
        saldo += ap + pagarRentabilidade(ap);
    }

    public void resgastar(double re) {
        saldo -= re;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double verSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double pagarRentabilidade(double saldo) {
        return saldo * 0.01;
    }

    @Override
    public double calcularImposto() {
        return saldo * 0.15;
    }

}
