package academy.devdojo.javaoneforall.javacore.bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = calc.divideDoisNumeros(10,2);
        System.out.println(result);

        calc.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
