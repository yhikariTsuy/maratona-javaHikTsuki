package academy.devdojo.javaoneforall.javacore.bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int [] numeros = {1, 2, 3, 4, 5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5,6,7);
    }
}
