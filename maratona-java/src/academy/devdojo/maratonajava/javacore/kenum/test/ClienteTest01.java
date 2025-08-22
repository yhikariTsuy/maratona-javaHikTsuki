package academy.devdojo.maratonajava.javacore.kenum.test;

import academy.devdojo.maratonajava.javacore.kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("MaoMao", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Jinshi", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
