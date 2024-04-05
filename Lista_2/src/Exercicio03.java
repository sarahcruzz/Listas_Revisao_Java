import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // declaração de variáveis
        int gols_A, gols_B;

        //  criação do objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Digite a quantidade de gols do Time A: ");
        gols_A = scanner.nextInt();

        System.out.print("Digite a quantidade de gols do Time B: ");
        gols_B = scanner.nextInt();

        // processamento
        if (gols_A == gols_B){
            System.out.printf("O resultado do jogo foi empate!" +
                    "\nTime A   %d X %d   Time B", gols_A, gols_B);
        } else if (gols_A > gols_B) {
            System.out.printf("O time A ganhou!" +
                    "\nTime A   %d X %d   Time B", gols_A, gols_B);
        } else {
            System.out.printf("O time B ganhou!" +
                    "\nTime A   %d X %d   Time B", gols_A, gols_B);
        }
    }
}
