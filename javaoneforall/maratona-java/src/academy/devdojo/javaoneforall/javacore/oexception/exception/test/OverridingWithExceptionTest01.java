package academy.devdojo.javaoneforall.javacore.oexception.exception.test;

import academy.devdojo.javaoneforall.javacore.oexception.exception.domain.Employee;
import academy.devdojo.javaoneforall.javacore.oexception.exception.domain.InvalidLoginException;
import academy.devdojo.javaoneforall.javacore.oexception.exception.domain.Person;

public class OverridingWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }
}
