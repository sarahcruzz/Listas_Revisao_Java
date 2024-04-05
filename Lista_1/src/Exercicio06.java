import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        // declaração de varíaveis
        double nota1, nota2, media_pond, peso1, peso2;

        // criação do objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Digite o valor da 1° nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite o valor da 1° nota: ");
        nota2 = scanner.nextDouble();

        // processamento
        peso1 = (nota1 * 40) / 100;
        peso2 = (nota2 * 60) / 100;

        media_pond = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);

        // saída
        System.out.printf("1° Nota: %.2f" +
                "\n2° Nota: %.2f" +
                "\nMédia Ponderada: %.2f", nota1, nota2, media_pond);


    }
}
