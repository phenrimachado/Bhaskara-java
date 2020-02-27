package br.com.basis.bhaskarasimples.main;

import br.com.basis.bhaskarasimples.model.*;

public class TestaBhaskara {
    public static void main(String[] args) {

        //Coeficientes vão na construção do objeto
        Bhaskara bhaskara = new Bhaskara(2, -16, -18);
        bhaskara.calculaBhaskara();
    }
}
