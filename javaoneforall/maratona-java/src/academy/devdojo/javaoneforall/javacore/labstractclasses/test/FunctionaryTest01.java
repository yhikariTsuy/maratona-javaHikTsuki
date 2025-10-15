package academy.devdojo.javaoneforall.javacore.labstractclasses.test;

import academy.devdojo.javaoneforall.javacore.labstractclasses.domain.Developer;
import academy.devdojo.javaoneforall.javacore.labstractclasses.domain.Manager;

public class FunctionaryTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Jinshi", 10499.95);
        Developer developer = new Developer("MaoMao", 8499.95);
        System.out.println(manager);
        System.out.println(developer);
    }
}
