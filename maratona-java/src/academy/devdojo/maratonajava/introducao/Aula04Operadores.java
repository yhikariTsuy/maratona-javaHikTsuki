package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int num1 = 10;
        int num2 = 20;
        double resultado = (double) num1 / num2;
        System.out.println("Valor: " + (resultado));


        // %
        int resto = 10 % 2;
        System.out.println(resto);

        // < > <= >= == !=

        // and (&&) || (or) !(not)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;

        // =, +=, -=, *=, /=, %=
        double bonus = 2000;
        bonus += 1000;
        System.out.println(bonus);

        // ++, --
        int contador = 0;
        contador ++;
        contador --;
        System.out.println(contador);
    }
}
