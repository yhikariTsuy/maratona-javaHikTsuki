package academy.devdojo.javaoneforall.javacore.bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 1;
        int b = 2;
        calc.alteraDoisNumeros(a,b);
        System.out.println("Dentro do CalculadoraTest04:");
        System.out.println("num1: " + a);
        System.out.println("num2: " + b);
    }
}
