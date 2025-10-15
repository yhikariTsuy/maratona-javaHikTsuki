package academy.devdojo.javaoneforall.javacore.npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Television;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.npolymorphism.service.CalculatorImpost;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Television television = new Television("Samsung 50\"", 5000);
        Tomato tomato = new Tomato("Tomatão Siciliano", 10 );
        CalculatorImpost.calcularImposto(computer);
        System.out.println("-------------------------------------");
        CalculatorImpost.calcularImposto(tomato);
        System.out.println("-------------------------------------");
        CalculatorImpost.calcularImposto(television);


    }
}
