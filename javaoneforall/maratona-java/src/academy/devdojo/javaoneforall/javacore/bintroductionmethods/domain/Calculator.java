package academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain;

public class Calculator {

    public void somaDoisNumeros() {
        System.out.println(10 + 12);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 12);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        System.out.println("Não é possivel dividir por zero");
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não é possivel dividir por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int number1, int number2) {
        number1 = 33;
        number2 = 44;
        System.out.println("Dentro do alteraDoisNumeros:");
        System.out.println(number1);
        System.out.println(number2);
    }

    public void somaArray(int [] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void somaVarArgs(int ... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
