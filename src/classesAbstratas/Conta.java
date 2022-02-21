package classesAbstratas;

import excecoes.SaldoInsuficienteException;
import excecoes.ValorInvalidoException;
import java.util.InputMismatchException;

public abstract class Conta implements Comparable<Conta> {

    private int numero;
    private int codAg;
    private int codBa;
    private String nomeBanco;
    private String nome;
    protected double saldo;

    public Conta(int numero, int codAg, int codBa, String nomeBanco, String nome, double saldo) {
        this.numero = numero;
        this.codAg = codAg;
        this.codBa = codBa;
        this.nomeBanco = nomeBanco;
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Conta c) {
        if (saldo > c.verSaldo()) {
            return 1;
        } else if (saldo == c.verSaldo()) {
            return 0;
        } else {
            return -1;
        }
    }

    public void sacar(double val) throws SaldoInsuficienteException, ValorInvalidoException {
        if ((saldo - val) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        } else if (val < 0) {
            throw new ValorInvalidoException("Valor inválido!");
        }
        saldo -= val;
    }

    public void depositar(double val) throws InputMismatchException {
        if (val < 0) {
            throw new InputMismatchException("Valor inválido para depósito!");
        }
        saldo += val;
    }

    @Override
    public String toString() {
        return "Informações da conta: \n"
                + "Número da conta: " + numero + "\n"
                + "Código da agência: " + codAg + "\n"
                + "Código do banco: " + codBa + "\n"
                + "Nome: " + nome + "\n"
                + "Saldo: R$" + saldo + "\n";

    }

    public double verSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getCodAg() {
        return codAg;
    }

    public void setCodAg(int codAg) {
        this.codAg = codAg;
    }

    public long getCodBa() {
        return codBa;
    }

    public void setCodBa(int codBa) {
        this.codBa = codBa;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
