import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // declaração de variáveis
        int ferias, almoco;
        double valor_final;

        // criação do obejtod a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Onde você pretende passar suas férias? " +
                "\n1 - Maceió" +
                "\n2 - Porto de Galinhas" +
                "\nR: ");
        ferias = scanner.nextInt();

        switch (ferias){
            case 1:
                System.out.print("Gostaria de almoço/janta incluso? " +
                        "\n1 - Sim" +
                        "\n2 - Não" +
                        "\nR: ");
                almoco = scanner.nextInt();

                if (almoco == 1){
                    valor_final = 3000.00 + 3000.00;
                    System.out.printf("Seu destino de viagem é Maceió" +
                            "\nO almoço e janta estão inclusos" +
                            "\nValor final da viagem: R$%.2f", valor_final);
                    break;
                } else {
                    valor_final = 3000.00 + ((3000.00 * 85)/ 100);
                    System.out.printf("Seu destino de viagem é Maceió" +
                            "\nO almoço e janta não estão inclusos" +
                            "\nValor final da viagem: R$%.2f", valor_final);
                    break;
                }

            case 2:
                System.out.print("Gostaria de almoço/janta incluso? " +
                        "\n1 - Sim" +
                        "\n2 - Não" +
                        "\nR: ");
                almoco = scanner.nextInt();

                if (almoco == 1){
                    valor_final = 3000.00 + ((3000.00 * 60) / 100) ;
                    System.out.printf("Seu destino de viagem é Porto de Galinhas" +
                            "\nO almoço e janta estão inclusos" +
                            "\nValor final da viagem: R$%.2f", valor_final);
                    break;
                } else {
                    valor_final = 3000.00 + ((3000.00 * 45) / 100);
                    System.out.printf("Seu destino de viagem é Porto de Galinhas" +
                            "\nO almoço e janta não estão inclusos" +
                            "\nValor final da viagem: R$%.2f", valor_final);
                    break;
                }

        }
    }
}
