package academy.devdojo.javaoneforall.javacore.aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car carro1 = new Car();
        Car carro2 = new Car();

        carro1.nome = "Fuscão Preto";
        carro1.ano = 1969;
        carro1.modelo = "Sport";

        carro2.nome = "McLaren Senna";
        carro2.ano = 2017;
        carro2.modelo = "SuperCar";

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
