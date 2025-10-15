package academy.devdojo.javaoneforall.javacore.bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Functionary;

public class FunctionaryTest01 {
    public static void main(String[] args) {
        Functionary functionary = new Functionary();

        functionary.setNome("Arthur");
        functionary.setIdade(32);
        functionary.setSalarios(new double []{1200, 987.32, 2000});

        functionary.imprime();
        System.out.println("Media: " + functionary.getMedia());
    }
}
