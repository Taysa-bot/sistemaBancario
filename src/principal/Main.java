package principal;

import classesAbstratas.Conta;
import excecoes.SaldoInsuficienteException;
import classes.ContaPoupanca;
import classes.ContaCorrente;
import excecoes.ValorInvalidoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws ValorInvalidoException {

        Conta a = new ContaPoupanca(0123, 013, 005, "caixa", "Luana", 230.00);
        Conta b = new ContaPoupanca(0654, 013, 003, "caixa", "Thiago", 700.00);
        Conta c = new ContaPoupanca(0235, 013, 002, "caixa", "Ruan", 500.00);
        Conta d = new ContaCorrente(8910, 015, 036, "caixa", "Raiane", 250.00);
        Conta e = new ContaCorrente(8281, 015, 062, "caixa", "Maria", 350.00);
        Conta f = new ContaCorrente(8197, 015, 072, "caixa", "Kaio", 100.00);
        try {
            a.depositar(40);
            System.out.println("Depósito realizado! \n");
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            f.depositar(150);
            System.out.println("Depósito realizado! \n");
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            a.sacar(10);
            System.out.println("Saque realizado.\n");
        } catch (SaldoInsuficienteException excessao) {
            System.out.println(excessao.getMessage());
        }
        try {
            d.sacar(30);
            System.out.println("Saque realizado. \n");
        } catch (SaldoInsuficienteException excessao) {
            System.out.println(excessao.getMessage());
        }
        ArrayList<Conta> lista = new ArrayList();
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        Collections.sort(lista);
        for (Conta x : lista) {
            System.out.println(x);
        }

    }
}
