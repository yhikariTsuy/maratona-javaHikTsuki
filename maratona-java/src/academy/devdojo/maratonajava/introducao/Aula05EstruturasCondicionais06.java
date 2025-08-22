package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte day = 1;
    // forma simplificada, utilizada apartir do JAVA 14
        String answer = switch (day) {
            case 1, 7 -> ("Fim de Semana");
            case 2, 3, 4, 5, 6 -> ("Dia Útil");
            default -> "Dia Invalido";
        };
        System.out.println(answer);

    // ou
        byte dia = 1;
        String resposta;

        switch (dia) {
            case 1, 7:
                resposta = "Fim de Semana";
                break;
            case 2, 3, 4, 5, 6:
                resposta = "Dia Útil";
                break;
            default:
                resposta = "Dia Invalido";
        };
        System.out.println(resposta);
    }
}
