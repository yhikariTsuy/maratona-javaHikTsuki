package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double result = calc.divideDoisNumeros(10,2);
        System.out.println(result);

        calc.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
