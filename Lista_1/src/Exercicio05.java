import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // declaração de variáveis
        int horas, minutos, segundos, resultado_seg;

        // criação do objeto da classe scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Digite as horas: ");
        horas = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        minutos = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        segundos = scanner.nextInt();

        // processamento
        resultado_seg = (horas * 3600) + (minutos * 60) + segundos;

        // saida
        System.out.printf("O horário em segundos é: %d", resultado_seg);
    }
}
