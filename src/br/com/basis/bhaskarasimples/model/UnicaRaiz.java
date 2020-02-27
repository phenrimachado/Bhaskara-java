package br.com.basis.bhaskarasimples.model;

public class UnicaRaiz {

    public double calculaUnicaRaiz(double delta, double a, double b) {
        double raizDelta = Math.sqrt(delta);
        double raiz = (-b + raizDelta) / (2 * a);
        return raiz;
    }
}
