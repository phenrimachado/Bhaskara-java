package br.com.basis.bhaskarasimples.model;

import static java.lang.Math.*;

public class Delta {

    private int delta;

    public int calculaDelta(int a, int b, int c) {
        System.out.println("Δ = " + b + "² - 4 * " + a + " * " + c);
        System.out.println("Calculando Delta...\n");

        this.delta = (b * b) - (4 * a * c);

        System.out.println("Δ = " + this.delta + "\n");

        try {
            verificaRaizes(this.delta);
        } catch (DeltaZeroException ex) {
            System.out.print(ex.getMessage());
        }
        return this.delta;
    }

    private void verificaRaizes(int delta) throws DeltaZeroException {
        if(delta < 0) {
            throw new DeltaZeroException("Δ < 0. Não possui raiz.\nFinalizando...");
        }
        if(delta == 0) {
            System.out.println("Δ = 0. Apenas uma raiz.");
            return;
        } else {
            System.out.println("Δ > 0. Duas raízes.");
            return;
        }
    }
}
