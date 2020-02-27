package br.com.basis.bhaskarasimples.model;

public class RaizNegativa {

    public double calculaRaizNegativa(double delta, double a, double b) {
        double raizDelta = Math.sqrt(delta);
        double raiz = (-b - raizDelta) / (2 * a);
        return raiz;
    }
}
