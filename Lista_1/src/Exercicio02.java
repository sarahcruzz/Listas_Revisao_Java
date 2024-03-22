import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // declaração de variáveis
        int num1, num2, soma, subtracao, multiplicacao;
        double divisao, resto, elevado, num1_dec, num2_dec;

        // criação do objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        // entrada
        System.out.print("Digite o 1° número inteiro: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o 2° número inteiro: ");
        num2 = scanner.nextInt();

        // Processamento e saída
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        elevado = Math.pow(num1, num2);

        num1_dec = (double) num1;
        num2_dec = (double) num2;

        if (num2 != 0){
            divisao = num1_dec / num2_dec;
            resto = num1_dec % num2_dec;
            System.out.printf("Soma: %d" +
                    "\nSubtração: %d " +
                    "\nMultiplicação: %d" +
                    "\nElevação: %.2f" +
                    "\nDivisão: %.2f" +
                    "\nResto da Divisão: %.2f", soma, subtracao, multiplicacao, elevado, divisao, resto);
        } else{
            System.out.println("A divisão não pode ser realizada!");
        }

    }
}
