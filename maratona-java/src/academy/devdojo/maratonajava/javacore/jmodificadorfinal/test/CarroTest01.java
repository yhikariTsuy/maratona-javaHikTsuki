package academy.devdojo.maratonajava.javacore.jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo Gabriel");
        ferrari.imprime();
    }
}
