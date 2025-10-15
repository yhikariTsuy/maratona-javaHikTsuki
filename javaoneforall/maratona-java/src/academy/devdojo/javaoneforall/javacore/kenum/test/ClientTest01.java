package academy.devdojo.javaoneforall.javacore.kenum.test;

import academy.devdojo.javaoneforall.javacore.kenum.domain.Client;
import academy.devdojo.javaoneforall.javacore.kenum.domain.TypePayment;
import academy.devdojo.javaoneforall.javacore.kenum.domain.TypeClient;


public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("MaoMao", TypeClient.PESSOA_FISICA, TypePayment.CREDITO);
        Client client2 = new Client("Jinshi", TypeClient.PESSOA_JURIDICA, TypePayment.DEBITO);
        System.out.println("Cliente 1: " + client1);
        System.out.println("Cliente 2: " + client2);
        System.out.println();
        System.out.println("Tipos de Pagamentos com Descontos Aplicado:");
        System.out.println("Debito(10%): " + TypePayment.DEBITO.calcularDesconto(100));
        System.out.println("Credito(5%): " + TypePayment.CREDITO.calcularDesconto(100));
        System.out.println();
        TypeClient typeClient = TypeClient.valueOf("PESSOA_FISICA");
        System.out.println(typeClient.getNomeRelatorio());
        TypeClient typeClient2 = TypeClient.TipoClientePorNome("Pessoa Fisica");
        System.out.println(typeClient2);


    }
}
