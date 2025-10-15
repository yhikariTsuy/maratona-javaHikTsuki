package academy.devdojo.javaoneforall.javacore.jfinalmodifier.test;

import academy.devdojo.javaoneforall.javacore.jfinalmodifier.domain.Car;
import academy.devdojo.javaoneforall.javacore.jfinalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.VELOCIDADE_LIMITE);
        car.Buyer.setNome("Kuririn");
        System.out.println(car.Buyer);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo Gabriel");
        ferrari.imprime();
    }
}
