import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //declaração de variáveis
        int numero, sucessor, antecessor;

        // criação do objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        // processamento
        sucessor = numero + 1;
        antecessor = numero - 1;

        // saída
        System.out.printf("Número digitado: %d" +
                "\nAntecessor: %d" +
                "\nSucessor: %d", numero, antecessor, sucessor);
    }
}
