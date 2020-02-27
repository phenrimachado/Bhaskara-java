package br.com.basis.bhaskarasimples.model;

public class Bhaskara {
    private Delta delta = new Delta();
    private int valorA;
    private int valorB;
    private int valorC;

    public Bhaskara(int a, int b, int c) {
        this.valorA = a;
        this.valorB = b;
        this.valorC = c;
    }

    public void setValorC(int valorC) {
        this.valorC = valorC;
    }

    public void calculaBhaskara() {
        int resultadoDelta = delta.calculaDelta(this.valorA, this.valorB, this.valorC);

        if(resultadoDelta == 0) {
            UnicaRaiz unicaRaiz = new UnicaRaiz();
            double valorUnicaRaiz = unicaRaiz.calculaUnicaRaiz(resultadoDelta, this.valorA, this.valorB);
            System.out.println("Valor de X: " + valorUnicaRaiz);

            return;
        } else {
            RaizPositiva raizPositiva = new RaizPositiva();
            double valorRaizPositiva = raizPositiva.calculcaRaizPositiva(resultadoDelta, this.valorA, this.valorB);
            System.out.println("Valor de X': " + valorRaizPositiva);

            RaizNegativa raizNegativa = new RaizNegativa();
            double valorRaizNegativa = raizNegativa.calculaRaizNegativa(resultadoDelta, this.valorA, this.valorB);
            System.out.println("Valor de X\": " + valorRaizNegativa);
        }
    }
}
