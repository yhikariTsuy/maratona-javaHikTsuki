package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int a = 1;
        int b = 2;
        calc.alteraDoisNumeros(a,b);
        System.out.println("Dentro do CalculadoraTest04:");
        System.out.println("num1: " + a);
        System.out.println("num2: " + b);
    }
}
